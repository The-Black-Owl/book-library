package api.library.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorID;
    private String firstName;
    private String lastName;
    private int age;
    public Author(String firstName, String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
    }
}
