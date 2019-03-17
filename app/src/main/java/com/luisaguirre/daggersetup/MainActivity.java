package com.luisaguirre.daggersetup;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.luisaguirre.daggersetup.di.module.ContextModule;
import com.luisaguirre.daggersetup.di.DaggerRamdomUserComponent;
import com.luisaguirre.daggersetup.di.RamdomUserComponent;
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
    private RamdomUserComponent daggerRamdomUserComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        daggerRamdomUserComponent = DaggerRamdomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        initViews();

        picasso = daggerRamdomUserComponent.getPicasso();

        populateUsers();
    }

    private void populateUsers() {
        Call<RamdomUsers> randomUsersCall = daggerRamdomUserComponent.getRamdomUserService().getRamdomUsers(10);
        randomUsersCall.enqueue(new Callback<RamdomUsers>() {
            @Override
            public void onResponse(Call<RamdomUsers> call, @NonNull Response<RamdomUsers> response) {
                if (response.isSuccessful()) {
                    mAdapter = new RamdomUserAdapter(MainActivity.this, picasso);
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
