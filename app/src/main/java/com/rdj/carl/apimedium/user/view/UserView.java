package com.rdj.carl.apimedium.user.view;

import com.rdj.carl.apimedium.user.model.User;

/**
 * Created by SEVEN on 7/27/2017.
 */

public interface UserView {
    void getDataUser();
    void showDataUser(User user);
    void goPostList();
}
