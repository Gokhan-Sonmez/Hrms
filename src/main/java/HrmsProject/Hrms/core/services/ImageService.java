package HrmsProject.Hrms.core.services;

import java.io.IOException;



import org.springframework.web.multipart.MultipartFile;

import HrmsProject.Hrms.core.utilities.results.DataResult;

public interface ImageService {
	
	DataResult<?> upload(MultipartFile multipartFile) throws IOException;
	DataResult<?> delete(String id) throws IOException;

}
