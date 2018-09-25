package com.opteamix;

public class ContractEmp extends Employee {

		private float wages;
		private int noOfDays;
		
		
		public float getWages() {
			return wages;
		}
		public void setWages(float wages) {
			this.wages = wages;
		}
		public int getNoOfDays() {
			return noOfDays;
		}
		public void setNoOfDays(int noOfDays) {
			this.noOfDays = noOfDays;
		}
		@Override
		void calSalary() {
			float totalSalary = wages+noOfDays;
			System.out.println("Total salary of Contact employee is: "+totalSalary);
		}
		
		
		

}
