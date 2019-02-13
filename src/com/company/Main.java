package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();

//        main.runStudent();
        main.run();
    }
    void runStudent(){
        Map<Student, Map<String, List<Integer>>> studMap = new HashMap<>();

        Student student = new Student("Romka",1);

        Map<String, List<Integer>> subMap = new HashMap<>();

        List<Integer> englishPoint = new ArrayList<>();
        englishPoint.add(5);
        englishPoint.add(10);
        subMap.put("Enhlish", englishPoint);


        List<Integer> rusPoint = new ArrayList<>();
        rusPoint.add(3);
        rusPoint.add(1);
        subMap.put("Russian", rusPoint);

        List<Integer> mathPoint = new ArrayList<>();
        mathPoint.add(4);
        mathPoint.add(2);
        subMap.put("Math", mathPoint);

        studMap.put(student, subMap);


        System.out.println(student.getName() + " " + subMap + " " + studMap);
    }

    void run(){

        Set<Student> studentTreesSet = new TreeSet<>(new StudentAgeComparator()
                .thenComparing(new StudentNameComparator()));

        Student student = new Student("Romka", 24);
        Student student1 = new Student("sdfdsfsd", 12);
        Student student2 = new Student("Rsfdsdf", 32);
        Student student3 = new Student("sdffgs", 22);
        Student student4 = new Student("sdfsdf", 13);
        Student student5 = new Student("Rsdfsdfsdf", 55);
        Student student6 = new Student("xvxcv", 33);

        studentTreesSet.add(student);
        studentTreesSet.add(student1);
        studentTreesSet.add(student2);
        studentTreesSet.add(student3);
        studentTreesSet.add(student4);
        studentTreesSet.add(student5);
        studentTreesSet.add(student6);

        System.out.println(studentTreesSet);


    }
}
