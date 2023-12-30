package pollub.cs.ptrwrbl.lab8.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.cs.ptrwrbl.lab8.converters.StudentConverter;
import pollub.cs.ptrwrbl.lab8.dtos.StudentDTO;
import pollub.cs.ptrwrbl.lab8.repositories.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;
    @Override
    public List<StudentDTO> getAllStudents() {
        return (List<StudentDTO>) studentRepository.findAll().stream()
                .map(studentConverter::convert)
                .collect(Collectors.toList());
    }
}
