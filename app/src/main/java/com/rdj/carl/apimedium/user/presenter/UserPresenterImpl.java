package com.rdj.carl.apimedium.user.presenter;

import com.rdj.carl.apimedium.user.interactor.UserInteractor;
import com.rdj.carl.apimedium.user.interactor.UserInteractorImpl;
import com.rdj.carl.apimedium.user.model.User;
import com.rdj.carl.apimedium.user.view.UserView;

/**
 * Created by SEVEN on 7/27/2017.
 */

public class UserPresenterImpl implements UserPresenter {
    private UserView userView;
    private UserInteractor userInteractor;

    public UserPresenterImpl(UserView userView) {
        this.userView = userView;
        userInteractor = new UserInteractorImpl(this);
    }

    @Override
    public void getDataUser() {
        userInteractor.getDataUser();
    }

    @Override
    public void showDataUser(User user) {
        userView.showDataUser(user);
    }
}
