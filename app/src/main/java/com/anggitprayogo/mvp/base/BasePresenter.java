package com.anggitprayogo.mvp.base;

import com.anggitprayogo.mvp.mvp.view.BaseView;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Anggit on 22/12/2017.
 */

public class BasePresenter<V extends BaseView> {

    @Inject protected V mView;

    protected V getView(){
        return mView;
    }

    protected <T> void subscribe(Observable<T> observable, Observer<T> observer){
        observable.subscribeOn(Schedulers.newThread())
                .toSingle()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

}
