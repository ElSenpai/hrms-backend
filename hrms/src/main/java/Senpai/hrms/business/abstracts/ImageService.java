package Senpai.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Image;

public interface ImageService {

	Result upload (int id,MultipartFile file);
	DataResult<Image>getByJobhunter(int jobHunterId);
	DataResult<List<Image>> getAll();
	
}
