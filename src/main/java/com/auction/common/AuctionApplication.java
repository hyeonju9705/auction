package com.auction.common;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class AuctionApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = run(AuctionApplication.class, args); // 애플리케이션 메인 클래스 실행
        // PostgreSQLRunner를 직접 실행하려는 경우
        PostgreSQLRunner postgreSQLRunner = context.getBean(PostgreSQLRunner.class);
        postgreSQLRunner.run(null); // 또는 필요한 ApplicationArguments 객체를 전달
    }

}
