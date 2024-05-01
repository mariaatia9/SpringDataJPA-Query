/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import com.example.entity.Person;
import com.example.entity.Zitate;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trainer
 */
@Service
public class MyDataJPA {
    
    @Autowired
    ZitatRepository zitatRepository;
    
    @Autowired
    PersonRepository personRepository;
    
    
    public void createZitat(Zitate z){
        zitatRepository.save(z);
    }
    
    
    public List<Person> createPersonen(){
        List<Person> lp=new ArrayList<>();
          Faker f = new Faker();
        for (int i = 1; i < 10; i++) {
            Person p = new Person(f.address().firstName(), f.address().lastName());
            personRepository.save(p);
            lp.add(p);
        }
        return lp;
    }    
    
    public List<Person> takePersonen(String sql){
        return personRepository.findByName(sql);
    }
    
}
