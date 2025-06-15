package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "ciudad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Ciudad extends Base {
    @Column(name = "nombre")
    private String nombreCiudad;
}
