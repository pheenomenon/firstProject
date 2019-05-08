import java.util.ArrayList;

public class ListOfArrayListSort {
    public static void main(String args[]) {
        int[][] twodarray = {
                {2,4,7,9},
                {2,4,7,9}
        };

        int [] onedarray = {2,4,7,9};

        ArrayList<ArrayList> twodarraylist = new ArrayList<>();
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(2);
        arraylist1.add(5);
        arraylist1.add(54);
        arraylist1.add(25);

        ArrayList arraylist2 = new ArrayList();
        arraylist1.add(22);
        arraylist1.add(52);
        arraylist1.add(4);
        arraylist1.add(5);

        twodarraylist.add(arraylist2);

        System.out.println("Matrix len : " + twodarray.length);
    }

}
