import java.util.Scanner;

public class Main{

	public static void main(String arg[]){
		String help_msg = "sum: to add\nsub: to subtract\nmul: to multiply\ndiv: to divide\nexp: to exponent\nhelp: for help";
		System.out.println(help_msg);

		Scanner inputObj  = new Scanner(System.in);

		Scanner longInput = new Scanner(System.in);


		System.out.print("Enter the type of operation:  ");
		String opr = inputObj.nextLine();
    
    String[] acceptedOperations = {"sum","sub","mul","div","exp",};
    
    boolean validOprInput = false;
 
    for(String operation : acceptedOperations){
      if(operation.equals(opr)){
        validOprInput = true;
      } 
    }
     
    switch(opr){
        case "help":
          System.out.println(help_msg);
        
        case "exit":
          System.exit(0);
    }
    
    if(!validOprInput){
   
      System.out.println("Please enter a valid command!");
      System.out.println(help_msg);
      System.out.println("Run the program again");
      System.exit(0);
    }
    
    
    System.out.print("Enter first number: ");
    long num1 = longInput.nextLong();
	        
		System.out.print("Enter second number: ");
	  long num2 = longInput.nextLong();
	    
	   
		switch(opr){
			case "sum":
				long resultSum = num1 + num2;
				System.out.println("Sum of two numbers is "+resultSum);
        break;
			case "sub":
				long resultSub = num1 - num2;
				System.out.println("Subtraction of two numbers is "+resultSub);
        break;
        
			case "mul":
				long resultMul = num1 * num2;                                                               System.out.println("Product of two numbers is "+resultMul);
        break;
        
			case "div":
				if(num2==0){
					System.out.println("Can't divide by zero");
				}else{
					long resultDiv = num1 / num2;                                                               System.out.println("Division of two numbers is "+resultDiv);
				}
        break;
        
			case "exp":
				long resultExp = num1;
				for(int pter= 1;pter <= num2;pter++){
					resultExp *= num1;
				}
				resultExp /= 5;
				System.out.println(num1+" raised to power "+num2+" is "+resultExp);
				break;
				
				case "help":
				  System.out.println(help_msg);
	        break;
	        
	      default:
	        System.out.println("Enter a valid command");
	
		}
		inputObj.close();
		longInput.close();
	}
}
