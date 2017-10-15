/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author INT675
 */
public class TestHashMap {

    public static void main(String[] args) {
        System.out.println("ABCD".hashCode());
        String x = new String("ABCD");
        System.out.println(x.hashCode());
        System.out.println("position = " + hashIndex(x.hashCode(), 16));
        List<Course> itCourses = new LinkedList();
        List<Course> bisCourses = new LinkedList();
        List<Course> seCourses = new LinkedList();

        itCourses.add(new Course("INT675", "Java Workshop", 3));
        itCourses.add(new Course("INT650", "Enterprise Architectures", 3));
        itCourses.add(new Course("INT666", "Information Management System", 3));

        bisCourses.add(new Course("INT672", "ERP", 3));
        bisCourses.add(new Course("INT655", "Database Administration", 3));
        bisCourses.add(new Course("INT666", "Information Management System", 3));

        seCourses.add(new Course("INT675", "Java Workshop", 3));
        seCourses.add(new Course("INT676", "Server Side Programing", 3));
        seCourses.add(new Course("INT750", "Software Process", 3));

        Map<Student, List<Course>> studentCourse = new TreeMap();

        studentCourse.put(new Student(10001, "Somchai", 3.59), seCourses);
        studentCourse.put(new Student(10002, "Somsak", 3.90), bisCourses);
        studentCourse.put(new Student(10003, "Somsri", 3.50), itCourses);
        studentCourse.put(new Student(10004, "Sombat", 3.00), seCourses);
        studentCourse.put(new Student(10005, "Somkiat", 3.18), itCourses);

        Student key = new Student(10001, "Somchai", 3.59) ;
        
        System.out.println(key.id + ", "+ key.name + ": ");
        for (Course c : studentCourse.get(key)) {
            System.out.println("\t"+ c.code + " : "+ c.title + " ("+ c.credit + ")");
        }
    }

    static int hashIndex(int h, int tableSize) {
        int hash = h ^ (h >>> 16);
        return (tableSize - 1) & hash;
    }

    static class Student implements Comparable<Student>{

        int id;
        String name;
        double gpax;

        @Override
        public int compareTo(Student o) {
            return this.id - o.id ;
        }
        
        @Override
        public int hashCode() {
            int hash = 5;
            hash = 89 * hash + this.id;
            hash = 89 * hash + Objects.hashCode(this.name);
            hash = 89 * hash + (int) (Double.doubleToLongBits(this.gpax) ^ (Double.doubleToLongBits(this.gpax) >>> 32));
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }

        public Student(int id, String name, double gpax) {
            this.id = id;
            this.name = name;
            this.gpax = gpax;
        }

    }

    static class Course {

        String code;
        String title;
        int credit;

        public Course(String code, String title, int credit) {
            this.code = code;
            this.title = title;
            this.credit = credit;
        }
    }
}
