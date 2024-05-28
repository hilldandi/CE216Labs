package BehavioralDesignPattern.StatePattern;

public interface State {
    void play(MediaPlayerContext context);
    void pause(MediaPlayerContext context);
    void stop(MediaPlayerContext context);
}
