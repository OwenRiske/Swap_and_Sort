package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class swapSort {

    public static int[] switchTwoElements(int[] elements, int element1, int element2, int element1Index, int element2Index){

        //swap the two inputted numbers with each other
        elements[element1Index]=element2;
        elements[element2Index]=element1;


        return elements;
    }


    public static int[] sort(int[] unsorted){

        //loop through unsorted to find which elements need to be switched
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length; j++) {
                //swap elements if unsorted[i] is less then unsorted[j]
                if(unsorted[i]<unsorted[j]){
                    unsorted=switchTwoElements(unsorted,unsorted[i],unsorted[j],i,j);
                }
            }
        }

return unsorted;
    }
}
