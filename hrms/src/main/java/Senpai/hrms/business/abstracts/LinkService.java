package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Link;

public interface LinkService {

	Result add(Link link);
	DataResult<List<Link>> getAll();
	DataResult<List<Link>>getByJobhunter(int jobHunterId);
}
