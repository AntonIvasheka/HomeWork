package home_work_6;

import java.io.*;
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
        String all = "";
        String fileName ="";
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
        }catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("Не верно указан путь к целевому каталогу");
            return; // Понимаю, что "костыль", но рекурсию не успею сделать
        }
        for(Map.Entry<Integer, String> entry: bookMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        do {
            System.out.println("Введите номер книги (0 - выход) : ");
            bookName = in.nextInt();
            if (bookName == 0) {
                break;
            }
            System.out.println("Введите что найти : ");
            word = in.next();
            fileName = "HomeWork/src/home_work_6/books/" + bookMap.get(bookName);
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
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
            EasySearch searchWord = new EasySearch();
            System.out.println(searchWord.search(all, word));

            String toWrite = "HomeWork/src/home_work_6/result.txt";
            File file = new File(toWrite);
            try (Writer data = new FileWriter(file, true)) {
                data.write(bookMap.get(bookName) + " - " + word + " - " + (searchWord.search(all, word)) + "\n");
                all = "";
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

}
