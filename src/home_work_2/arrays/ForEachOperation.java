package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{
    @Override
    public String printArray(int[] prArray) {
        String str = "";
        for (int d : prArray) {
            int element = d;
            System.out.print(element + " ");
            str = str + element + " ";
        }
        return str;
    }

    @Override
    public String viaEl(int[] prArray) {
        String str = "";
        int i = 0;
        for (int d : prArray) {
            int element = d;

            if ((i%2)>0) {
                System.out.print(element + " ");
                str = str + element + " ";
            }
            i = i+1;
        }
        return str;
    }

    @Override
    public String reverseEl(int[] prArray) {
        String str = "";
        int d = prArray.length-1;
        for (int i : prArray ) {
            System.out.print(prArray[d] + " ");
            str = str + prArray[d] + " ";
            d = d - 1;
        }
        System.out.println();
        return str;
    }
}
