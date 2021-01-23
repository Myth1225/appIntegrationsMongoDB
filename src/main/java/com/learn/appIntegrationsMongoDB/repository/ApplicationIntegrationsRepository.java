package com.learn.appIntegrationsMongoDB.repository;

import com.learn.appIntegrationsMongoDB.entity.ApplicationIntegrationsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationIntegrationsRepository extends
        MongoRepository <ApplicationIntegrationsEntity, String> {

}



