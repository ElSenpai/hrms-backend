package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.LanguageService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.LanguageDao;
import Senpai.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languagedao;
	@Autowired
	public LanguageManager(LanguageDao languagedao) {
		super();
		this.languagedao = languagedao;
	}

	@Override
	public Result add(Language lang) {
		this.languagedao.save(lang);
		return new SuccessResult("Language added");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languagedao.findAll(),"languages listed");
	}
}
