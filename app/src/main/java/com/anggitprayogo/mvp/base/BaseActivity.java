package com.anggitprayogo.mvp.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.anggitprayogo.mvp.application.CakeApplication;
import com.anggitprayogo.mvp.di.components.ApplicationComponent;

import butterknife.ButterKnife;

/**
 * Created by Anggit on 22/12/2017.
 *
 * This class is to be the base of all sub activitiy or to be abstract
 */

public abstract class BaseActivity extends AppCompatActivity{

    ProgressDialog  mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
        onViewReady(savedInstanceState,getIntent());
    }

    //Digunakan oleh child activity daripada menggunakan Override Oncreate
    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        resolveDaggerDepedency();
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }

    protected void resolveDaggerDepedency() {}

    protected void showDialog(String message){
        if(mProgressDialog  == null){
            mProgressDialog =   new ProgressDialog(this);
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setCancelable(false);
        }
        mProgressDialog.setMessage(message);
        mProgressDialog.show();
    }

    protected void hideDialog(){
        if (mProgressDialog != null && mProgressDialog.isShowing()){
            mProgressDialog.dismiss();
        }
    }

    protected ApplicationComponent getApplicationComponent(){
        return ((CakeApplication)getApplication()).getApplicationComponent();
    }

    //memaksa setiap sub activity atau child activity untuk menggunakan getContentView()
    protected abstract int getContentView();
}
