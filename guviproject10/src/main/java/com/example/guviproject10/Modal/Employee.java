package com.example.guviproject10.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Document(collection = "employee")
public class Employee {
    @Id
    private String Id;
    private Integer EmployeeId;
    private String EmployeeName;
    private String EmployeeEmail;
    private String EmployeeLocation;

}
