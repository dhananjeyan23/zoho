package org.demo;

public class employeeDet {
	String ename1="padma";
	//create the 1st method empName
		private void empName1() {
		System.out.println("employeename : "+ename1);
		}
		 //create the main method 
		public static void main(String[] args) {
		//classname objrefname = new classname()
			employeeDet ei1 = new employeeDet();
			ei1.empName1();

}
}