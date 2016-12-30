package lab2;

public class Bank {

	public void deposit(Account account , int amount) throws DepositException {
		if(amount<0){
			throw new DepositException("The deposit amount must be great than 0");
		}
		
		int newBalance = account.getBalance() + amount;
		account.setBalance(newBalance);
		
		System.out.println("Balance : " + account.getBalance());
	}
}
