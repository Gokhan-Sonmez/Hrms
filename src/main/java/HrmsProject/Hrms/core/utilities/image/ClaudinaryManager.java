package HrmsProject.Hrms.core.utilities.image;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import HrmsProject.Hrms.core.services.ImageService;
import HrmsProject.Hrms.core.utilities.results.DataResult;

import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;

public class ClaudinaryManager implements ImageService {

	Cloudinary cloudinary;
	private Map<String,String> valuesMap = new HashMap<>();
	
	public ClaudinaryManager() {
		valuesMap.put("cloud_name", "dbcwoqvay");
		valuesMap.put("api_key", "598635774388618");
		valuesMap.put("api_secret", "fdZL14Gd4ihVnGKjkv6K2UOvxFM");
		
		cloudinary = new Cloudinary(valuesMap);
	}
	
	@Override
	public DataResult<?> upload(MultipartFile multipartFile) throws IOException {
		
		var result = this.cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
        return new SuccessDataResult<>(result);
	}

	@Override
	public DataResult<?> delete(String id) throws IOException {
		var result = this.cloudinary.uploader().upload(id, ObjectUtils.emptyMap());
        return new SuccessDataResult<>(result);
	}
	
	

}
