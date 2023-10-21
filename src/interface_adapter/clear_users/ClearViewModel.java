package interface_adapter.clear_users;
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me
// DONE

public class ClearViewModel {
    private ClearState state = new ClearState();
    public void setState(ClearState state) {
        this.state = state;
    }
    public ClearState getState() {
        return state;
    }


}
