package com.study.spring.datasource;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
@RequiredArgsConstructor
public class DatasourceApplication implements CommandLineRunner {

    private final DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(DatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println(dataSource.toString());
    }
}
