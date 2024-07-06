package com.example.demo.Respo;

import com.example.demo.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Model,Long> {

}
