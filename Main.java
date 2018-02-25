import java.util.*;
public class Main{
	public static void main(String[] args){
		double r = 0;
		double area = 0;

		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();
		scan.close();

		double area = Math.PI * r * r;

		System.out.println("The area is: " + area);
	}
}