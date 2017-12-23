package com.anggitprayogo.mvp.di.components;

import com.anggitprayogo.mvp.di.module.CakeModule;
import com.anggitprayogo.mvp.di.scope.PerActivity;
import com.anggitprayogo.mvp.modules.home.MainActivity;

import dagger.Component;

/**
 * Created by Anggit on 22/12/2017.
 */

@PerActivity
@Component(modules = CakeModule.class, dependencies = ApplicationComponent.class)
public interface CakeComponent {

    void inject(MainActivity activity);

}
