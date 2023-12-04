package dev.jakeross.employeeapi.entity;
import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // --> this is the PK

    private String firstName;
    private String lastName;
    private String email;

}
