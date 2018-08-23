package ArrayListPractise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Containesandbinarysearchmethod {
    public static final Logger logger = LoggerFactory.getLogger(Containesandbinarysearchmethod.class);

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(1000000);
        for(int i=0;i<numbers.size();i++){
            numbers.add(new Integer(i));
        }
        long startTime=System.nanoTime();
        boolean isExist = numbers.contains(new Integer(1000000));
        long totalTime = System.nanoTime() - startTime;

        logger.info("Time to search 1Mth Record using contains() is {} nano seconds", totalTime);
        Collections.sort(numbers); // List needs to be sorted for Binary Search
        Integer number = Collections.binarySearch(numbers, new Integer(1000000));
        totalTime = System.nanoTime() - startTime;
        logger.info("Time to search 1Mth Record using binary search is {} nano seconds", totalTime);

    }
}

//The sorting is taking time and therefore you see different result from binary
// search.
//Binary search is good only when you already have sorted list else it will take
// almost same amount of time what linear search is taking.
//Read more: http://
//javarevisited.blogspot.com/2014/03/binary-search-vs-contains-performance.html#ixzz5C6gYA0Jt//
//From the output, you can see that contains() method is almost 10 times faster than
// binary search, which means it make sense to use contains() for searching objects
// in List, especially for those which implements RandomAccess interface e.g.
// ArrayList.
//
//
//Read more: http://javarevisited.blogspot.com/2014/03/binary-search-vs-contains-performance.html#ixzz5C6eKEvNu