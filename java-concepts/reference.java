package java_concepts;

import java.util.ArrayList;
import java.util.HashMap;

public class reference {
    public static void main(String[] args) {
            // String: A sequence of characters
            String stringExample = "Hello, World!";
            System.out.println("String example: " + stringExample);

            // Array: A container object that holds a fixed number of values of a single type
            int[] arrayExample = {1, 2, 3, 4, 5};
            System.out.print("Array example: ");
            for (int num : arrayExample) {
                System.out.print(num + " ");
            }
            System.out.println();

            // ArrayList: A resizable array, part of the Java Collections Framework
            ArrayList<String> arrayListExample = new ArrayList<>();
            arrayListExample.add("Java");
            arrayListExample.add("Python");
            arrayListExample.add("C++");
            System.out.println("ArrayList example: " + arrayListExample);

            // HashMap: A collection that associates keys with values
            HashMap<Integer, String> hashMapExample = new HashMap<>();
            hashMapExample.put(1, "One");
            hashMapExample.put(2, "Two");
            hashMapExample.put(3, "Three");
            System.out.println("HashMap example: " + hashMapExample);

            // Object: The root of the class hierarchy, every class has Object as a superclass
            Object objectExample = new Object();
            System.out.println("Object example: " + objectExample);

            // Custom Class example
            Person personExample = new Person("Vaish", 21);
            System.out.println("Custom class example: " + personExample);
        }
    }

    // Custom class Person
    class Person {
        String name;
        int age;

        // Constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Override toString method for custom output
        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }
