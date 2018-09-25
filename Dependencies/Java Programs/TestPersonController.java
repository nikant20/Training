import java.util.Scanner;
public class TestPersonController{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int option = 0;
		person[] p = new person[5];
		int i = 0;
		do{
			System.out.println("1: Store, 2:Display, 3: exit");
			option = sc.nextInt();
			switch(option){
				case 1: System.out.println("Name= ");
					String name = sc.next();
					System.out.println("Age= ");
					int age = sc.nextInt();
					p[i] = new person(name, age);
					i++;
					break;
				case 2: for(person x : p){
						if(x!=null){
							x.display();
						}	
					}
					break;		
			}
		}while(option!=3);
	}
}