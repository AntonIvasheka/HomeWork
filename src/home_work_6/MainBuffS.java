package home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainBuffS {
    public static void main(String[] args) {
        String [] allString = {};
        String all = "";
        EasySearch test1 = new EasySearch ();
        Set<String> wordSet= new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                //System.out.println(s);
                all = all + s;
            }
        } catch (
                IOException ex) {

            System.out.println(ex.getMessage());
        }
        //System.out.println(all);
        all = all.replaceAll(" -- ","");
        allString = all.split("[\\p{Space}\\p{Punct}]+");
        //for( String word : allString) {
        //    System.out.println(word);
        //}
        //System.out.println("Кол-во слов: " + allString.length);
        for(String word : allString) {
            wordSet.add(word);
        }
        System.out.println("Кол-во уникальных слов: " + wordSet.size());
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
        //for(Map.Entry entry : map.entrySet()) {
        //    System.out.println(entry.getKey() + " : " + entry.getValue());
        //}
    List list = new ArrayList(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue() - a.getValue();
        }
    });
        //System.out.println(list);
        System.out.println("Введите N (количество топ слов) :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j=0; j<n; j++) {
            System.out.println(list.get(j));
        }
        System.out.println("EasySearch result 'война': " + test1.search(all, "война"));
        System.out.println("EasySearch result 'и': " + test1.search(all, "и"));
        System.out.println("EasySearch result 'мир': " + test1.search(all, "мир"));
    }

    
}
