import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(String userId) {
       return userList.stream().filter(user -> user.getUserId().equals(userId)).findFirst().get();
    }

    public List<User> getAllUser() {
        return this.getAllUser();
    }
    
}
