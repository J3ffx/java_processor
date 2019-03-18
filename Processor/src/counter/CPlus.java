package counter;

import java.util.InputMismatchException;

import core.Command;
import core.Processor;

public class CPlus extends Command {
	
	public CPlus() {
		super.setName("plus");
	}
	@Override
	public void execute(Processor p) throws InputMismatchException {
		int operand = p.scanner().nextInt();
		int tot = ((Counter) p.getSystem()).getCount() + operand;
		((Counter) p.getSystem()).setCount(tot);

	}

}
