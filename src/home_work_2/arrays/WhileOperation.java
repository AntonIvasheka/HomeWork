package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public String printArray(int[] prArray) {
        int d = 0;
        String str = "";
        while (d < prArray.length) {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
            d++;
        }
        return str;
    }

    @Override
    public String viaEl(int[] prArray) {
        int d = 1;
        String str = "";
        while (d < prArray.length) {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
            d+=2;
        }
        return str;
    }

    @Override
    public String reverseEl(int[] prArray) {
        int arrayLength = prArray.length;
        String str = "";
        while (arrayLength > 0) {
            arrayLength = arrayLength -1;
            System.out.print(prArray[arrayLength] + " ");
            str = str + prArray[arrayLength] + " ";
        }
        System.out.println();
        return str;
    }
}
