package HrmsProject.Hrms.business.concretes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import HrmsProject.Hrms.business.abstracts.ResumeService;
import HrmsProject.Hrms.core.services.ImageService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.ErrorResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.ResumeDao;

import HrmsProject.Hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	private  ImageService imageService;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao,ImageService imageService) {
		this.imageService = imageService;
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(resumeDao.findAll(),"cv listelendi");
	}

	@Override
	public DataResult<Resume> getById(int id) {
		return new SuccessDataResult<Resume>(resumeDao.findById(id).get(),"cv listelendi");
		
	}

	@Override
	public DataResult<List<Resume>> getByCandidate_Id(int id) {
		return new SuccessDataResult<List<Resume>>(resumeDao.getByCandidateUser(id),"cv listelendi");
	}

	@Override
	public Result add(Resume resume) {
		resumeDao.save(resume);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public Result addImage(MultipartFile multipartFile, int id) throws IOException {
		 var resume = this.getById(id);
	        if (!resume.isSuccess()) return resume;

	        var imageAddResult = this.imageService.upload(multipartFile);
	        if (!imageAddResult.isSuccess()) return new ErrorResult("Resim eklenmedi");

	        var currentResume = resume.getData();
	        Map<String, String> newImageResult = (Map<String, String>) imageAddResult.getData();

	        currentResume.setPhoto((newImageResult.get("url")));
	        var updateResume = this.update(currentResume);
	        if (!updateResume.isSuccess()) return new ErrorResult("Resim özgeçmişe eklenemedi");

	        return new SuccessResult("Resim Güncellendi");
	}

	@Override
	public Result update(Resume resume) {
		resumeDao.save(resume);
		return new SuccessResult("Başarıyla güncellendi");
	}

}
