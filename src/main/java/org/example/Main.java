package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import static org.example.MaxTarget.findMaxTargetProduct;
import static org.example.TargetSum.findTargetSum;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(12);
        nums.add(2);
        nums.add(11);
        nums.add(10);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        TargetLogic targetSum = new TargetLogic();
//        targetSum.findTargetSum(nums, 23);

        int[] array = {23, 4, 5, 8, 15, 90};
//        System.out.println("Indices: " + Arrays.toString(findTargetSum(array, 59)));
        System.out.println("Indices" + findTargetSum(nums, 12));
//        System.out.println("Max Product: " + findMaxProduct(array));

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("James");
        firstList.add("Sam");
        firstList.add("Korede");
        firstList.add("Xander");
        firstList.add("Prize");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("James");
        secondList.add("Sam");
        secondList.add("Xander");
        secondList.add("Prize");
        secondList.add("Fabian");

//        System.out.println("Intersection: " + findIntersection(firstList, secondList));

        System.out.println("Product of numbers greater than Target: " + findMaxTargetProduct(nums, 10));

    }



}
// Find Intersection btwn two lists List1 = [1,2,3,4,5] List2 = [3,6,8,10,4] Intersection = [3,4]