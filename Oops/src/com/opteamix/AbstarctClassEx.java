package com.opteamix;

public class AbstarctClassEx {

	public static void main(String[] args) {
			PerEmp perEmp = new PerEmp();
			perEmp.setEmpId(101);
			perEmp.setEmpName("Monalisa");
			perEmp.setBasicSalary(20000);
			perEmp.setHra(10000);
			perEmp.setDa(20000);
			perEmp.setPf(5000);
			
			ContractEmp contractEmp = new ContractEmp();
			contractEmp.setEmpId(201);
			contractEmp.setEmpName("Sandeep");
			contractEmp.setNoOfDays(15);
			contractEmp.setWages(50000);
			processSalary(perEmp);
			System.out.println("-----------------------------");
			processSalary(contractEmp);
					
			
	}
	static void processSalary(Employee e) {
		e.calSalary();
	}
}
