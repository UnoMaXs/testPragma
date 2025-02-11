package com.pragma.testpragma.config;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CognitoSecretHash {
    public static String calculateSecretHash(String clientId, String clientSecret, String username) throws Exception {
        String message = username + clientId;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(clientSecret.getBytes(), "HmacSHA256"));
        return Base64.getEncoder().encodeToString(mac.doFinal(message.getBytes()));
    }

    public static void main(String[] args) throws Exception {
        String clientId = "7c36pkjl74bpug9tfiatd9p4mb";
        String clientSecret = "14oap94vma11gnbdk0bljf6s6dq4jqrj1dvl3o9nvt80er0js9d5";
        String username = "pieraiken202@hotmail.com";
        String secretHash = calculateSecretHash(clientId, clientSecret, username);
        System.out.println("SECRET_HASH: " + secretHash);
    }
}
