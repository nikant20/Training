public class Table{
	int rows,cols;

	public void cells(){
	System.out.println("Result = "+(rows * cols)+" cells");
	}
	Table(){
		System.out.println("Table() Constructor");
	}
	Table(int x, int y){
	rows = x;
	cols = y;
	System.out.println("Table(int, int) constructor");	
	}	
}

//S is in upper case, because it is a pre-defined class in java
// out is in lower case
// print is in lower case
// In java, all pre-defined classes start with upper case
//In java, all the keywords,pre-defined variables & methods start with lower case.