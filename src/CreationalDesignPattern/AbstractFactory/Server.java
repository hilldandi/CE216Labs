package CreationalDesignPattern.AbstractFactory;

import java.util.SplittableRandom;

public class Server implements Computer{
    private String cpu;
    private String ram;
    private String  hdd;


    public Server(String cpu, String ram, String hdd){
        this.cpu=cpu;
        this.ram=ram;
        this.hdd=hdd;
    }

    @Override
    public String getCPU(){
        return this.cpu;
    }

    @Override
    public String getHDD(){
        return this.hdd;
    }

    @Override
    public String getRAM(){
        return this.ram;
    }
}
