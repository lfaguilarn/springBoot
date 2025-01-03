package com.example.provinciaSelector;

import com.example.provinciaSelector.util.SSLUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvinciaSelectorApplication {
    public static void main(String[] args) {
        SSLUtil.disableSSLValidation();
        SpringApplication.run(ProvinciaSelectorApplication.class, args);
    }
}
