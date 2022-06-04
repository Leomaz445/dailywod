package com.example.dailywod.controller;

import com.example.dailywod.Workout;
import com.example.dailywod.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/workout")
public class WorkoutController {
    WorkoutService workoutService;

    @Autowired
    public WorkoutController(WorkoutService workoutService){
        this.workoutService=workoutService;
    }

    @GetMapping
    public List<Workout> getAllWorkouts(){
        return workoutService.getAllWorkouts();
    }
    @PostMapping
    public void addWorkout(@RequestBody Workout workout){
        workoutService.addWorkout(workout);
    }
    @DeleteMapping(path ="{workoutId}")
    public void deleteWorkout(@PathVariable Long workoutId){
        workoutService.deleteWorkout(workoutId);
    }
    @PutMapping(path = "{workoutId}")
    public void updateWorkout(@PathVariable Long workoutId,@RequestParam String description){
        workoutService.updateWorkout(workoutId,description);
    }


}
