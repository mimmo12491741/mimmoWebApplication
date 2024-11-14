package com.dipartimento.demowebapplications.model;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Piatto {

    protected String nome;
    private String ingredienti;
    private List<Ristorante> ristoranti; //Aggiunto per l'implementazione del molti a molti

    public Piatto(String nome, String ingredienti) {
        this.nome = nome;
        this.ingredienti = ingredienti;
    }

}
