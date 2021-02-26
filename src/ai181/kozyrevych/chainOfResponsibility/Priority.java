package ai181.kozyrevych.chainOfResponsibility;

public enum Priority {
    USUAL_DAY(0), WALK_MOOD(1), BIRTHDAY(2);

    private int priority;

    Priority(int priority) {
        this.priority = priority;
    }

    int getPriority() {
         return priority;
    }
}
