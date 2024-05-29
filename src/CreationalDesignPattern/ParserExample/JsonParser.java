package CreationalDesignPattern.ParserExample;

public class JsonParser implements TranslationParser {
    @Override
    public void parseFile(String file){
        System.out.println("json file parsed");
    }
}
