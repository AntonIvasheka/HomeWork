package home_work_6;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        File pathDir = null;
        String[] pathsFilesAndDir;
        Map <Integer, String> bookMap = new LinkedHashMap<>();
        int bookName = 0;
        String word = "";
        Scanner in = new Scanner(System.in);
        try {
            // Создание нового объекта file
            pathDir = new File("HomeWork/src/home_work_6/books");
            pathsFilesAndDir = pathDir.list();
            int chekBook =0;
            for(String path:pathsFilesAndDir) {
                chekBook++;
                bookMap.put(chekBook, path);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        for(Map.Entry<Integer, String> entry: bookMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Введите номер книги : ");
        bookName = in.nextInt();
        System.out.println("Введите что найти : ");
        word = in.next();

    }

}
