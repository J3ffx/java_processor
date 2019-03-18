package counter;

public class Counter {
	private static final int DEFAULT_COUNT = 0;

	private int count;
	private final String name;

	public Counter(String name) {
		this(name,DEFAULT_COUNT);
	}

	public Counter(String name,int count) {
		this.count = count;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder tmp = new StringBuilder("");
		tmp.append(this.name);
		tmp.append(" = ");
		tmp.append(this.count);
		return tmp.toString();
	}

	public void increment() {
		this.count++;
	}

	public void decrement() {
		this.count--;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void raz() {
		this.count = DEFAULT_COUNT;
	}
}
