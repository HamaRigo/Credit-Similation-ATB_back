package dev.atb.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ocrs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ocrs {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    private String typeDocument;

    @Column(nullable = false)
    private String resultatsReconnaissance;

    private boolean fraude;

    @Lob
    private String image; // Storing image data as a Base64 encoded string

    @JsonIgnoreProperties("ocrs")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "numeroCompte")
    private Compte numeroCompte;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getResultatsReconnaissance() {
        return resultatsReconnaissance;
    }

    public void setResultatsReconnaissance(String resultatsReconnaissance) {
        this.resultatsReconnaissance = resultatsReconnaissance;
    }

    public boolean isFraude() {
        return fraude;
    }

    public void setFraude(boolean fraude) {
        this.fraude = fraude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Compte getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Compte numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}
