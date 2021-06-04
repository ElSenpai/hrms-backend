# HRMS Project


## Database Diagram [script](https://github.com/ElSenpai/HRMS_Java/blob/master/hrms.sql)

![some](https://github.com/ElSenpai/HRMS_Java/blob/master/diagram.png)


### ImageHelper  

Add dependency in pom.xml (If nothing happened after saving , right click project Maven>Update Project)

```html
<dependency>
        <groupId>com.cloudinary</groupId>
        <artifactId>cloudinary-http44</artifactId>
        <version>1.29.0</version>
    </dependency>
```
after register   [Cloudinary](https://cloudinary.com/documentation/java_integration) get your cloud name, api key and api secret .
![some](https://github.com/ElSenpai/practice/blob/main/html/img/api.png)
```Java
// imports
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
@Service
public class ClassName implements ClassNameService { 

public DataResult<Map> upload(MultipartFile file){
 Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
          	"cloud_name", "my_cloud_name",
       	"api_key", "my_api_key",
	"api_secret", "my_api_secret"));

try {
			
Map uploadResult= cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());
				
return new SuccessDataResult<Map>(uploadResult);
} catch (IOException e) {
				
e.printStackTrace();
}
return new ErrorDataResult<Map>();
}
```

you can insert into contructor like below
```Java
private Cloudinary cloudinary;
	
	public ClassName() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "my_cloud_name",
				"api_key", "my_api_key",
				"api_secret", "my_api_secret"));
	}
```
Now u can get url from Upload() method;  
```Java
Map<String,String> imageMap=(Map<String,String>)this.classNameService.upload(file).getData();
String url = imageMap.get("url);
```
[El Senpai](https://github.com/ElSenpai/)

