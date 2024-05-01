/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class Zitate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int zitatId;
    
    private String zitat;
    
    private LocalDateTime date;

    public Zitate() {
        date=LocalDateTime.now();
    }

    
    
    public Zitate(String zitat) {
        this.zitat = zitat;
    }
    
    
    
    
}
