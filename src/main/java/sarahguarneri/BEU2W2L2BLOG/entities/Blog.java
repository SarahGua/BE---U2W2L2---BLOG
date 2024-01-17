package sarahguarneri.BEU2W2L2BLOG.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int minutiLettura;
    @ManyToOne
    @JoinColumn(name = "autore_id")
    private Author autore;

}
