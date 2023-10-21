package interface_adapter.clear_users;

//  Complete me
// import interface_adapter.clear_users.ClearViewModel;

import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import java.util.List;

public class ClearPresenter implements ClearOutputBoundary{
    private final ClearViewModel clearViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response){
        ClearState clearState = clearViewModel.getState();
        clearState.setUsers(response.getUsers());
    }
}
