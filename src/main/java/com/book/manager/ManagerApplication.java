package com.book.manager;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableSwaggerBootstrapUI
@EnableJpaRepositories
@SpringBootApplication
@Slf4j
public class ManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
		log.info("| ---------------------------------------------------------------------------------- |");
		log.info("|                                    Started Success                                 |");
		log.info("| ---------------------------------------------------------------------------------- |");
		System.out.println("\"a\" = " + "a");
	}

}
