package pollub.cs.ptrwrbl.lab8.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
    private String name;
    private String surname;
    private Integer age;
    private String street;
    private String city;
    private String state;
    private String zip;
}
