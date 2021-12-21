import java.util.ArrayList;
import java.util.List;

public class ninja_ladoos {
    public static void main(String[] args) {
        int[] row1 = { 2, 5, 9, 17 };
        int[] row2 = { 3, 4, 8, 13, 20 };
        List<Integer> mylist = new ArrayList<>();
        int k = 8;
        int max = Math.max(row1.length, row2.length);
        System.out.println("max " + max);
        System.out.println("row1 length " + row1.length + " row2 length " + row2.length);
        int i = 0;
        int j = 0;
        while (i < max) {
            if (row2.length > j && row1.length > i) {
                if (row1[i] > row2[j]) {
                    mylist.add(row2[j]);
                    j++;
                    System.out.println("j " + j);
                } else {
                    mylist.add(row1[i]);
                    i++;
                    System.out.println("i-> " + i);
                }

            } else {
                while (row1.length > i) {
                    mylist.add(row2[i]);
                    i++;
                    System.out.println("i-> " + i);
                }
                while (row2.length > j) {
                    mylist.add(row2[j]);
                    j++;
                    System.out.println("j " + j);
                }

                break;
            }

        }
        System.out.println("k length " + mylist.size());
        if (k < mylist.size()) {
            System.out.println("value of k is " + mylist.get(k));
        } else {
            System.err.println("entered to0 long k ");
        }
        System.out.println("list " + mylist);

    }
}
