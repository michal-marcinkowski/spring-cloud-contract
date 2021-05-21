package dev.cloudility.cdc.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pets")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String name;
    int age;

}
