package dev.jakeross.employeeapi.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private long id; // --> this is the PK
    private String firstName;
    private String lastName;
    private String email;
}
