package home_work_6;

import home_work_6.job.JobWithBook;

import java.io.File;
import java.util.*;
import java.util.concurrent.*;

public class StreamSearch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        File pathDir = null;
        String[] pathsFilesAndDir;
        Map<Integer, String> bookMap = new LinkedHashMap<>();
        int bookName = 0;
        String word = "";
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
        while (true) {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            System.out.println("Введите что найти (0 - выход): ");
            word = in.next();
            if (!word.equals("0")) {
                bookName =0;
                List<Future<?>> futures = new ArrayList<>();
                for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                    bookName++;
                    fileName = "HomeWork/src/home_work_6/books/" + bookMap.get(bookName);
                    futures.add(executor.submit(new JobWithBook(fileName, word, bookMap.get(bookName))));
                }
            } else {
                break;
            }
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
