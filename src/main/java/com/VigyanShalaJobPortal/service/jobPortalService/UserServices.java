package com.VigyanShalaJobPortal.service.jobPortalService;

//import com.vigyanshaala.entity.user.UserRole;
//import com.vigyanshaala.response.Response;
import com.VigyanShalaJobPortal.entity.user.UserRole;
import com.VigyanShalaJobPortal.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface UserServices {
    ResponseEntity getUserInfo( String email);
    Response addUserRole(UserRole userRole);
    Response uploadUserFile(MultipartFile file) throws IOException;

}
