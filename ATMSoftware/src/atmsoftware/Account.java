package atmsoftware;

public class Account {
	String accHolderName;
    final static long accountNumber=987654329876L;
    static double totalBalance=12000;
    String IFSCCode;
    String branch;
    
    public Account(String accHolderName, String iFSCCode, String branch) {
		super();
		this.accHolderName = accHolderName;
		this.IFSCCode = iFSCCode;
		this.branch = branch;
	}
    public void accountDetails() {
		System.out.println("Account Details");
		System.out.println("------------------------");
		System.out.println("Account Holder Name : "+accHolderName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("IFSCCode : "+IFSCCode);
		System.out.println("Branch : "+branch);
	}
    
    
    
}
