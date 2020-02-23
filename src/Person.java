public class Person {
    String name;
    int age;
    int weight;
    Car obj;

    Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Person obj1 = new Person("adarsh", 20, 60);
        obj1.obj = new Car("xuv", "hp", "20000");
        System.out.println(obj1.obj.price);
        obj1.lol();
    }

    public void lol() {
        System.out.println(name + " " + age + " " + weight);
    }
}

class Car {
    String type;
    String make;
    String price;

    Car(String type, String make, String price) {
        this.type = type;
        this.make = make;
        this.price = price;

    }

}