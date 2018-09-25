package com.opteamix;

public class PerEmp extends Employee{
		private float basicSalary;
		private float hra;
		private float da;
		private float pf;
		
		
		public float getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(float basicSalary) {
			this.basicSalary = basicSalary;
		}
		public float getHra() {
			return hra;
		}
		public void setHra(float hra) {
			this.hra = hra;
		}
		public float getDa() {
			return da;
		}
		public void setDa(float da) {
			this.da = da;
		}
		public float getPf() {
			return pf;
		}
		public void setPf(float pf) {
			this.pf = pf;
		}
		
		@Override
		void calSalary() {
			float totalSalary = basicSalary+hra+da+pf;
			System.out.println("Total Salary for Permanent Employee is: "+totalSalary);
		}
	

}
