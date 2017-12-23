package com.anggitprayogo.mvp.modules.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.anggitprayogo.mvp.R;
import com.anggitprayogo.mvp.base.BaseActivity;
import com.anggitprayogo.mvp.di.components.DaggerCakeComponent;
import com.anggitprayogo.mvp.di.module.CakeModule;
import com.anggitprayogo.mvp.modules.home.adapter.CakeAdapter;
import com.anggitprayogo.mvp.mvp.model.Cake;
import com.anggitprayogo.mvp.mvp.presenter.CakePresenter;
import com.anggitprayogo.mvp.mvp.view.MainView;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements MainView{

    @Bind(R.id.cake_list)protected RecyclerView mCakeList;

    @Inject protected CakePresenter mPresenter;

    private CakeAdapter mCakeAdapter;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        initializeList();
        mPresenter.getCakes();
    }

    private void initializeList() {
        mCakeList.setHasFixedSize(true);
        mCakeList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mCakeAdapter    =  new CakeAdapter(getLayoutInflater());
        mCakeList.setAdapter(mCakeAdapter);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    //DIHASIL KAN DARI REBUILD
    @Override
    protected void resolveDaggerDepedency() {
        DaggerCakeComponent.builder()
        .applicationComponent(getApplicationComponent())
        .cakeModule(new CakeModule(this))
        .build().inject(this);
    }

    @Override
    public void onCakeLoaded(List<Cake> cakes) {
        mCakeAdapter.addCakes(cakes);
    }

    @Override
    public void onShowDialog(String message) {
        showDialog(message);
    }

    @Override
    public void onHideDialog() {
        hideDialog();
    }

    @Override
    public void onShowToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
