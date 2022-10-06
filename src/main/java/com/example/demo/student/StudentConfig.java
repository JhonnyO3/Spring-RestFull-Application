package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Jhonatas = new Student(

                    "Jhonatas",
                    "jhonatas2004@gmail.com",

                    LocalDate.of(2004, Month.APRIL, 26)


            );
            Student Lucas =new Student(

                    "Lucas",
                    "Lucas2004@gmail.com",

                    LocalDate.of(1990, Month.APRIL, 16)


            );
//            Student Fernando = new Student(
//                    3L,
//                    "Fernando",
//                    "Fernando2004@gmail.com",
//                    21,
//                    LocalDate.of(2001, Month.APRIL, 30)
//
//
//            );
            repository.saveAll(
                    List.of(Jhonatas, Lucas)
            );

        };
    }
}
