package Senpai.hrms.core.utilities.uploads;


import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.ErrorDataResult;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
@Service
public class ImageHelper implements ImageUploadService {

	 
	
	
	
	
	public DataResult<Map> upload(MultipartFile file){
		
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "elsenpai",
				"api_key", "139844714596837",
				"api_secret", "TWapBEwHu5C85I6tr6TdeTXnzBI"));
		
		
		 
			try {
			
			
			Map uploadResult= cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());
				
				return new SuccessDataResult<Map>(uploadResult);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ErrorDataResult<Map>();
					
	}
	
}
