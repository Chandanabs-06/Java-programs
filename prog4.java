class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor");
    }
}

class Puppy extends Dog {
    Puppy() {
        super();
        System.out.println("Puppy Constructor");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
    }
}