package es.eoi.mundobancario;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import es.eoi.mundobancario.entity.Cliente;
import es.eoi.mundobancario.entity.Cuenta;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MundobancarioApplication.class)
class MundobancarioApplicationTests {

	@Autowired
	
	
	@Test
	void contextLoads() {
	}

}
