package com.amazingcode.in.example.visa.external.ssl;

import jakarta.ws.rs.Produces;
import javax.net.ssl.SSLContext;
import java.io.FileInputStream;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SSLContextProducer {

    private static final String KEYSTORE_PATH = "add keystore path";
    private static final String KEYSTORE_PASSWORD = "add keystore password";

    @Produces
    public SSLContext produceSSLContext() {
        try {
            // Load the keystore
            KeyStore keyStore = KeyStore.getInstance("JKS");
            try (FileInputStream keyStoreStream = new FileInputStream(KEYSTORE_PATH)) {
                keyStore.load(keyStoreStream, KEYSTORE_PASSWORD.toCharArray());
            }

            // Create key and trust managers
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
            keyManagerFactory.init(keyStore, KEYSTORE_PASSWORD.toCharArray());

            // Initialize SSL context
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(keyManagerFactory.getKeyManagers(), null, null);

            return sslContext;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create SSLContext", e);
        }
    }
}
