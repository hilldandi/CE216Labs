package BehavioralDesignPattern.CommandPattern;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
public class RemoteControl {

    private List<Command> commands=new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command); //arrayliste ekliyo burada
    }

    public void executeCommands(){
        for (Command command:commands){
            command.execute();
        }
        commands.clear();
    }

}
