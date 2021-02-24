package ai181.kozyrevych.templateMethod;

public class UsualComputerUser extends ComputerActionsTemplate {

    public UsualComputerUser(String name) {
        super(name);
    }

    @Override
    public void diffMethod() {
        System.out.println("Do routine work");
    }
}
