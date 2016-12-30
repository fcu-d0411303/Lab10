package lab2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		Account john = new Account("John", 100);
		
			try {
				bank.deposit(john, -50);
			} catch (DepositException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
