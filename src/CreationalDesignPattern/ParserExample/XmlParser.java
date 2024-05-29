package CreationalDesignPattern.ParserExample;

public class XmlParser implements TranslationParser {

    @Override
    public void parseFile(String file){
        System.out.println("xml file parsed");
    }

}
