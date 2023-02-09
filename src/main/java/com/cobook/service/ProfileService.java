package com.cobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cobook.entity.Profile;
import com.cobook.repo.ProfileRepo;



@Service
public class ProfileService {

    @Autowired
    ProfileRepo profileRepo;

    public Profile createProfile( Profile profile){
        return profileRepo.save(profile);
    }

   public Profile updateProfile(Profile profile){

        return profileRepo.save(profile);

   }
    
    
}
