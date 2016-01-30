import java.util.Scanner;

public class Monthdays {
public static void main (String args []){
	String a;
	Scanner Month = new Scanner(System.in);
	System.out.println("Enter Month to get No of Days");
	a=Month.next();
	
	switch(a){
	 
	case "January": 
		System.out.println(31);break;
	case "February":
		System.out.println(28 + "Leapyear 29");break;
	case "March": 
		System.out.println(31);break;
	case "April": 
		System.out.println(30);break;
	case "May": 
		System.out.println(31);break;
	case "June": 
		System.out.println(30);break;
	case "July": 
		System.out.println(31);break;
	case "August": 
		System.out.println(31);break;
	case "September": 
		System.out.println(30);break;
	case "October": 
		System.out.println(31);break;
	case "November": 
		System.out.println(30);break;
	case "December": 
		System.out.println(31);break;
	
		
		default:
			System.out.println("Enter Correct Month Format to get Days");
			
	
	}a=Month.next();}}
