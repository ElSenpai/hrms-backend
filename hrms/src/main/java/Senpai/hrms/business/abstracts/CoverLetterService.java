package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {

     Result add(CoverLetter letter);
    DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId);
	DataResult<List<CoverLetter>> getAll();
}
