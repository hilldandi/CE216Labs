package StructuralDesignPattern;
//MediaAdapter kullanarak farklı formatlardaki dosyaları çalabilen bir sınıf.
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            new Mp3Player().play(audioType,fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")|| audioType.equalsIgnoreCase("vlc")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else{
            System.out.println("invalid media");
        }

    }

}
