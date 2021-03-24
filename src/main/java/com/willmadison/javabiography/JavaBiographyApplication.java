package com.willmadison.javabiography;

import com.willmadison.javabiography.beans.Bulletpoint;
import com.willmadison.javabiography.beans.Java;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class JavaBiographyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBiographyApplication.class, args);
    }

    @Bean
    public CommandLineRunner cli(ApplicationContext ctx) {
        return args -> {
            Scanner scanner = new Scanner(System.in);
            Java java = ctx.getBean(Java.class);

            for (Bulletpoint bp : java.biography()) {
                System.out.println(bp);

                try {
                    String line = scanner.nextLine();
                    if ("quit".equalsIgnoreCase(line)) {
                        break;
                    }
                } catch (Exception ignore) {}
            }

            ((ConfigurableApplicationContext) ctx).close();
            System.exit(0);
        };
    }
}
