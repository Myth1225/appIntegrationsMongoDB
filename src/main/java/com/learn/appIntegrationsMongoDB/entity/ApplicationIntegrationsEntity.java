package com.learn.appIntegrationsMongoDB.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor

@Document(collection = "apps")
public class ApplicationIntegrationsEntity {

    @Id
    private String id;

    @Field(value = "app_name")
    private String name;

    @Field(value="application_id")
    private long appId;

    @Field(value="integratedapps")
    private List<String> integratedapps;



}
