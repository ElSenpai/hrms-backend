package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.CityService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.dataAccess.abstracts.CityDao;
import Senpai.hrms.entities.concretes.City;
@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
   @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"All City Listed!");
	}
}
