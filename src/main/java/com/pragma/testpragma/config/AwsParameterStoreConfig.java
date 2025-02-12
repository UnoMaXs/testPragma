package com.pragma.testpragma.config;

import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;


@Configuration
public class AwsParameterStoreConfig {

    private final SsmClient ssmClient;

    public AwsParameterStoreConfig() {
        this.ssmClient = SsmClient.builder()
                .region(Region.US_EAST_2)
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();
    }

}
