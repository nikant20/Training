import java.util.Scanner;
public class Exam{
	static void show(){
		System.out.println("1. Java, 2. C#, 3. Python, 4. exit");
	}
	public static void main(String[] args){
		System.out.println("1. Java, 2. C#, 3. Python, 4. exit");
		Scanner sc = new Scanner(System.in);
		int input;
		int javaCounter = 0;
		int cSharpCounter = 0;
		int pythonCounter = 0;
		
		do{
			input = sc.nextInt();
			show();
			switch(input){
				case 1: if(javaCounter!=0){
					   System.out.println("You have already taken the exam");
					   
					    
					}else{
						System.out.println("Thank you For taking java Exam");
						javaCounter++;
						
						
					}
					break; 
					
				case 2: if(cSharpCounter!=0){
					   System.out.println("You have already taken the exam");
					   
					  
					}else{
						System.out.println("Thank you For taking C# Exam");
						cSharpCounter++;
						
						
					}
					 break;
					
				case 3: if(pythonCounter!=0){
					   System.out.println("You have already taken the exam");
					   
					   
					}else{
						System.out.println("Thank you For taking Pyhton Exam");
						pythonCounter++;
						
						
					}
					break;
					
				case 4: if(javaCounter==0 || cSharpCounter == 0 || pythonCounter == 0){
						System.out.println("Please take all the exams");
						input = 1;		
					}else{
			                  System.out.println("Thank you for taking all the exams");
					}
					break;
										
			}
		}while(input!=4);	
	}
}