package ArrayListPractise;

import java.util.ArrayList;

public class ConvertingArrayToArrayListandViceVersa {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Nakul");
        arrayList.add("NDS");
        arrayList.add("Hiii");
        String[] itemArray = new String[arrayList.size()];
        arrayList.toArray(itemArray);
        for(int i=0;i<itemArray.length;i++){
        System.out.println(itemArray[i]);}
    }
}
