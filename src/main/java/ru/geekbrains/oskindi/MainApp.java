package ru.geekbrains.oskindi;

public class MainApp {

    public static void main(String[] args) {
        Employee[] listEmployees = new Employee[5];
        listEmployees[0]=new Employee("Ivanov Ivan Ivanovich", "Инженер-конструктор", "IVAAAN@yandex.ru","+78005553535",130000,35);
        listEmployees[1]=new Employee("Petrov Petr Petrovich", "Инженер-проектировщик", "PETR2000@yandex.ru","+78005553534",120000,45);
        listEmployees[2]=new Employee("Sever Margarita Anatol'evna", "Бухгалтер", "margaritka@mail.ru","+78005553533",200000,20);
        listEmployees[3]=new Employee("Usov Pavel Stepanovich", "Заместитель директора", "pashka@yandex.ru","+78005553532",500000,41);
        listEmployees[4]=new Employee("Robotov Aleksey Igorevich", "Директор", "ROBOKOP3000@gmail.com","+78005553530",1000000,42);


        for (int i = 0; i < listEmployees.length; i++) {
            if (listEmployees[i].getAge() > 40) {
                listEmployees[i].info();
            }
        }
    }
}
