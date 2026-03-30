class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Playing...");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}


