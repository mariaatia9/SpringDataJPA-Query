/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo;

import com.example.entity.Zitate;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author trainer
 */
public interface ZitatRepository extends JpaRepository<Zitate,Integer> {
    
}
