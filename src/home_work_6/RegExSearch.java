package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        String regex ="(?U)\\b" + word + "(?U)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        long numberOfMatches = 0;
        while (matcher.find()) {
            numberOfMatches++;
        }
        return numberOfMatches;
    }
}
