package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarifa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarifa extends Base {
    @Column(name = "impuesto_tarifa")
    private int impuestoTarifa;
    @Column(name = "precio_tarifa")
    private int precioTarifa;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "clase_tarifa")
    private Clase claseTarifa;
    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private Vuelo vuelo;
}
