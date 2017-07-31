package com.rdj.carl.apimedium.user.interactor;

import com.rdj.carl.apimedium.user.presenter.UserPresenter;
import com.rdj.carl.apimedium.user.repository.UserRepository;
import com.rdj.carl.apimedium.user.repository.UserRepositoryImpl;

/**
 * Created by SEVEN on 7/27/2017.
 */

public class UserInteractorImpl implements UserInteractor{
    private UserPresenter userPresenter;
    private UserRepository userRepository;

    public UserInteractorImpl(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
        userRepository = new UserRepositoryImpl(userPresenter);

    }

    @Override
    public void getDataUser() {
        userRepository.getDataUser();
    }
}
