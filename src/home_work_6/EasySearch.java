package home_work_6;

public class EasySearch implements ISearchEngine {
    public static void main(String[] args) {

    }
    public long search(String text, String word) {
        long matches = 0;
        int lengthWord = word.length();
        int lengthString = text.length();
        int index = text.indexOf(word);
        //System.out.println(index);
        while (index != -1) {
            if (((index ==0) & ((index + lengthWord) >= lengthString)) ||
                    ((index == 0) && (!Character.isLetter(text.charAt(index + lengthWord))))) {
                matches++;
                index = text.indexOf(word, index +1);
            } else if ((index >0) & ((index + lengthWord) < lengthString)) {
                    if ((!Character.isLetter(text.charAt(index-1))) & (!Character.isLetter(text.charAt(index + lengthWord)))) {
                        matches++;
                        index = text.indexOf(word, index + 1);
                    } else {
                        index = text.indexOf(word, index + 1);
                        }
                    } else if (((index + lengthWord) == lengthString) && (!Character.isLetter(text.charAt(index-1)))) {
                        matches++;
                        index = text.indexOf(word, index + 1);
                            } else {
                                index = text.indexOf(word, index + 1);
                                }
        }
        return matches;
    }

}
