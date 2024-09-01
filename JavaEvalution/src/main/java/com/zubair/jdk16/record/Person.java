package com.zubair.jdk16.record;

public record Person(String name, int age) {

    // Public constructor is automatically generated
    // Getters (`getName()`, `getAge()`) are automatically generated

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);  // Concise object creation

        System.out.println(alice.name());     // Access field using getter
        System.out.println(alice.age());

        // Records are immutable, so attempting to modify fields would result in a compiler error
        // alice.name = "Bob";  // This would cause a compilation error

        Person bob = new Person("Bob", 25);
        System.out.println(alice.equals(bob));  // Uses automatically generated equals()
    }
}
