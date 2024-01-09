package pollub.cs.ptrwrbl.lab8.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pollub.cs.ptrwrbl.lab8.domains.Student;
import pollub.cs.ptrwrbl.lab8.dtos.StudentDTO;

@Component
public class StudentConverter implements Converter<Student, StudentDTO> {
    @Override
    public StudentDTO convert(Student source) {
        new StudentDTO();
        return StudentDTO.builder()
                .name(source.getName())
                .surname(source.getSurname())
                .age(source.getAge())
                .street(source.getAddress().getStreet())
                .city(source.getAddress().getCity())
                .state(source.getAddress().getState())
                .zip(source.getAddress().getZip())
                .build();
    }
}