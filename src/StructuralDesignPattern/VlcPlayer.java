package StructuralDesignPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName){
        //do nothing this is vlc player
    }

    @Override
    public void playVlc(String fileName){
        System.out.println("this is vlc player. file:"+ fileName);
    }

}
