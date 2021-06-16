package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.PostingStatusService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.PostingStatusDao;
import Senpai.hrms.entities.concretes.PostingStatus;
@Service
public class PostingStatusManager implements PostingStatusService {

	private PostingStatusDao postingStatusDao;
	
	@Autowired
	public PostingStatusManager(PostingStatusDao postingStatusDao) {
		super();
		this.postingStatusDao = postingStatusDao;
	}

	@Override
	public Result add(PostingStatus status) {
		this.postingStatusDao.save(status);
		return new SuccessResult("Status added");
	}

	@Override
	public DataResult<List<PostingStatus>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<PostingStatus>>(this.postingStatusDao.findAll());
	}

}
