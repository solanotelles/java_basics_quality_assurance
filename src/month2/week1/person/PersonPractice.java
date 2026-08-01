package month2.week1.person;

public class PersonPractice {
    public static void main(String[] args) {
        Person person1 = new Person("Solano", 18, "Fortaleza");
        Person person2 = new Person("Wanessa", 31, "Meireles");
        Person person3 = new Person("Abraão", 17, "Modunbim");

        person1.showInformation();
        System.out.println("Is an adult? " + person1.isAdult());
        System.out.println();
        person2.showInformation();
        System.out.println("Is an adult? " + person2.isAdult());
        System.out.println();
        person3.showInformation();
        System.out.println("Is an adult? " + person3.isAdult());


    }
}
