/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kwizera.ibrahim.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 *
 * @author Ibrahim
 */

@Entity
@Data
@NoArgsConstructor
@Table(name="provinces")
public class Province implements Serializable {
  @Id 
  private Long id;
  @Column(name="name", nullable=false, length=20)
  private String name;
    
}
