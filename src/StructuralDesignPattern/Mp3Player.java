package StructuralDesignPattern;

public class Mp3Player implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName){
        System.out.println("Playing mp3 file. Name: " + fileName);
    }

}
