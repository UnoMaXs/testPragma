package com.pragma.testpragma.configuration;

import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.GetParameterRequest;
import software.amazon.awssdk.services.ssm.model.GetParameterResponse;


@Configuration
public class AwsParameterStoreConfig {

    private final SsmClient ssmClient;

    public AwsParameterStoreConfig() {
        this.ssmClient = SsmClient.builder()
                .region(Region.US_EAST_2)
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();
    }

    private String getParameterValue(String parameterName) {
        GetParameterRequest request = GetParameterRequest.builder()
                .name(parameterName)
                .withDecryption(true)
                .build();

        GetParameterResponse response = ssmClient.getParameter(request);
        return response.parameter().value();
    }



}
