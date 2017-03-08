package lab7;

public class NotEnoughMoneyException extends IllegalStateException{
	int miss;
	public NotEnoughMoneyException() {}
	public NotEnoughMoneyException(int x) {
		miss = x;
	}
	public String getMissingAmount(){
		return miss+"";
	}
	public NotEnoughMoneyException(String message)
    {
       super(message);
    }
}
