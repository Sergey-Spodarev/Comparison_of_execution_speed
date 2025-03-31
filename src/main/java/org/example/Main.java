package org.example;
import TimeCalculation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int iterations = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Collection<Integer> tester = new Collection<>();
        Time stopwatch = new Time();

        System.out.println("Testing add...");
        stopwatch.start();
        for (int i = 0; i < iterations; i++) {
            tester.myAdd(arrayList, i);
        }
        stopwatch.stop();
        System.out.println("ArrayList add time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        for (int i = 0; i < iterations; i++) {
            tester.myAdd(linkedList, i);
        }
        stopwatch.stop();
        System.out.println("LinkedList add time: " + stopwatch.getTime() + " ms");

        System.out.println("Testing get...");
        stopwatch.start();
        for (int i = 0; i < iterations; i++) {
            tester.mytGet(arrayList, i);
        }
        stopwatch.stop();
        System.out.println("ArrayList get time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        for (int i = 0; i < iterations; i++) {
            tester.mytGet(linkedList, i);
        }
        stopwatch.stop();
        System.out.println("LinkedList get time: " + stopwatch.getTime() + " ms");

        System.out.println("Testing delete...");
        stopwatch.start();
        for (int i = iterations - 1; i >= 0; i--) {
            tester.myDelete(arrayList, i);
        }
        stopwatch.stop();
        System.out.println("ArrayList delete time: " + stopwatch.getTime() + " ms");

        stopwatch.start();
        for (int i = iterations - 1; i >= 0; i--) {
            tester.myDelete(linkedList, i);
        }
        stopwatch.stop();
        System.out.println("LinkedList delete time: " + stopwatch.getTime() + " ms");
    }
}