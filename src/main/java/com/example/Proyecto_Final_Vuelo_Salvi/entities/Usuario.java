package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;
    @Column(name = "correoElectronicoUsuario")
    private String correoElectronicoUsuario;
    @Column(name = "contrasenia")
    private String contrasenia;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Tarjeta> tarjetas = new ArrayList<>();
}
