package atmsoftware;

import java.util.Random;

public class OTPClass {
	public static int generateOTP() {
		Random rand=new Random();
		int otp=1000+rand.nextInt(5000);
		return otp;
	}

}
