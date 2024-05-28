package BehavioralDesignPattern.StatePattern;

public class PausedState implements State{
    @Override
    public void play(MediaPlayerContext context){
        System.out.println("resuming the media player.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context){
        System.out.println("already paused");
    }

    @Override
    public void stop(MediaPlayerContext context){
        System.out.println("systtem stopped");
        context.setState(new StoppedState());
    }
}
