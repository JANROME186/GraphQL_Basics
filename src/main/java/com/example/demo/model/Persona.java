package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Data
@EqualsAndHashCode
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column
    private String apPat;

    @Column
    private String apMat;

    @Column
    private LocalDate fechaNacimiento;
}
