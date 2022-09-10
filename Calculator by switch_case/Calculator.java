import java.util.*;
public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("For Addition press 1:");
		System.out.println("For Substraction press 2:");
		System.out.println("For Division press 3:");
		System.out.println("For Multiplication press 4:");


		int c = sc.nextInt();


		switch(c){
			case 1: System.out.println(a+b);
				break;
			case 2: System.out.println(a-b);
				break;
			case 3: System.out.println(a/b);
				break;
			case 4: System.out.println(a*b);
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + c);
		}
		// System.out.println(result);
	}
}
	
