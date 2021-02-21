package ai181.kozyrevych.chainOfResponsibility;

public class Birthday extends InviteController{
    public Birthday(Priority priority) {
        super(priority);
    }

    @Override
    public String write() {
        return "Invite all my friends";
    }
}
