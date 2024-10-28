import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<User>();

        User user1 = new User("Sam");
        User user2 = new User("John");
        User user3 = new User("Jenny");
        User user4 = new User("George");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        userList.get(0).addTask("Walk Dog",0);
        userList.get(0).addTask("Do Dishes",1);
        userList.get(0).markTaskComplete("Walk Dog");
        userList.get(0).showAllTasks();

        userList.get(1).addTask("Rake Leaves",0);
        userList.get(1).addTask("Do Laundry",1);
        userList.get(1).markTaskComplete("Rake Leaves");
        userList.get(1).showAllTasks();

        userList.get(2).addTask("Pay Bills",0);
        userList.get(2).addTask("Do Homework",1);
        userList.get(2).markTaskComplete("Do Homework");
        userList.get(2).showAllTasks();

        userList.get(3).addTask("Dust",0);
        userList.get(3).addTask("Mop",1);
        userList.get(3).markTaskComplete("Mop");
        userList.get(3).showAllTasks();

    }

}
