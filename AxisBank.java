package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("The deposit amount is 10000");
		
	}
	public void superDeposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bnk = new BankInfo();
	    AxisBank axb = new AxisBank();
	    bnk.deposit();
	    bnk.fixed();
	    bnk.saving();
	    axb.deposit();
	    axb.superDeposit();
		
	}

}
