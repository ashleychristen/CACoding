package interface_adapter.clear_users;
import java.util.List;
import java.util.ArrayList;

//  Complete me

public class ClearState {
    private List<String> users = new ArrayList<>();
    public ClearState(ClearState copy){
        users = copy.users;
    }
    public ClearState(){}
    public List<String> getUsers(){
        return users;
    }
    public void setUsers(List<String> users){
        this.users = users;
    }
}
