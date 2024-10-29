package com.amazingcode.in.example.visa.external.ssl;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import com.amazingcode.in.example.visa.external.client.VisaServiceClient;

import javax.net.ssl.SSLContext;
import java.net.URI;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

public class ClientBuilderUtil {

    private ClientBuilderUtil() {
    }

    private static final String BASE_URI = "https://sandbox.api.visa.com";

    // Example credentials - Replace with actual values
    private static final String USER_ID = "add here user id";
    private static final String PASSWORD = "add here password";

    public static VisaServiceClient createVisaServiceClient(SSLContext sslContext) {
        return RestClientBuilder.newBuilder()
                .baseUri(URI.create(BASE_URI))
                // .property("microprofile.rest.client.disable.ssl.verification", true)
                .sslContext(sslContext)
                .register(new AuthRequestFilter(USER_ID, PASSWORD)) // Register the custom filter here
                .build(VisaServiceClient.class);
    }

    // Inner class implementing ClientRequestFilter to add Authorization header
    private static class AuthRequestFilter implements ClientRequestFilter {
        private final String encodedAuth;

        public AuthRequestFilter(String userId, String password) {
            String auth = userId + ":" + password;
            this.encodedAuth = "Basic " + Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));
        }

        @Override
        public void filter(ClientRequestContext requestContext) throws IOException {
            requestContext.getHeaders().add("Authorization", encodedAuth);
        }
    }
}