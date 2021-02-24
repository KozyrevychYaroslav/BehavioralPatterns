package ai181.kozyrevych.templateMethod;

public abstract class ComputerActionsTemplate {
    private String name;

    public ComputerActionsTemplate(String name) {
        this.name = name;
    }

    public void doComputerWork() {
        System.out.println("User: " + name);
        System.out.println("Turn on the computer");
        diffMethod();
        System.out.println("Turn off the computer");
    }

    public abstract void diffMethod();
}
