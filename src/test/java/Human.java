public class Human {

    private String name;
    private int age;
    private int height;

    Human(int height, String name) {
        this.height = height;
        this.name = name;
    }

    Human(String name, int age, int height) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Human(String name) {
        this.name = name;
    }
    public void setUpMan() {
        if (age==0) {
            System.out.println("error");
        } else {
            System.out.println("Name is " + name + ", " + "age is " + age + ", " + "height is " + height + ".");
        }
    }
}
