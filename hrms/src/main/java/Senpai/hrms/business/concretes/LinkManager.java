package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.LinkService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.LinkDao;
import Senpai.hrms.entities.concretes.Link;

@Service
public class LinkManager implements LinkService {

	private LinkDao linkdao;
	
	@Autowired
	public LinkManager(LinkDao linkdao) {
		super();
		this.linkdao = linkdao;
	}

	@Override
	public Result add(Link link) {
		this.linkdao.save(link);
		return new SuccessResult("link added!");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Link>>(this.linkdao.findAll(),"Links listed");
	}

}
