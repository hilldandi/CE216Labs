package BehavioralDesignPattern.StatePattern;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayerContext context){
        System.out.println("already playing.");
    }

    @Override
    public void pause(MediaPlayerContext context){
        System.out.println("pausing the media player");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("stopping the media player");
        context.setState(new StoppedState());
    }
}
