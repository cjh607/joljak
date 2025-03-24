package com.example.pratice_back;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control {
    @Autowired
    public service services;
    @GetMapping("/api/data")
    public List<Faculty> data() {
        return services.getfaculty();
                //"dept_map", services.getdeptmap(),

                //"faculty", services.getfaculty(),
                //"major", services.getmajor()

    }
}
