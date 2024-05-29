package CreationalDesignPattern.ParserExample;

public class Main {
    public static void main(String[] args) {
        TranslationDictionary dict=new TranslationDictionary();

        //using xml
        dict.setParser(new XmlParser());
        dict.loadFile("example.xml");

        //using json
        dict.setParser(new JsonParser());
        dict.loadFile("example.json");

        //using structed
        dict.setParser(new StructedParser());
        dict.loadFile("example.structed");


    }
}
