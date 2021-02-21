package ai181.kozyrevych.chainOfResponsibility;

public abstract class InviteController {
    private Priority priority;
    private InviteController inviteController;

    public InviteController(Priority priority) {
        this.priority = priority;
    }

    public void setNextController(InviteController inviteController) {
        this.inviteController = inviteController;
    }

    public void writeMessage(String message, Priority priority) {
        if (this.priority.getPriority() == priority.getPriority()) {
            System.out.println(write() + ": " + message);
        } else if (inviteController != null) {
            inviteController.writeMessage(message, priority);
        }
    }

    public abstract String write();
}
