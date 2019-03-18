package core;

public class CommandQuit extends Command {
	
	public CommandQuit() {
		super.setName("quit");
	}
	
	@Override
	public void execute(Processor p) {
		p.terminated();
		
	}

}
