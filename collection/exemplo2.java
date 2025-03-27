package collection;
import java.util.Scanner;
public class exemplo2 {
	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe a idade:");
		String Classing = AgeClassing(read.nextInt());
		
		
	}
	public static String AgeClassing(int age) {
		if(age < 13) {
			return "treem";
		}else {
			return "Adult";
		}
	}	
}
