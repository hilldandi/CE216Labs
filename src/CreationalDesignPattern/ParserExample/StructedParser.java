package CreationalDesignPattern.ParserExample;

public class StructedParser implements TranslationParser {
    @Override
    public void parseFile(String file){
        System.out.println("structured file parsed...");
    }
}
