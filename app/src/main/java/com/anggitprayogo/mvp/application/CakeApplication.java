package com.anggitprayogo.mvp.application;

import android.app.Application;

import com.anggitprayogo.mvp.di.components.ApplicationComponent;
import com.anggitprayogo.mvp.di.components.DaggerApplicationComponent;
import com.anggitprayogo.mvp.di.module.ApplicationModule;

/**
 * Created by Anggit on 22/12/2017.
 */

public class CakeApplication extends Application{

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    //DIHASILKAN DARI REBUILD
    private void initializeApplicationComponent() {
        mApplicationComponent   =   DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this,"https://gist.github.com"))
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return mApplicationComponent;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
