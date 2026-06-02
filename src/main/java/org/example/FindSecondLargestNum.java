package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNum {
    public static void main(String[] args) {
        int a[] = {1, 0, 2, 0, 4};

        //using pointer
        int lagerest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if(a[i]>lagerest){
                secondLargest=lagerest;
                lagerest=a[i];
            }
            else if(a[i]>secondLargest && a[i]!=lagerest){
                secondLargest=a[i];
            }

        }
        System.out.println(secondLargest);


        secondLargest = Arrays.stream(a)
                .distinct()                          // remove duplicates
                .boxed()                             // convert to Stream<Integer>
                .sorted(Comparator.reverseOrder())   // sort descending
                .skip(1)                             // skip largest
                .findFirst()                         // get second largest
                .orElseThrow(() -> new RuntimeException("No second largest element"));

        System.out.println("Second Largest: " + secondLargest);
    }
}
