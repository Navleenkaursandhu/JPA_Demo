package jpa.demo.learning.project.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    @Column(length =255)
    private String category;
    @Column (columnDefinition = "CLOB") //CLOB (Character large Object): a database datatype to store large amount of character data
    private String blogText;

}
