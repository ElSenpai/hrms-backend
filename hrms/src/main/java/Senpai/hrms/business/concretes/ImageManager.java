package Senpai.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Senpai.hrms.business.abstracts.ImageService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.core.utilities.uploads.ImageHelper;
import Senpai.hrms.core.utilities.uploads.ImageUploadService;
import Senpai.hrms.dataAccess.abstracts.ImageDao;
import Senpai.hrms.entities.concretes.Image;
import Senpai.hrms.entities.concretes.JobHunter;

@Service
public class ImageManager implements ImageService {

	private ImageDao imagedao;
	private ImageUploadService helper;

	@Autowired
	public ImageManager(ImageDao imagedao,ImageHelper helper) {
		super();
		this.imagedao = imagedao;
		this.helper=helper;
	}

	
	@Override
	public Result upload(int id,MultipartFile file) {
		
		@SuppressWarnings("unchecked")
		Map<String,String> hey=(Map<String,String>)this.helper.upload(file).getData();
		
		JobHunter hunter=new JobHunter();
		Image image =new Image();
		hunter.setUserId(id);
		image.setJobhunter(hunter);
		
		 image.setUrl(hey.get("url"));
		 image.setUpdateDate(LocalDate.now());
		
	
		this.imagedao.save(image);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
