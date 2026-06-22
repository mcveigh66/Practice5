class Animal {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    // Overloaded method to greet another Dog instance
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}