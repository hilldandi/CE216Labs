package CreationalDesignPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2.5 GHz", "16GB", "1TB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("3.1 GHz", "32GB", "4TB"));

        System.out.println("PC Config: " + pc.getCPU() + ", " + pc.getRAM() + ", " + pc.getHDD());
        System.out.println("Server Config: " + server.getCPU() + ", " + server.getRAM() + ", " + server.getHDD());
    }
    }

