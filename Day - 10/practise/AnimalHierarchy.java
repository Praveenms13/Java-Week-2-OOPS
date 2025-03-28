class Animal {
    protected  String name;
    protected  int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some Sounds ...");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Says Wowww ...");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Says Meow ...");
    }
}

class Birds extends Animal {
    public Birds(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Says Kookooo ...");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Doggy", 3);
        Animal cat = new Cat("Catty", 3);
        Animal bird = new Birds("Birdy", 3);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
