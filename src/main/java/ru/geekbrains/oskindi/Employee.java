package ru.geekbrains.oskindi;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.printf("%s Должность: %s email-%s, телефон %s, заработная плата - %d руб., возраст %d лет\n",name,position,email,phone,salary,age);
    }

    public int getAge() {
        return age;
    }



}
