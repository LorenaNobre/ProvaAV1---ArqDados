package com.exemplo.provaav1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String url;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
