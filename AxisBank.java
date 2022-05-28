package week3.day1;

public class AxisBank extends BankInfo {

	
	//Method Overridding 
	//child class deposit overrides the parent Bankinfo Deposit method
	public void deposit() {
		System.out.println("Axis Bank Deposit");
	}
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
	}
}
