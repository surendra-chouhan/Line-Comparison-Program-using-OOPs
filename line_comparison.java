import java.util.Scanner;

public class line_comparison {

	public double calculate_length(){
		double x1,y1,x2,y2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter x1 value : ");
		x1 = scan.nextDouble();

		System.out.println("Enter y1 value : ");
		y1 = scan.nextDouble();

		System.out.println("Enter x2 value : ");
		x2 = scan.nextDouble();

		System.out.println("Enter y2 value : ");
		y2 = scan.nextDouble();

		double length_of_a_line = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)) );
		return Math.round(length_of_a_line*100.0)/100.0;
	}

	public void compare(double line1, double line2){
		String first=Double.toString(line1);
		String second=Double.toString(line2);

		double result = first.compareTo(second);
		if(result>=1)
			System.out.println("Line1 is greater than Line2");
		else if(result<0)
			System.out.println("Line2 is greater than Line1");
		else
			System.out.println("Line1 is equal to Line2");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using OOPs");

		line_comparison lc = new line_comparison();

		System.out.println("Enter Line 1 Co-ordinates : ");
		double line_length1 = lc.calculate_length();
		System.out.println("Length of a line 1 is : " + line_length1);


		System.out.println("Enter Line 2 Co-ordinates : ");
		double line_length2 = lc.calculate_length();
		System.out.println("Length of a line 2 is : " + line_length2);

		lc.compare(line_length1,line_length2);

	}
}
