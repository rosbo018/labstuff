package lab7;

public class Account {
	private int money;
	public Account(){
		this.money = 0;
	}
	public Account(int m){
		this.money = m;
	}
	public void deposit(int m){
		this.money+=m;
	}
	public int withdraw(int m) throws NotEnoughMoneyException{
		System.out.println(this.money+" "+m);
		if (this.money-m < 0 ){
			throw new NotEnoughMoneyException(this.money-m);
		}
		else{
			this.money-=m;
			return m;
		}
	}
	public int getBalance(){
		return this.money;
	}

}
