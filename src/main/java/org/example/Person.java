package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    private String phoneNumber;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  String email, String address, String phoneNumber) {
        this(firstName, lastName, age);
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public boolean isTeen() { return age >= 13 && age <= 19; }
}
