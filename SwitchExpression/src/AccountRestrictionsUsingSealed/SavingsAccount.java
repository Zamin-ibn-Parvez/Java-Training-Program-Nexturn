package AccountRestrictionsUsingSealed;

public non-sealed class SavingsAccount extends Account {

	private double interestRate;
	
	
	
	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccNo(101);
		savingsAccount.setBalance(50000);
		savingsAccount.setInterestRate(12.5);
		
		System.out.println(savingsAccount.getAccNo()+ " "+savingsAccount.getBalance()+ " "+ savingsAccount.getInterestRate());
	}
}
