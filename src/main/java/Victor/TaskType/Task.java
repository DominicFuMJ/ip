package Victor.TaskType;
public class Task {
        protected String description;
        protected boolean isDone;



        public Task(String description, boolean isDone) {
            this.description = description;
            this.isDone = isDone;
        }

        public String getStatusIcon() {
            return (isDone ? "X" : " "); // mark done task with X
        }


        public void markAsDone() {
            this.isDone = true;
        }

        public void unmarkAsDone() {
            this.isDone = false;
        }

        public String toString() {
            return "[" + getStatusIcon() + "] " + description;
        }

    public String saveInput() {
        return "T | " + isDone + " | " + description;
    }
}
