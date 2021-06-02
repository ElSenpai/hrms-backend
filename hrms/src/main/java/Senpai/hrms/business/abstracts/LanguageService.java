package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Language;

public interface LanguageService {

	Result add(Language lang);
	DataResult<List<Language>> getAll();
}
