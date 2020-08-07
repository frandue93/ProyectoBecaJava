package es.eoi.mundobancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.eoi.mundobancario.entity.Cuenta;
@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{

	@Modifying
	@Query(value = "update Cuenta c set c.Alias =? where ID=?", nativeQuery=true)
	int modAlias(String alias,int id);
	
	/*@Modifying
	@Query(value = )*/
	
}
