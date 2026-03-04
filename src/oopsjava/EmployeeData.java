package oopsjava;

import Learn.InheritanceChild;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.name = "Niharika";
		emp1.empId = 1000;
		emp1.salary = 5000;
		
		emp1.displayData();
		
		emp2.name = "Ranjith";
		emp2.empId = 1001;
		emp2.salary = 5500;
		
		emp2.displayData();
		Person per1 = new Person("Mathew",12345,25,"KGF");
		Person per2 = new Person("Meghana",67890,26,"Bidi");
		
		per1.displayData();
		per2.displayData();
		System.out.println("Country for all the objects is " + Person.country);
		
		AccessModifier obj = new AccessModifier();
		obj.name = "Jonas";
		obj.rollNo = 10;
		obj.grade = 5;
		obj.setSchool("Edens");
		System.out.println(obj.name);
		System.out.println(obj.getSchool());
		
		ChildClass obj2 = new ChildClass();
		obj2.grade = 10;
		obj2.course = "Science";
		
		System.out.println(obj.grade);
		InheritanceChild obj3  = new InheritanceChild();
		obj3.rollNo = 255;
		obj3.course1 = "Biology";
		System.out.println(obj.rollNo);
		System.out.println(obj3.course1);
		
		MethodLoading mol = new MethodLoading();
		mol.Sum(20, 30);
		mol.Sum(5.5, 10.0);
		
		Bank b1 = new ICICIBank();
		b1.printStatement();
		//b1.openAccount();
		ICICIBank b2 = new ICICIBank();
		b2.openAccount();
		b2.printStatement();
		

		

	}


	

}
