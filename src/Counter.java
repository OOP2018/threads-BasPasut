/**
 * An accumulator for a sum.
 * @author Pasut Kittiprapas
 */
public class Counter {
	protected long total;
	
	public Counter() {
		total = 0;
	}
	
	/**
	 * Add an amount to the total.
	 */
	public void add(int amount) { total += amount; }
	
	/**
	 * Get the total value of counter.
	 */
	public long get() { return total; }
	
//	public static void main(String[] args) {
//		Counter acc = new Counter();
//		acc.add(50);
//		acc.add(-15);
//		System.out.println(acc.get()); //35
//		acc.add(-34);
//		System.out.println(acc.get()); //1
//	}
}
