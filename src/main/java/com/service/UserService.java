package com.service;

import com.yrrhelp.grpc.User;
import com.yrrhelp.grpc.User.APIResponse;
import com.yrrhelp.grpc.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class UserService extends userImplBase {


    @Override
    public void login(User.LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        System.out.println("Inside LogIN");
        String username = request.getUsername();
        String password = request.getPassword();

        APIResponse.Builder response = APIResponse.newBuilder();

        if(username.equals(password)){
            //return success message
            response.setResponseCode(String.valueOf(200)).setResponseMessage("SUCCESS");
        }
        else{
            // return failure message
            response.setResponseCode(String.valueOf(400)).setResponseMessage("FAILURE");
        }
    }

    @Override
    public void logout(User.Empty request, StreamObserver<APIResponse> responseObserver) {

    }
}
