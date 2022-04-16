package com.subject_fame.subject_fame_web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class SubjectFameWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectFameWebApplication.class, args);
        log.info("SubjectFameWebApplication服务已启动，启动端口为：{}","9000");
    }

}
