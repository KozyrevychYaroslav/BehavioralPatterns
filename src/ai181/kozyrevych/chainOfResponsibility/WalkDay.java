package ai181.kozyrevych.chainOfResponsibility;

public class WalkDay extends InviteController {
    public WalkDay(Priority priority) {
        super(priority);
    }

    @Override
    public String write() {
        return "Invite one friend";
    }
}
