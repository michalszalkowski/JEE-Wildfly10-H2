package pl.btbw.module.post;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    public Post() {
    }

    public Post(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
