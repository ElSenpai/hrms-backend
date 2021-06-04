package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.CoverLetterService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.CoverLetterDao;
import Senpai.hrms.entities.concretes.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverLetterdao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterdao) {
		super();
		this.coverLetterdao = coverLetterdao;
	}

	@Override
	public Result add(CoverLetter letter) {
		this.coverLetterdao.save(letter);
		return new SuccessResult("letter added");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterdao.findAll(),"letters listed");
	}

	@Override
	public DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterdao.getByJobhunter_userId(jobHunterId));
	}
	
}
