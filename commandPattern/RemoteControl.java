import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<String, Command> slots = new HashMap<>();

    public void setCommand(String slotName, Command command) {
        slots.put(slotName, command);
    }

    public void pressButton(String slotName) {
        Command command = slots.get(slotName);
        if (command == null) {
            System.out.println("No command assigned to slot: " + slotName);
            return;
        }
        command.execute();
    }
}
