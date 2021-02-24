package ai181.kozyrevych.templateMethod;

public class Programmer extends ComputerActionsTemplate {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void diffMethod() {
        System.out.println("Write code");
    }
}
