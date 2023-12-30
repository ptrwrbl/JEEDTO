package pollub.cs.ptrwrbl.lab8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pollub.cs.ptrwrbl.lab8.domains.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
