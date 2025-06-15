package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vuelo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Vuelo extends Base{
    @Column(name = "fecha_vuelo")
    private LocalDate fecha;
    @ManyToMany
    @JoinTable(
            name = "vuelo_aeropuerto",
            joinColumns = @JoinColumn(name = "id_vuelo"),
            inverseJoinColumns = @JoinColumn(name = "id_aeropuerto")
    )
    private List<Aeropuerto> aeropuertos = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "id_aerolinea")
    private Aerolinea aerolinea = new Aerolinea();
    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
    private List<Tarifa> tarifas = new ArrayList<>();
}
