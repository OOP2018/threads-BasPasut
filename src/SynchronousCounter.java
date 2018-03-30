/**
 * An accumulator for a sum. Using synchronous.
 * @author Pasut Kittiprapas
 *
 */
public class SynchronousCounter extends Counter {
	@Override
	public synchronized void add(int amount) {
		super.add(amount);
	}
}
