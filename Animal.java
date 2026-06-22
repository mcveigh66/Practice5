public class Animal {
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

