package use_case.clear_users;
import entity.User;
import entity.UserFactory;
import java.util.List;
//  Complete me


public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary, UserFactory userFactory){
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData){
        List<String> users = userDataAccessObject.getUsers();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(users, false);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
