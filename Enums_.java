enum Animals {
    CAT,
    DOG("my dog"),
    RABBIT,
    TURTLE("my turtle");

    private String name;

    Animals() {
        System.out.println("Animal created");
    }

    Animals(String name) {
        this.name = name;
        System.out.println("Animal created: " + name);
    }

    public String getName() {
        return name;
    }
}

public class Enums_ {
    public static void main(String[] args) {

        Animals animal = Animals.RABBIT;

        switch (animal) {
            case CAT:
                System.out.println("CAT");
                break;
            case DOG:
                System.out.println("DOG");
                break;
            case RABBIT:
                System.out.println("RABBIT");
                break;
            case TURTLE:
                System.out.println("TURTLE");
                break;
            default:
                break;
        }

        animal = Animals.TURTLE;

        System.out.println(animal); // Turtle
        System.out.println(animal.ordinal()); // 3
        System.out.println(animal.getClass()); // class Animals
        System.out.println(animal instanceof Enum); // true
        System.out.println(animal.getName()); // my turtle

        animal = Animals.valueOf("DOG");
        System.out.println(animal.getName()); // my dog

    }
}
