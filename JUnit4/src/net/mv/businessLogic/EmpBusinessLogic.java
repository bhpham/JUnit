package net.mv.businessLogic;

import net.mv.pojos.EmployeeDetails;

public class EmpBusinessLogic {

	//Calculate the yearly salary of Employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary=0;
	    yearlySalary = employeeDetails.getMonthlySalary() * 12;
	    return yearlySalary;
	}
	
	//Calculate appraisal amount of Employee
	public double calculateAppraisal(EmployeeDetails employeeDetails){
		double appraisal=0;
		if(employeeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
		return appraisal;
	}
}
