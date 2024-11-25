package com.example.study_org_server.controller.user;

import com.example.study_org_server.controller.ApiApi;
import org.openapitools.example.model.LoginUserForm;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserController implements ApiApi {
    @Override
    public ResponseEntity<Void> apiUserLoginPost(LoginUserForm loginUserForm) {
        return ResponseEntity.status(200).build();
    }
}
