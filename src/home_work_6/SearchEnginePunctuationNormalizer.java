package home_work_6;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{
    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        String replacePunctuation = text.replaceAll("\\p{Punct}|\\s+|\\n", " ");
        return searchEngine.search(replacePunctuation, word);
    }
}
