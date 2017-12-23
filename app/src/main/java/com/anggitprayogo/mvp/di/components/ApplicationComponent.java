package com.anggitprayogo.mvp.di.components;

import android.content.Context;

import com.anggitprayogo.mvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Anggit on 22/12/2017.
 */


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Retrofit exposeRetrofit();

    Context exposeContext();

}
