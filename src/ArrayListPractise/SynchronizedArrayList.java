package ArrayListPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList<>());

    }
}
