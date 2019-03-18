package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CommandScript extends Command {
	private FileReader file;
	private String line;

	public CommandScript(String fileName) throws FileNotFoundException {
		super.setName("script");
		this.file = new FileReader(fileName);
	}

	@Override
	public void execute(Processor p) throws IOException, ProcessorException {
		BufferedReader buffer = new BufferedReader(file);
		while ((line = buffer.readLine()) != null) {
			p.out().println(line);
			Command cmd = p.decode(line);
			p.execute(cmd);
		}
	}

}
