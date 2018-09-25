import java.util.Scanner;
public class TestPerson{
	public static void main(String[] main){
		
		System.out.println("Enter number of Persons you want to store: ");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt(); // here control waits for an input
		person p[] = new person[size];
		for(int i = 0; i < size ; i++){
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter age");
			int age = sc.nextInt();
			p[i] = new person(name, age);
			System.out.println("-------------------------------");
		}
		for(person x : p){
			x.display();
		}
	}
}