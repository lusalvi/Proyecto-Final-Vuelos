package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "aerolinea")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Aerolinea extends Base{
    @Column(name = "nombre")
    private String nombreAerolinea;
}
