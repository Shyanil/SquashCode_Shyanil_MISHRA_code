package com.example.demo.Service;

import com.example.demo.Respo.Repo;
import com.example.demo.Model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {

    @Autowired
    private Repo repo;

    public List<Model> getAllModels() {
        return repo.findAll();
    }

    public Model saveModel(Model model) {
        return repo.save(model);
    }

    public boolean changePlusIcon(Model model) {
        if (model.getPhoneNo() != null && model.getPhoneNo().startsWith("+")) {
            model.setPhoneNo(model.getPhoneNo().substring(1)); // Remove the '+'
            repo.save(model); // Save the updated model
            return true;
        }
        return false;
    }
}
