package com.example.demo.Controller;

import com.example.demo.Model.Model;
import com.example.demo.Respo.Repo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class Controllerd {

    @Autowired
    private Repo repo;

    @GetMapping
    public List<Model> data() {
        return repo.findAll();
    }

    @PostMapping
    public Model datacall(@Valid @NotNull @RequestBody Model model) {
        if (model.getPhoneNo() != null && model.getPhoneNo().startsWith("+")) {
            model.setPhoneNo(model.getPhoneNo().substring(1));
        }
        return repo.save(model);
    }

    @PostMapping("/changePlusIcon")
    public boolean changePlusIcon(@RequestBody Model model) {
        if (model.getPhoneNo() != null && model.getPhoneNo().startsWith("+")) {
            model.setPhoneNo(model.getPhoneNo().substring(1));
            repo.save(model); // Save the updated model
            return true;
        }
        return false;
    }
}
