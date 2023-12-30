package pollub.cs.ptrwrbl.lab8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pollub.cs.ptrwrbl.lab8.domains.Student;
import pollub.cs.ptrwrbl.lab8.dtos.StudentDTO;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select new pollub.cs.ptrwrbl.lab8.dtos.StudentDTO(s.name, s.surname, s.age, s.address.state, s.address.city, s.address.state, s.address.zip) from Student s")
    List<StudentDTO> findAllNoAttachment();
}
