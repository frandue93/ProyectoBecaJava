package es.eoi.mundobancario.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.entity.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>, PagingAndSortingRepository<Cliente,Integer> {
      
   @Modifying
   @Query(value= "update Cliente c set c.email =? where ID=?", nativeQuery=true)
   public void modEmail(String email, int id);

   @Query(value= "SELECT c FROM Cliente where c.email=?1 where pass=?2", nativeQuery=true)
   List<ClienteLoginDto> findByLogin(Integer id, String pass);
   
   
   




   
	
	
}
