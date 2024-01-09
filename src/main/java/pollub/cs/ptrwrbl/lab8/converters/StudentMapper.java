package pollub.cs.ptrwrbl.lab8.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pollub.cs.ptrwrbl.lab8.domains.Student;
import pollub.cs.ptrwrbl.lab8.dtos.StudentDTO;

@Mapper
public interface StudentMapper {
    @Mapping(target = "street", source = "address.street")
    @Mapping(target = "city", source = "address.city")
    @Mapping(target = "state", source = "address.state")
    @Mapping(target = "zip", source = "address.zip")
    StudentDTO studentToStudentDTO(Student student);
}