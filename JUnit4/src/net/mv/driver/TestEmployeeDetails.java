package net.mv.driver;
import static org.junit.Assert.assertEquals;
import net.mv.businessLogic.EmpBusinessLogic;
import net.mv.pojos.EmployeeDetails;

import org.junit.Test;

public class TestEmployeeDetails {

	EmployeeDetails employee = new EmployeeDetails();
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	
	@Test
	public void testCalculateAprraisal() {
		employee.setName("Jason");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	 public void testCalculateYearlySalary() {
	     employee.setName("Rajeev");
	     employee.setAge(25);
	     employee.setMonthlySalary(8000);
	     double salary= empBusinessLogic.calculateYearlySalary(employee);
	     assertEquals(96000, salary, 0.0);
	 }
}
