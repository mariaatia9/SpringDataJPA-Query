/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo;

import com.example.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author trainer
 */
public interface PersonRepository extends JpaRepository<Person, Integer>{
    
    @Query(value = "Select p From Person as p where p.firstname like :name")
    public List<Person> findByName(String name);
    
}
