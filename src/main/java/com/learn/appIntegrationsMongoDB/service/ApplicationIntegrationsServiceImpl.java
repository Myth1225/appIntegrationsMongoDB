package com.learn.appIntegrationsMongoDB.service;

import com.learn.appIntegrationsMongoDB.entity.ApplicationIntegrationsEntity;
import com.learn.appIntegrationsMongoDB.repository.ApplicationIntegrationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ApplicationIntegrationsServiceImpl  implements ApplicationIntegrationsService {
    @Autowired
    private ApplicationIntegrationsRepository applicationIntegrationsRepository;


    public List<ApplicationIntegrationsEntity> listApplications() {
        return applicationIntegrationsRepository.findAll();
    }


    public Optional<ApplicationIntegrationsEntity> findApplication(String id) {
        return applicationIntegrationsRepository.findById(id);
    }


    public ApplicationIntegrationsEntity save(ApplicationIntegrationsEntity applicationIntegrationsEntity){
        return applicationIntegrationsRepository.save(applicationIntegrationsEntity);
    }

    public ApplicationIntegrationsEntity update(ApplicationIntegrationsEntity applicationIntegrationsEntity){
        return applicationIntegrationsRepository.save(applicationIntegrationsEntity);
    }

    public void deleteApplication( String id ){
        applicationIntegrationsRepository.deleteById(id);
    }

    public void deleteAllApps(){
        applicationIntegrationsRepository.deleteAll();
    }



}