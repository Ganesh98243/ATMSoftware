package atmsoftware;

import java.util.Scanner;

public class PINClass {
     
	static Scanner sc=new Scanner(System.in);
      long aadharNumber;
      private int pinNumber=1234;
      public PINClass(long aadharNumber) {
  		if (count(aadharNumber)==12) {
			this.aadharNumber=aadharNumber;
		}else {
			System.out.println("Invalid aadhar number");
		}
  		
  	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		if (count(pinNumber)==4) {
			this.pinNumber = pinNumber;
		}else {
			System.out.println("Enter only 4 digit");
		}
	}
	public long count(long aadharNumber) {
		long count=0;
		while (aadharNumber!=0) {
			count++;
			aadharNumber /=10;
		}
		return count;
	}
	int count=0;
	public  void pinValidation()  {
		System.out.println("Enter pin number");
		int pin=sc.nextInt();
		if (getPinNumber()==pin) {
			System.out.println("Validation Successfull");
		}else {
			System.out.println("Invalid pin number");
			count++;
			if (count<3) {
				System.out.println();
				pinValidation();
			}else {
				System.out.println("----------------------");
				System.err.println("Your card Blocked");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Generate new pin");
				System.out.println();
				int otp=OTPClass.generateOTP();
				System.out.println("Dear user it is an OTP : "+otp+" to generate pin number");
				System.out.println("Enter the OTP");
				if (otp==sc.nextInt()) {
					System.out.println("Enter 4 digit new pin number");
					int newPin=sc.nextInt();
					setPinNumber(newPin);
					System.out.println("Your new pin get generated");
					pinValidation();
				}else {
					System.err.println("Invalid OTP");
				}
			}
		}
		
	} 
}
