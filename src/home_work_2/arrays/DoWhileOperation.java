package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{
    @Override
    public String printArray(int[] prArray) {
        int d = 0;
        String str = "";
        do {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
            d++;
        } while (d < prArray.length);
        return str;
    }

    @Override
    public String viaEl(int[] prArray) {
        int d = 1;
        String str = "";
        do {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
            d+=2;
        } while (d < prArray.length);
        return str;
    }

    @Override
    public String reverseEl(int[] prArray) {
        int arrayLength = prArray.length;
        String str = "";
        do {
            arrayLength = arrayLength -1;
            System.out.print(prArray[arrayLength] + " ");
            str = str + prArray[arrayLength] + " ";
        } while (arrayLength > 0);
        System.out.println();
        return str;
    }
}
