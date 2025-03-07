package org.example;
import TimeCalculation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int iterations = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        CollectionTest tester = new CollectionTest();
        Time stopwatch = new Time();

        System.out.println("Testing add...");
        stopwatch.start();
        tester.myAdd(arrayList, iterations);
        stopwatch.stop();
        System.out.println("ArrayList add time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        tester.myAdd(linkedList, iterations);
        stopwatch.stop();
        System.out.println("LinkedList add time: " + stopwatch.getTime() + " ms");


        System.out.println("Testing get...");
        stopwatch.start();
        tester.mytGet(arrayList, iterations);
        stopwatch.stop();
        System.out.println("ArrayList get time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        tester.mytGet(linkedList, iterations);
        stopwatch.stop();
        System.out.println("LinkedList get time: " + stopwatch.getTime() + " ms");

        System.out.println("Testing delete...");
        stopwatch.start();
        tester.myDelete(arrayList, iterations);
        stopwatch.stop();
        System.out.println("ArrayList delete time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        tester.myDelete(linkedList, iterations);
        stopwatch.stop();
        System.out.println("LinkedList delete time: " + stopwatch.getTime() + " ms");
    }
}