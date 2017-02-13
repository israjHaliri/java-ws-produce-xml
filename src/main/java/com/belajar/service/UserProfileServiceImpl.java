/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.service;

import com.belajar.domain.UserProfile;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author israjhaliri
 */
@WebService(endpointInterface = "com.belajar.service.UserProfileService")
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile getUserProfile() {

        UserProfile userProfile = new UserProfile();

        try {
            userProfile.setId("1");
            userProfile.setUsername("israj haliri");
            userProfile.setEmail("israj.haliri@gmail.com");
            userProfile.setAddress("kp. Cidadap Rt 003/02");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userProfile;
    }

    @Override
    public UserProfile getUserProfileById(String id) {
        UserProfile userProfile = new UserProfile();
        try {
            userProfile.setId(id);
            userProfile.setUsername("israj haliri");
            userProfile.setEmail("israj.haliri@gmail.com");
            userProfile.setAddress("kp. Cidadap Rt 003/02");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userProfile;
    }

    @Override
    public UserProfile setUserProfile(
            String id,
            String username,
            String email,
            String address) {

        UserProfile userProfile = new UserProfile();
        try {
            userProfile.setId(id);
            userProfile.setUsername(username);
            userProfile.setEmail(email);
            userProfile.setAddress(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userProfile;
    }

}
