package command.배치;

import java.util.ArrayDeque;
import java.util.Queue;

public class BankManager {
    Queue<Command> commands = new ArrayDeque<>();

    public void registerCommands(Command command) {
        commands.add(command);
    }

    public void runAll() {

        commands.forEach(Command::execute);
    }

    public void run(Command command) {
        command.execute();
    }
}
