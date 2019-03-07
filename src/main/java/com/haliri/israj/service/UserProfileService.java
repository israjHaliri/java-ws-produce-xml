/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haliri.israj.service;

import com.haliri.israj.domain.UserProfile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author israjhaliri
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface UserProfileService {

    @WebMethod
    UserProfile getUserProfile();

    @WebMethod
    UserProfile getUserProfileById(@WebParam(name = "id") String id);

    @WebMethod
    UserProfile setUserProfile(
            @WebParam(name = "id") String id,
            @WebParam(name = "username") String username,
            @WebParam(name = "email") String email,
            @WebParam(name = "address") String address);

}
