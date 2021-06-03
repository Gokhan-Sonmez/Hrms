package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Language;

public interface LanguageService {

	
	    DataResult<List<Language>> getAll();
	    DataResult<Language> getById(int id);

	    Result add(Language language);
	
}
