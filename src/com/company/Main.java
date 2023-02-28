package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = { 11, 25, 31, 7, 88, 33, 67, 5, 12, 55}; //Input data.
        Scanner INPUT=new Scanner(System.in);
        String userInput="";
        int element1 = 0;
        int element2 = 0;
        int element1Index = 0;
        int element2Index = 0;


        while (true){
            //list the unsorted list
            for (int i = 0; i < unsorted.length; i++) {
                //put "," between each element
                if(i!= unsorted.length-1) {
                    System.out.print(unsorted[i] + ", ");
                }
                //last one don't put "," at the end
                else{
                    System.out.println(unsorted[i]);
                }
            }
            //user options
            System.out.print("\n\n1. Swap Elements 2. Sort 3. Quit\n>");
            userInput=INPUT.nextLine();

            //user option to switch two elements
            if (userInput.equalsIgnoreCase("1")||userInput.equalsIgnoreCase("1.")||userInput.equalsIgnoreCase("Swap")||userInput.equalsIgnoreCase("Swap Elements")){
                //makes it so that the number user inputs is in unsorted
                while(true) {
                    //get user to input number to be swapped
                    System.out.print("What number would you like to switch?\n>");
                    element1 = INPUT.nextInt();
                    //check to see if the number is in the list
                    for (int i = 0; i < unsorted.length; i++) {
                        if (unsorted[i] == element1) {
                            element1Index = i;
                        }
                    }
                    //move onto the next step if it is
                    if (element1Index >= 0) {
                        break;
                    }
                    //if it isn't tell them then repeat process
                    else{
                        System.out.println(element1+" isn't in the list\n");
                    }
                }
                //makes it so that the number user inputs is in unsorted
                while(true) {
                    //get user to input number to be swapped
                    System.out.print("What number would you like to switch with "+element1+"? \n>");
                    element2 = INPUT.nextInt();
                    element2Index = -1;
                    //check to see if the number is in the list
                    for (int i = 0; i < unsorted.length; i++) {
                        if (unsorted[i] == element2) {
                            element2Index = i;
                        }
                    }
                    //move onto the next step if it is
                    if (element2Index >= 0) {
                        break;
                    }
                    //if it isn't tell them then repeat process
                    else{
                        System.out.println(element2+" isn't in the list\n");
                    }
                }
                //clear INPUT
                INPUT.nextLine();

                //set unsorted as the swapped version
            unsorted=swapSort.switchTwoElements(unsorted,element1,element2,element1Index,element2Index);
            }

            //user options for sorting
            else if (userInput.equalsIgnoreCase("2")||userInput.equalsIgnoreCase("2.")||userInput.equalsIgnoreCase("Sort")){
                //sets unsorted as the new sorted version
                unsorted=swapSort.sort(unsorted);
            }
            
            //quit program
            else if(userInput.equalsIgnoreCase("3")||userInput.equalsIgnoreCase("3.")||userInput.equalsIgnoreCase("Quit")){
                break;
            }
        }
    }
}
