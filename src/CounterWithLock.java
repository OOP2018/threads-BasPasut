import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * An accumulator for a sum. Using Lock
 * @author Pasut Kittiprapas
 *
 */
public class CounterWithLock extends Counter {
private Lock lock = new ReentrantLock();
	
	public void add(int amount){
		try{
			lock.lock();
			super.add(amount);
		}
		finally{
			lock.unlock();
		}
	}
}
