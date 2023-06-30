package home_work_6;

import java.util.List;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        List<String> endsInWord;
        String newWord = word;
        endsInWord = List.of("а", "я", "ы", "е", "и", "у", "ю", "ой", "ей", "о"
                ,"ом", "ем", "ю", "ов", "ев", "ей", "ами", "ями", "ах", "ях");
        int lengthEndInWord = 0;
        for (String ends : endsInWord) {
            if (word.endsWith(ends)) {
                lengthEndInWord = ends.length();
                newWord = newWord.substring(0, word.length() - lengthEndInWord);
            }
        }
        return searchEngine.search(text, newWord + "[а-я]{0,3}");
    }
}
