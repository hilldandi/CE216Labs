package CreationalDesignPattern.AbstractFactory;

public class PC implements Computer{
    private String cpu;
    private String ram;
    private String hdd;

    public PC(String cpu, String ram,String hdd){
        this.cpu=cpu;
        this.ram=ram;
        this.hdd=hdd;
    }

    @Override
    public String getCPU(){
        return this.cpu;
    }

    @Override
    public String getRAM(){
        return this.ram;
    }

    @Override
    public String getHDD(){
        return this.hdd;
    }


}
