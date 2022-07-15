package tn.esprit.spring.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeServiceTest {
	
@Autowired

IEmployeService es;
	

@Test
public void testRetrieveAllEmployees() {
List<String> listEmp = es.getAllEmployeNamesJPQL();
//Assertions.assertEquals(0, listEmp.size());
assertEquals(listEmp.size(), 0);
}

}
