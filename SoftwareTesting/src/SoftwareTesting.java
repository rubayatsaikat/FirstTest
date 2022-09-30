package javaProgram;
import javaProgram.Add;
//import static javaProgram.Add.add;

public class SoftwareTesting {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		sum = a.add(5, 3);
		System.out.println(sum);
		
	}

}
