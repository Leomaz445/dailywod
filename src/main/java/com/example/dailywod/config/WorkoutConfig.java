package com.example.dailywod.config;

import com.example.dailywod.Workout;
import com.example.dailywod.repository.WorkoutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class WorkoutConfig {

    @Bean
    CommandLineRunner commandLineRunner(WorkoutRepository workoutRepository){
        return args ->{
            Workout workoutOne = new Workout(LocalDate.now(), "CoachLeo", "AMRAP", "" +
                    "3 Rounds","http://wwww.google.com");

            Workout workoutTwo = new Workout(LocalDate.now(), "CoachMiron", "AMRAP", "" +
                    "15 Pushups", "http://wwww.google.com");

            workoutRepository.saveAll(List.of(workoutOne,workoutTwo));
        };
    }
}
