package atmsoftware;

import java.util.Scanner;

public class ATMMainLogic  {
       static {
    	   System.out.println("***************************");
    	   System.out.println("*                         *");
    	   System.out.println("*   Welcome to KHAN ATM   *");
    	   System.out.println("*                         *");
    	   System.out.println("***************************");
       } 
       public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		ATMImplementation atm=new ATMImplementation();
		PINClass pin=new PINClass(987654321987l);
		System.out.println();
		System.out.println("Insert your ATM card");
		System.out.println();
		System.out.println("Wait your card under process");
		
		pin.pinValidation();
		
		System.out.println();
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.err.println("*      1.WITHDRAW             *");
		System.err.println("*      2.DEPOSITE             *");
		System.err.println("*      3.BALANCE ENQUIRY      *");
		System.err.println("*      4.GENERATE PIN NUMBER  *");
		System.err.println("*      5.ACCOUNT DETAILS      *");
		System.out.println("*                             *");
		System.out.println("*******************************");
		System.out.println("Enter your option");
		int option=sc.nextInt();
		switch (option) {
		case 1:{
			System.out.println("Enter amount");
			double amount=sc.nextDouble();
			atm.withdraw(amount);
		}
			break;
		case 2:{
			System.out.println("Enter amount");
			double amount=sc.nextDouble();
			atm.deposite(amount);
		}
			break;
		case 3:{
			atm.balanceEnquiry();
		}
		break;
		case 4:{
			System.out.println("Enter pin number");
			int pinNum=sc.nextInt();
			pin.setPinNumber(pinNum);
			System.out.println("pin number generated "+pinNum);
		}
		break;
		case 5:{
			Account a=new Account("Khan","PUNB12345","NANDYAL");
			a.accountDetails();
		}
		break;
		default:{
			System.out.println("Enter valid option");
		}
		}
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*        THANK YOU            *");
		System.out.println("*        VISIT AGAIN          *");
		System.out.println("*                             *");
		System.out.println("*******************************");
	}
}
