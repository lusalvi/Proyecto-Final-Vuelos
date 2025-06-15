package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "reserva")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Reserva extends Base{
    @OneToOne
    @JoinColumn(name = "id_vuelo")
    private Vuelo vueloReservado;
    @OneToOne
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjeta;
}
