package pollub.cs.ptrwrbl.lab8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pollub.cs.ptrwrbl.lab8.domains.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
