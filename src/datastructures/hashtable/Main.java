package datastructures.hashtable;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashTable myHT = new HashTable();
        myHT.printTable();

        myHT.set("nails", 100);
        myHT.set("tile", 50);
        myHT.set("lumber", 80);

        myHT.set("bolts", 200);
        myHT.set("screws", 140);
        myHT.printTable();

        System.out.println("Get: " + myHT.get("tile"));
        System.out.println("Get: " + myHT.get("lum"));
        System.out.println("Get: " + myHT.get("lumber"));

        System.out.println("All keys: " + myHT.keys());

        //ex1
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,5};
        int[] array3 = {2,4,6};
        System.out.println(itemInCommon(array1, array2));
        System.out.println(itemInCommon(array1, array3));
    }

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHM = new HashMap<>();

        for (int i : array1){
            myHM.put(i, true);
        }

        for (int j : array2){
            if (myHM.get(j) != null) return true;
        }
        return false;
    }
}
