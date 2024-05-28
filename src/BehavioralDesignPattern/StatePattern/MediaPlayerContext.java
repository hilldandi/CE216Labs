package BehavioralDesignPattern.StatePattern;

public class MediaPlayerContext {
    private State state;

    public MediaPlayerContext(){
        state = new StoppedState(); //this is default
    }

    public void setState(State state){
        this.state=state;
    }
    public void play() {
        state.play(this);
    }
    public void pause() {
        state.pause(this);
    }
    public void stop() {
        state.stop(this);
    }
}
