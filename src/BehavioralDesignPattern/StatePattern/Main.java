package BehavioralDesignPattern.StatePattern;

public class Main {
    public static void main(String[] args) {
        MediaPlayerContext mediaPlayer=new MediaPlayerContext();

        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.stop();
        mediaPlayer.pause();

    }

}
