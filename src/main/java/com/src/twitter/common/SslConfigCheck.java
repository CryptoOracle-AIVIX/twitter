package com.src.twitter.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SslConfigCheck implements CommandLineRunner {

    @Value("${server.ssl.key-store:NOT_FOUND}")
    private String keystorePath;

    @Override
    public void run(String... args) {
        System.out.println("🔥 SSL KeyStore Path: " + keystorePath);
    }
}
