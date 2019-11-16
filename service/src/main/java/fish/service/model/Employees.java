package fish.service.model;

import lombok.Data;

import java.util.Date;

@Data
public class Employees {
    private Integer empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hirDate;
}
