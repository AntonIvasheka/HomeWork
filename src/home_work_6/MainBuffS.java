package home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainBuffS {
    public static void main(String[] args) {
        String [] allString = {};
        String all = "";
        ISearchEngine test1 = new EasySearch();
        ISearchEngine test2 = new RegExSearch();
        Set<String> wordSet= new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                all = all + s;
            }
        } catch (
                IOException ex) {

            System.out.println(ex.getMessage());
        }
        all = all.replaceAll(" -- ","");
        allString = all.split("[\\p{Space}\\p{Punct}]+");

        for(String word : allString) {
            wordSet.add(word);
        }
        //System.out.println("Кол-во уникальных слов: " + wordSet.size());
        for(String word : wordSet) {
            map.put(word, 1);
        }
        Integer i=0;
        for(Map.Entry entry : map.entrySet()) {
            for (String word : allString) {
                if (entry.getKey().equals(word)) {
                    i = i+1;
                    map.put(word, i);
                }
            }
            i=0;
        }
    List list = new ArrayList(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue() - a.getValue();
        }
    });
        System.out.println("Введите N (количество топ слов) :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j=0; j<n; j++) {
            System.out.println(list.get(j));
        }
        System.out.println("EasySearch result 'Война': " + test1.search(all, "Война"));
        System.out.println("EasySearch result 'И': " + test1.search(all, "И"));
        System.out.println("EasySearch result 'Мир': " + test1.search(all, "Мир"));

        System.out.println("RegExSearch 'война': " + test2.search(all, "война"));
        System.out.println("RegExSearch 'и': " + test2.search(all, "и"));
        System.out.println("RegExSearch 'мир': " + test2.search(all, "мир"));

        System.out.println("WithoutReg 'война': " + new SearchEngineWithoutReg(new RegExSearch()).search(all, "война"));
        System.out.println("WithoutReg 'и': " + new SearchEngineWithoutReg(new RegExSearch()).search(all, "и"));
        System.out.println("WithoutReg 'мир': " + new SearchEngineWithoutReg(new RegExSearch()).search(all, "мир"));

        System.out.println("CaseNormalizer 'война': " + new SearchEngineCaseNormalizer(new RegExSearch()).search(all, "война"));
        //System.out.println("WithoutReg 'и': " + new SearchEngineCaseNormalizer(new RegExSearch()).search(all, "и"));
        System.out.println("CaseNormalizer 'мир': " + new SearchEngineCaseNormalizer(new RegExSearch()).search(all, "мир"));

        System.out.println("PunctuationNormalizer 'война': " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(all, "война"));
        System.out.println("PunctuationNormalizer 'и': " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(all, "и"));
        System.out.println("PunctuationNormalizer 'мир': " + new SearchEnginePunctuationNormalizer(new RegExSearch()).search(all, "мир"));
    }

    
}
