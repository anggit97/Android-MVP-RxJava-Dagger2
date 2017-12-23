package com.anggitprayogo.mvp.mvp.presenter;

import com.anggitprayogo.mvp.api.CakeApiService;
import com.anggitprayogo.mvp.base.BasePresenter;
import com.anggitprayogo.mvp.mapper.CakeMapper;
import com.anggitprayogo.mvp.mvp.model.Cake;
import com.anggitprayogo.mvp.mvp.model.CakeResponse;
import com.anggitprayogo.mvp.mvp.view.MainView;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;

/**
 * Created by Anggit on 22/12/2017.
 */

public class CakePresenter extends BasePresenter<MainView> implements Observer<CakeResponse>{

    @Inject protected CakeApiService mApiService;
    @Inject protected CakeMapper mCakeMapper;

    @Inject
    public CakePresenter() {
    }

    public void getCakes() {
        getView().onShowDialog("Loading Cakes...");
        Observable<CakeResponse> cakeResponseObservable = mApiService.getCakes();
        subscribe(cakeResponseObservable,this);
    }

    @Override
    public void onCompleted() {
        getView().onHideDialog();
        getView().onShowToast("Cakes Loading Completed...");
    }

    @Override
    public void onError(Throwable e) {
        getView().onHideDialog();
        getView().onShowToast("Error Loading Cakes..." + e.getMessage());
    }

    @Override
    public void onNext(CakeResponse cakeResponse) {
        List<Cake> cakes = mCakeMapper.mapCake(cakeResponse);
        getView().onCakeLoaded(cakes);
    }
}
