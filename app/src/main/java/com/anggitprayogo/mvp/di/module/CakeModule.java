package com.anggitprayogo.mvp.di.module;

import com.anggitprayogo.mvp.api.CakeApiService;
import com.anggitprayogo.mvp.di.scope.PerActivity;
import com.anggitprayogo.mvp.mvp.view.MainView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Anggit on 22/12/2017.
 */
@Module
public class CakeModule {

    private MainView mView;

    public CakeModule(MainView mainView){
        mView   =   mainView;
    }

    @PerActivity
    @Provides
    CakeApiService provideApiService(Retrofit retrofit){
        return retrofit.create(CakeApiService.class);
    }

    @PerActivity
    @Provides
    MainView provideView(){
        return mView;
    }
}
