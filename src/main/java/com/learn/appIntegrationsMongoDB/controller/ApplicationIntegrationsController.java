package com.learn.appIntegrationsMongoDB.controller;

import com.learn.appIntegrationsMongoDB.service.ApplicationIntegrationsService;
import com.learn.appIntegrationsMongoDB.entity.ApplicationIntegrationsEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/AppInt")
public class ApplicationIntegrationsController {

    @Autowired
    private ApplicationIntegrationsService applicationIntegrationsService;



    @GetMapping( "/application/{id}")
    public Optional<ApplicationIntegrationsEntity> findApplication(@PathVariable("id") String id) {

        return applicationIntegrationsService.findApplication(id);

    }

    @PostMapping("/save")
    public ApplicationIntegrationsEntity save(@RequestBody ApplicationIntegrationsEntity applicationIntegrationsEntity){
        return applicationIntegrationsService.save(applicationIntegrationsEntity);
    }

    @PutMapping("/update")
    public ApplicationIntegrationsEntity update(@RequestBody ApplicationIntegrationsEntity applicationIntegrationsEntity ){
        return applicationIntegrationsService.update(applicationIntegrationsEntity);
    }

    @GetMapping("/all")
    public List<ApplicationIntegrationsEntity> listApplications(){
        return applicationIntegrationsService.listApplications();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteApplication(@PathVariable("id") String id) {
        applicationIntegrationsService.deleteApplication(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllApps() {
        applicationIntegrationsService.deleteAllApps();
    }
}