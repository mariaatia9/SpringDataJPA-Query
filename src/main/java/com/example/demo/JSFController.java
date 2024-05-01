/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import com.example.entity.Person;
import com.example.entity.Zitate;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author trainer
 */
@Component(value = "jsfController")
@Data
@Scope(scopeName = "session")
public class JSFController {
    
    
    private List<Person> personen;
    private String query;
    
    @Autowired
   MyDataJPA myDataJPA;
    
    private String txt;

    public JSFController() {
        txt="Hallo Spring Boot JSF";
        personen=new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
     //personen=myDataJPA.takePersonen();
    }
    
     public void generate(){
        Faker f=new Faker(new Locale("de"));
        txt=f.chuckNorris().fact();
        
    }
     
    public void doCreate(){
        Zitate z=new Zitate(txt);
        z.setDate(LocalDateTime.now());
       myDataJPA.createZitat(z);
    } 
    
    public void queryPersonen(){
        personen=myDataJPA.takePersonen(query+"%");
        
    }
    
    
}
