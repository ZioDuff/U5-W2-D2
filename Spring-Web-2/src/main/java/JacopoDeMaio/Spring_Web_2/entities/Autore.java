package JacopoDeMaio.Spring_Web_2.entities;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Autore {

    private long id;

    private String nome;

    private String cognome;

    private String email;

    private LocalDate dataDiNascita;

    private String avatar;


    public Autore(String nome, String cognome, String email, LocalDate dataDiNascita, String avatar) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = avatar;
    }
}
