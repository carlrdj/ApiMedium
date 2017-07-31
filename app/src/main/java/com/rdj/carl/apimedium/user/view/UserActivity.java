package com.rdj.carl.apimedium.user.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rdj.carl.apimedium.R;
import com.rdj.carl.apimedium.user.model.User;
import com.rdj.carl.apimedium.user.presenter.UserPresenter;
import com.rdj.carl.apimedium.user.presenter.UserPresenterImpl;
import com.squareup.picasso.Picasso;

public class UserActivity extends AppCompatActivity implements UserView{

    private TextView tvName;
    private TextView tvUserName;
    private ImageView imgProfileImage;

    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = (TextView) findViewById(R.id.tvName);
        tvUserName = (TextView) findViewById(R.id.tvUserName);
        imgProfileImage = (ImageView) findViewById(R.id.profileImage);

        userPresenter = new UserPresenterImpl(this);
        getDataUser();
    }

    @Override
    public void getDataUser() {
        userPresenter.getDataUser();
    }

    @Override
    public void showDataUser(User user) {
        tvName.setText(user.getName());
        Toast.makeText(this, user.getName().toString()+"XD", Toast.LENGTH_SHORT).show();
        tvUserName.setText(user.getUserName());
        Picasso.with(this).load(user.getImageUrl()).into(imgProfileImage);
    }

    @Override
    public void goPostList() {

    }
}
