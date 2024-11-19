package atmsoftware;

import java.util.Scanner;

public class ATMImplementation implements ATMSoftware {
       static Scanner sc=new Scanner(System.in);

	@Override
	public void withdraw(double amount) {
		String action="DEBITED";
		if (amount<=Account.totalBalance) {
			if (amount>=10000 && amount<=50000) {
				int otp=OTPClass.generateOTP();
				System.out.println("Dear user it is an OTP : "+otp+" for current transaction");
				System.out.println("Enter OTP");
				if (otp==sc.nextInt()) {
					Account.totalBalance -= amount;
					balanceEnquiry(action,amount);
				}else {
					System.out.println("Invalid OTP");
				}
				}else {
					Account.totalBalance -= amount;
					balanceEnquiry(action,amount);
				}
		}else {
			System.out.println("Insufficient fund");
		}
		
	}

	@Override
	public void deposite(double amount) {
		String action="CREDITATED";
		if (amount<=100000) {
			Account.totalBalance+=amount;
			balanceEnquiry(action,amount);
		}else {
			System.out.println("Your transaction limit is exceeded");
			
		}
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Total balance : "+Account.totalBalance);
	}
	public void balanceEnquiry(String action,double amount) {
		System.out.println("Dear user Account number:"+Account.accountNumber+" "+action+" by amount:"+amount+"Rs"+" on date "
				+SystemDateAndTime.getDateTime()+" remainning balance is "+Account.totalBalance+"Rs");
		
	}
       
}
