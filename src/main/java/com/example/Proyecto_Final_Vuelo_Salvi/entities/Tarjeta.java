package com.example.Proyecto_Final_Vuelo_Salvi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarjeta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarjeta extends Base {
    @Column(name = "cantidadPago")
    private int cantidadPago;
    @Column(name = "numeroTarjeta")
    private Long numeroTarjeta;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "TipoTarjeta")
    private TipoTarjeta tipoTarjeta;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
