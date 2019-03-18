package counter;

import core.Command;
import core.Processor;

public class CValue extends Command {

	public CValue() {
		super.setName("value");
	}
	
	@Override
	public void execute(Processor p) {
		p.out().println(((Counter)p.getSystem()).getCount());
		
	}

}
