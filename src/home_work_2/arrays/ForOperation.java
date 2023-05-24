package home_work_2.arrays;

public class ForOperation implements IArraysOperation{
    @Override
    public String printArray(int[] prArray) {
        String str = "";
        for (int d=0; d < prArray.length; d++) {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
        }
        return str;
    }

    @Override
    public String viaEl(int[] prArray) {
        String str = "";
        for (int d=1; d < prArray.length; d+=2) {
            int element = prArray[d];
            System.out.print(element + " ");
            str = str + element+ " ";
        }
        return str;
    }

    @Override
    public String reverseEl(int[] prArray) {
        int arrayLength = prArray.length;
        String str = "";
        for (int i=arrayLength-1; i>=0; i--) {
            System.out.print(prArray[i] + " ");
            str = str + prArray[i] + " ";
        }
        System.out.println();
        return str;
    }
}
