class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person(String, int) constructor");
	}
	//Person(){}
	public void display(){
		System.out.println("Name= "+name +" Age= "+age);
	}
}
class Employee extends Person{
	int id;
	double salary;
	Employee(int id, String name, int age, double salary){
		super(name,age);
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(int, String, int, double) constructor");
	}
	public void display(){
		System.out.println(id+" "+name+" "+age+" "+salary);	
	}
	
}
class Student extends Person{
	int rollNo;
	String grade;
	Student(int rollNo, String name, int age, String grade){
		super(name, age);
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public void display(){
		System.out.println(rollNo+" "+name+" "+age+" "+grade);
	}
}
public class TestInheritance{
	public static void main(String[] args){		
			Person p;
			p = new Employee(101,"Raj", 35, 4000);
			p.display();
			p = new Student(888,"Alex", 18, "A");
			p.display();
			p = new Person("Bob", 44);
			p.display();
	}
}