package com.learn.appIntegrationsMongoDB.service;

import com.learn.appIntegrationsMongoDB.entity.ApplicationIntegrationsEntity;
import java.util.List;
import java.util.Optional;



public interface  ApplicationIntegrationsService {
    List<ApplicationIntegrationsEntity> listApplications();

    Optional<ApplicationIntegrationsEntity> findApplication(String id);

    ApplicationIntegrationsEntity save(ApplicationIntegrationsEntity applicationIntegrationsEntity);

    ApplicationIntegrationsEntity update(ApplicationIntegrationsEntity applicationIntegrationsEntity);

    void deleteApplication( String id );

    void deleteAllApps();

}
