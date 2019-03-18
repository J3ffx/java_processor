package counter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

import core.CommandScript;
import core.Processor;
import core.ProcessorException;

public class Test
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Processor p = new Processor(new Counter("counter"));
		p.addCmd(new CDec());
		p.addCmd(new CInc());
		p.addCmd(new CPlus());
		p.addCmd(new CMinus());
		p.addCmd(new CValue());
		p.addCmd(new CommandScript("script.txt"));
		
		while (!p.isTerminated())
		{
			System.out.print("-> ");
			try
			{
				p.execute(p.decode(p.fetch()));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			catch (ProcessorException e)
			{
				e.printStackTrace();
			}
			catch (InputMismatchException e)
			{
				e.printStackTrace();
			}
		}
	}
}
