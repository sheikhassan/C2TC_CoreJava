package com.hassan.assignment.employees;
import com.hassan.assignment.employees.Employee;



	public class Manager extends Employee {

		private int managerId;

		private String managerName;

		private int managerSalarY;

		public int getManagerId() {
			return managerId;
		}

		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}

		public String getManagerName() {
			return managerName;
		}

		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}

		public int getManagerSalarY() {
			return managerSalarY;
		}

		public void setManagerSalarY(int managerSalarY) {
			this.managerSalarY = managerSalarY;
		}

	}

