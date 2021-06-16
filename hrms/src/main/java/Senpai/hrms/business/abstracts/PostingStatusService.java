package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.PostingStatus;

public interface PostingStatusService {
	
	Result add(PostingStatus status);
	
	DataResult<List<PostingStatus>> getAll();

}
