import java.util.*;

public class RunBloodData{
	public static void main(String[]args){
		String Input1, Input2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Blood type of patient: ");
		Input1 = scanner.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		Input2 = scanner.nextLine();
		
		if(Input1.isEmpty() && Input2.isEmpty()){
			BloodData bd = new BloodData();
			bd.display();
			
		}
		else if(Input1.equals ("A")){
			System.out.print("Invalid Input please try again");
			
		}
		else if(Input1.equals("B")){
			System.out.print("Invalid Input please try again");
			
		}
		else if(Input1.equals ("O")){
			System.out.print("Invalid Input please try again");
			
		}
		else if(Input1.equals ("AB")){
			System.out.print("Invalid Input please try again");
			
		}
		else if(Input2.equals ("+")){
			System.out.print("Invalid Input please try again");
		
		}
		else if(Input2.equals ("-")){
			System.out.print("Invalid Input please try again");
			
		}
		else{
			BloodData bd = new BloodData(Input1, Input2);
			bd.display();
		}
		scanner.close();
	}
}