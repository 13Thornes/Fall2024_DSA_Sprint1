public class Task {
public String description;
public String completionStatus;
public Task next;

    public void markComplete() {
    this.completionStatus = "Completed";
    }

    @Override
    public String toString() {
        return "Description: '" + description + '\'' + ", Completion Status:'" + completionStatus + '\'';
    }
}
