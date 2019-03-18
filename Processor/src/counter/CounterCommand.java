package counter;

import core.Command;
import core.Processor;

public abstract class CounterCommand extends Command {

	Counter counter;
	
	public Counter counter(Processor p) {
		return new Counter("counter");
	}
}
