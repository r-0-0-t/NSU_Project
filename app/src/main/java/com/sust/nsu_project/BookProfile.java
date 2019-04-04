package com.sust.nsu_project;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_profile);
    }

    public void becomesellerclick(View view) {
        fragment = new BecomeSellerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }

    public void takeCourse(View view) {
        fragment = new TakeCourseFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }
    private Fragment fragment;
    public void findSeller(View view) {
        fragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }
}
