package HrmsProject.Hrms.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Resume;

public interface ResumeService {

	DataResult<List<Resume>> getAll();
    DataResult<Resume> getById(int id);
	DataResult<List<Resume>> getByCandidate_Id(int id);
	
	
	Result add(Resume resume);
    Result addImage(MultipartFile multipartFile, int id) throws IOException;
    Result update(Resume resume);
}
