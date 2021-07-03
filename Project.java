package projects;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
import java.util.regex.*; 

public class Project {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter card holder name");
		
		// Takes name of the card holder
		String name=sc.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("Please enter your 12 digit card no");
		
		// Takes 12 digit card no input
		String card=sc.nextLine();
		
		// Checks for no of digits entered
		String regex = "\\d{12}";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(card);
	      
	      if(matcher.matches()) {
	    
		    System.out.println("Card no entered = "+card);
		    
		    System.out.println("Enter the service to avail");
		    
			// Displays services available
			System.out.println("Deposit");
			System.out.println("Transfer");
			System.out.println("Cash withdrawal");
			System.out.println("Help");
			
			String service=sc.nextLine();
			
			// CASE 1:
			// if input matches Deposit
			if (service.contains("Deposit")) {
				System.out.println("Enter your pin");
				
				// Checks for pin length
				String pin=sc.nextLine();
				String code = "\\d{4}";
			
			      Pattern a = Pattern.compile(code);
			      Matcher b = a.matcher(pin);
			      
			      if(b.matches()) {
					
					System.out.println("Enter the amount to be deposited");
					int deposit=sc.nextInt();
					
					// Checks if input is a multiple of 50 or not
					// ATM machine accepts only multiples of 50
					if (deposit%50==0) {
						System.out.println("Successfully Deposited");
						
						// Prints Acknowledgement Slip
						System.out.println("Acknowledgement Slip");
						System.out.println("Card holder= "+name);
						System.out.println("Amount deposited= "+deposit);
						
						// for printing date and time of transaction
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
						   LocalDateTime now = LocalDateTime.now();  
						   System.out.println("Transaction done on= "+dtf.format(now));  
					}
					// if amount deposited is not a multiple of 50
					else {System.out.println("Invalid amount entered");
					}
			}
			      // if pin length is not 4
				else {System.out.println("Invalid pin");}
		}
			// CASE 2:
			// if input matches Transfer
			else if(service.contains("Transfer")) {
				System.out.println("Enter your pin");
				String pin=sc.nextLine();
				
				// Checks for pin length
				String code = "\\d{4}";
			      Pattern a = Pattern.compile(code);
			      Matcher b = a.matcher(pin);
			      
			      // if pin length matches
			      if(b.matches()) {
					System.out.println("Enter receiver's 10 digit account number");
					String rec=sc.nextLine();
					
					// Checks for receiver account no length
					String p1 = "\\d{10}";
				      Pattern c = Pattern.compile(p1);
				      Matcher d = c.matcher(rec);
				      
				      if(d.matches()) {
					System.out.println("Enter the amount to be transfered");
					int deposit=sc.nextInt();
					
					// if amount is a multiple of 50
					if (deposit%50==0) {
						System.out.println("Successfully transferred");
						System.out.println("Acknowledgement Slip");
						System.out.println("Card holder= "+name);
						System.out.println("Amount deposited= "+deposit);
						System.out.println("Amount transferred to A/C no= "+rec);
						
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
						   LocalDateTime now = LocalDateTime.now();  
						   System.out.println("Transaction done on= "+dtf.format(now));  
					}
					// if amount not a multiple of 50
					else {System.out.println("Invalid amount entered in transfer");
					}
			}
				      // if account no length doesn't matches
				else {System.out.println("Invalid a/c entered");}
			}
		else {
		// if pin length doesn't matches
			System.out.println("Invalid pin");
		}
			}
			//CASE 3:
			// if input matches Cash withdrawal
			else if (service.contains("Cash withdrawal")) {
				System.out.println("Enter your pin");
				String pin=sc.nextLine();
				
				// checks for pin length
				String code = "\\d{4}";
			      Pattern a = Pattern.compile(code);
			      Matcher b = a.matcher(pin);
			      
			      if(b.matches()) {
					
					System.out.println("Enter the amount to be withdrawn");
					int deposit=sc.nextInt();
					
					// if input a multiple of 50
					if (deposit%50==0) {
						System.out.println("Successfully Withdrawn");
						System.out.println("Acknowledgement Slip");
						System.out.println("Card holder= "+name);
						System.out.println("Amount withdrawn= "+deposit);
						
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
						   LocalDateTime now = LocalDateTime.now();  
						   System.out.println("Transaction done on= "+dtf.format(now));  
					}
					// if input not a mutiple of 50 
					else {System.out.println("Invalid amount entered for withdrwal");
					}
			}
			      // pin length doesn't matches
				else {System.out.println("Invalid pin");
				}
		}
			// CASE 4:
			// if input matches Help
			else if (service.contains("Help")) {
				System.out.println("Contact your nearest branch of your bank");
			}
			else {
				// if service doesn't matches
				System.out.println("Invalid Input of service");
			}
			

	}
		else {
			// if card no length doesn't matches
			System.out.println("Invalid Input of card");
		}
	}
	}
