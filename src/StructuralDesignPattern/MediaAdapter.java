package StructuralDesignPattern;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPLayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPLayer=new Mp4Player();
        } else if ((audioType.equalsIgnoreCase("vlc"))) {
            advancedMusicPLayer=new VlcPlayer();
        }
    }


    @Override
    public void play(String audioType,String fileName){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPLayer.playMp4(fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPLayer.playVlc(fileName);
        }
    }
}
