import java.util.Objects;

public class TaskList {
    private Task head;
    private Task tail;
    private int size;

    public void createToDoList(String taskDescription) {
        head = new Task();
        Task task = new Task();
        task.next = null;
        task.description = taskDescription;
        task.completionStatus = "Pending";
        head = task;
        tail = task;
        size = 1;
    }

    public void addTask(String taskDescription, int location) {
        Task task = new Task();
        task.description = taskDescription;
        task.completionStatus = "Pending";
        if (head == null) {
            createToDoList(taskDescription);
            return;
        } else if (location == 0) {
            task.next = head;
            head = task;
        } else if (location >= size) {
            tail.next = task;
            task.next = null;
            tail = task;
        } else {
            Task tempTask = head;
            int index = 0;
            while (index < location - 1) {
                tempTask = tempTask.next;
                index++;
            }
            Task nextTask = task;
            task.next = nextTask;
        }
        size++;
    }


    public void markTaskComplete(String taskDescription) {
        if (head != null){
            Task tempTask = head;
            for (int i = 0; i < size; i++){
                if (tempTask.description.equals(taskDescription)){
                    tempTask.markComplete();
                }
                tempTask = tempTask.next;
            }
        }
    }

    public void showAllTasks() {
        if (head == null) {
            System.out.println("To Do list does not exist");
        } else {
            Task tempTask = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempTask);
                tempTask = tempTask.next;
            }
        }
        System.out.println("\n");
    }

}

