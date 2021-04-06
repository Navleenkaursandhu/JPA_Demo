package jpa.demo.learning.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table (name ="Table_User")
public class User {
    @Id
    private Long id;
    @Column(name="Name_Of_User", length = 255)
    private String name;
    private Instant createDateTime;
    @Column(nullable = true)
    private Instant updateDateTime;

}
