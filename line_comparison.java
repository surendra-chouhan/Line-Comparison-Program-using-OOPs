import java.util.Scanner;

public class line_comparison {

	public double calculate_length(){
		double x1,y1,x2,y2;
		double length_of_a_line = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter x1 value : ");
		x1 = scan.nextDouble();

		System.out.println("Enter y1 value : ");
		y1 = scan.nextDouble();

		System.out.println("Enter x2 value : ");
		x2 = scan.nextDouble();

		System.out.println("Enter y2 value : ");
		y2 = scan.nextDouble();

		length_of_a_line = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)) );
		return Math.round(length_of_a_line*100.0)/100.0;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using OOPs");

		line_comparison lc = new line_comparison();

		System.out.println("Enter Line Co-ordinates : ");
		double line_length = lc.calculate_length();
		System.out.println("Length of a line is : " + line_length);

	}
}
