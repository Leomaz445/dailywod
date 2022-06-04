package com.example.dailywod.service;

import com.example.dailywod.Workout;
import com.example.dailywod.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkoutService {

    WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository){
        this.workoutRepository=workoutRepository;
    }

    public List<Workout> getAllWorkouts(){
            return workoutRepository.findAll();
    }

    public void addWorkout(Workout workout) {
        workoutRepository.save(workout);
        System.out.println("Added");
    }

    public void deleteWorkout(Long id) {
        boolean existsById = workoutRepository.existsById(id);
        if(!existsById) {
            throw new IllegalArgumentException(" NOT VALID ID");
        }
        workoutRepository.deleteById(id);
    }
    @Transactional
    public void updateWorkout(Long id,String description) {
        Workout workout = workoutRepository.findById(id).orElseThrow(()-> new IllegalStateException("not valid id"));
        workout.setDescription(description);
    }

}
