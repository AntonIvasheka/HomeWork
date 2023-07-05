package home_work_6.job;

import home_work_6.EasySearch;
import home_work_6.ISearchEngine;

import java.io.*;

public class JobWithBook implements Runnable{
    private final String file;
    private final String word;
    private final String bookName;

    public JobWithBook(String filename, String word, String bookName) {
        this.file = filename;
        this.word = word;
        this.bookName = bookName;
    }
    public void run() {
        String all = "";
        ISearchEngine test1 = new EasySearch();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Windows-1251"))) {
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
        // System.out.println( file + " - " + word + " - " + test1.search(all, word));
        // System.out.println("---------------------------------------------------");
        String toWrite = "HomeWork/src/home_work_6/result.txt";
        File fileToWrite = new File(toWrite);
        try (Writer data = new FileWriter(fileToWrite, true)) {
            data.write(bookName + " - " + word + " - " + (test1.search(all, word)) + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
