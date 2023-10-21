package use_case.clear_users;

// TODO Complete me

import entity.UserFactory;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupUserDataAccessInterface;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.clear_users());
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
