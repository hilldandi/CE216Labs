package CreationalDesignPattern.ParserExample;

public class TranslationDictionary {
    public TranslationParser parser;

    public void setParser(TranslationParser parser) {
        this.parser = parser;
    }

    public void loadFile(String file){
        if (parser != null){
            parser.parseFile(file);
        }
        else{
            System.out.println("no parser set");
        }
    }
}
