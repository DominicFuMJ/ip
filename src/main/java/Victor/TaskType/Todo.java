package Victor.TaskType;
public class Todo extends Task {

    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String saveInput() {
        return "T | " + isDone + " | " + description;
    }
}