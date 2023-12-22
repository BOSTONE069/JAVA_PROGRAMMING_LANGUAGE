package week_two;

public class SavingsAccount extends Account {
	
	private double interestRate;

	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + interestRate;
	}
	
	@Override
    public boolean equals(Account otherAccount) {
        if (otherAccount instanceof SavingsAccount) {
            SavingsAccount otherSavingsAccount = (SavingsAccount) otherAccount;
            return super.equals(otherAccount) && interestRate == otherSavingsAccount.interestRate;
        }
        return false;
    }

}
