package euroBetLambda;

// Invoker
public class BookKeeper {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void confirm() {
		command.execute();
	}

}
