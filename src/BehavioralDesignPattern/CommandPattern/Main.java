package BehavioralDesignPattern.CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight=new Light();

        Command lightOn=new LightOnCommand(livingRoomLight);
        Command lightOff=new LightOffCommand(livingRoomLight);

        RemoteControl remote=new RemoteControl();
        remote.addCommand(lightOn);
        remote.addCommand(lightOff);


        remote.executeCommands();
    }
}
