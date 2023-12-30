package pollub.cs.ptrwrbl.lab8.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pollub.cs.ptrwrbl.lab8.dtos.StudentDTO;
import pollub.cs.ptrwrbl.lab8.services.StudentServiceImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(value = "/students")
@RestController
class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudentsNoAttachment();
    }
}
