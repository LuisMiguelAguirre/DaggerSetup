package com.luisaguirre.daggersetup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.luisaguirre.daggersetup.di.DaggerMainActivityComponent;
import com.luisaguirre.daggersetup.di.MainActivityComponent;
import com.luisaguirre.daggersetup.di.module.MainActivityModule;
import com.luisaguirre.daggersetup.model.RamdomUsers;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RamdomUserAdapter mAdapter;
    private Picasso picasso;
    private MainActivityComponent daggerMainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();

         daggerMainComponent = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .ramdomUserComponent(RamdomUserApplication.get(this).getRandomUserApplicationComponent())
                .build();

        populateUsers();
    }

    private void populateUsers() {
        Call<RamdomUsers> randomUsersCall = daggerMainComponent.getRandomUserService().getRamdomUsers(10);
        randomUsersCall.enqueue(new Callback<RamdomUsers>() {
            @Override
            public void onResponse(Call<RamdomUsers> call, @NonNull Response<RamdomUsers> response) {
                if (response.isSuccessful()) {
                    mAdapter = daggerMainComponent.getRandomUserAdapter();
                    mAdapter.setItems(response.body().getResults());
                    recyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailure(Call<RamdomUsers> call, Throwable t) {
                Timber.i(t.getMessage());
            }
        });
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
