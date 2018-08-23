package ArrayListPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MakeArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList al1 = new ArrayList(10000);
        List<String> copyonWriterarraylist = new CopyOnWriteArrayList<>();
        for(int i=0;i<60;i++){
            al1.add(i);
        }
        System.out.println(al1.size());
        System.out.println();
        al.add("Nakul");
        al.add(null);
        al.add("nds");
        System.out.println(al.isEmpty());
        int size = al.size();

        int index = al.indexOf(null);
        al.remove(0);
        System.out.println(index);
        System.out.println(size);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        al.add("Nakul");
        for(String item : al){
            System.out.println(item);
        }
        al.set(2,"NDS");
 //       al.add(new Integer(2));    ----->  Error
        System.out.println(al);
//      Copying data from one arraylist to another
        copyonWriterarraylist.addAll(al);
        System.out.println("This is Copy on Write Arraylist   ---> "+copyonWriterarraylist);
    }
}
