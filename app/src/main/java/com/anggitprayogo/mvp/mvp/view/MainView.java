package com.anggitprayogo.mvp.mvp.view;

import com.anggitprayogo.mvp.mvp.model.Cake;

import java.util.List;

/**
 * Created by Anggit on 22/12/2017.
 */

public interface MainView extends BaseView{

    void onCakeLoaded(List<Cake> cakes);

    void onShowDialog(String message);

    void onHideDialog();

    void onShowToast(String message);
}
