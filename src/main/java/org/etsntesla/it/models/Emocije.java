package org.etsntesla.it.models;
import jakarta.persistence.*;


@Entity
@Table(name="emocije")
public class Emocije {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Vrsta_emocije")
    @Enumerated(value=EnumType.STRING)
    private VrstaEmocije vrstaEmocije;

    @Column(name = "Poruka")
    private String poruka;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VrstaEmocije getVrstaEmocije() {
        return vrstaEmocije;
    }

    public void setVrstaEmocije(VrstaEmocije vrstaEmocije) {
        this.vrstaEmocije = vrstaEmocije;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
}
