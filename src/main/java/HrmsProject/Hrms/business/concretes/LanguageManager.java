package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.LanguageService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.LanguageDao;
import HrmsProject.Hrms.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(languageDao.findAll(),"Diller listelendi");
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(languageDao.findById(id).get(),"Diller listelendi");
	}

	@Override
	public Result add(Language language) {
		languageDao.save(language);
		return new SuccessResult("Başarıyla eklendi");
	}

}
