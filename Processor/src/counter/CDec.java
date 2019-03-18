package counter;

import core.Command;
import core.Processor;

public class CDec extends Command {

	public CDec() {
		super.setName("dec");
	}

	@Override
	public void execute(Processor p) {
		((Counter) p.getSystem()).decrement();
	}

}
