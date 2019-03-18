package counter;

import core.Command;
import core.Processor;

public class CInc extends Command{
	
	public CInc() {
		super.setName("inc");
	}

	@Override
	public void execute(Processor p) {
		((Counter) p.getSystem()).increment();		
		
	}

}
