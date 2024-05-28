package BehavioralDesignPattern.StatePattern;

public class StoppedState implements State{

    @Override
    public void play(MediaPlayerContext context){
        System.out.println("starting the media player.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context){
        System.out.println("media player stopped. it cannot paused.");
    }

    @Override
    public void stop(MediaPlayerContext context){
        System.out.println("already stopped.");
    }
}
