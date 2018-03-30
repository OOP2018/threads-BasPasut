import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter extends Counter{

	private AtomicLong total;
	
	public AtomicCounter(){
		total = new AtomicLong();
	}
	/**
	 * add amount to the total.
	 */
	@Override
	public void add(int amount){
		total.getAndAdd(amount);
	}
}
