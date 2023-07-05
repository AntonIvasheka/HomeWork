package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class SearchEngineWithoutReg implements ISearchEngine{
    private ISearchEngine searchEngine;
    public SearchEngineWithoutReg(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        String regex ="(?U)\\b" + word + "(?U)\\b";
        Pattern pattern = Pattern.compile(regex, CASE_INSENSITIVE|UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        long numberOfMatches = 0;
        while (matcher.find()) {
            numberOfMatches++;
        }
        return numberOfMatches;
    }
}
