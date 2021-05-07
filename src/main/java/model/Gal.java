package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "gal")
public class Gal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "path")
    private String path;
    @Column(name = "cost")
    private Double cost;
    @Column(name = "active")
    private int active;

    @Override
    public String toString() {
        return title;
    }
}
