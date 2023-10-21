package use_case.clear_users;
import java.util.List;

// TODO Complete me

public class ClearOutputData {
    private final List<String> users;
    private boolean useCaseFailed;

    public ClearOutputData(List<String> users, boolean useCaseFailed){
        this.users = users;
        this.useCaseFailed = useCaseFailed;
    }

    public List<String> getUsers(){
        return users;
    }
}
