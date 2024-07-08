package aligh.crud_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user") // Corrected table name
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
}
