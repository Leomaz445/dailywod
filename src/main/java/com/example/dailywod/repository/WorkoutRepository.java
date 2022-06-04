package com.example.dailywod.repository;

import com.example.dailywod.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {

}
