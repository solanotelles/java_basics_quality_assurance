package month2.week1.person;

public class Person {
    String name;
    int age;
    String cityName;

    Person(String name, int age, String cityName){
        this.name = name;
        this.age = age;
        this.cityName = cityName;
    }

    void showInformation(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City Name: " + cityName);
    }

    boolean isAdult(){
        return age >= 18;
    }
}
