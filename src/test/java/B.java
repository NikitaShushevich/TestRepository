import org.testng.annotations.Test;

public class B {

    @Test
    void test() {
        Human andi = new Human("Andi",172);
        andi.setUpMan();
        Human nikita = new Human("nikita",18, 180);
        nikita.setUpMan();
    }

}
