package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
