package JacopoDeMaio.Spring_Web_2.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogPost {


    private long id;

    private String categoria;

    private String titolo;

    private String cover;

    private String contenuto;

    private int tempoDiLettura;

    public BlogPost(String categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
