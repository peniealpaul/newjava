package newjava;

abstract public class Bank {
	void Acc() {
		System.out.println("ACCOUNT CREATED");
	}
abstract void intrestRate();
}

class  kvb {
	void intrestRate() {
		System.out.println("5%");
	}
	}

class sbi extends kvb{
	void intrestRate() {
		System.out.println("6%");
	}
}