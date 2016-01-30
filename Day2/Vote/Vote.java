import java.util.Scanner;
public class Vote {
public static void main (String args[]){
	double a;
		Scanner Age = new Scanner(System.in);
    
		System.out.println("Enter your age");
		a=Age.nextDouble();
	if(a>18){
		System.out.println("You are eligible for vote");
	}
		else {
			System.out.println("You are not eligible for vote");
		}
	
}}
