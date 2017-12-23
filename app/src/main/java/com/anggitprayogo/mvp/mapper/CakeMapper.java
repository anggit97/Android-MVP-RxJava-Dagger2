package com.anggitprayogo.mvp.mapper;

import com.anggitprayogo.mvp.mvp.model.Cake;
import com.anggitprayogo.mvp.mvp.model.CakeResponse;
import com.anggitprayogo.mvp.mvp.model.Cakes;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Anggit on 23/12/2017.
 */

public class CakeMapper {

    @Inject
    public CakeMapper() {
    }

    public List<Cake> mapCake(CakeResponse response){
        List<Cake> cakeList =   new ArrayList<>();

        if (response != null) {
            List<Cakes> responseCakes = response.getCakes();
            if (responseCakes != null) {
                for (Cakes cake : responseCakes) {
                    Cake    myCake  =   new Cake();
                    myCake.setId(cake.getId());
                    myCake.setTitle(cake.getTitle());
                    myCake.setDetaildescription(cake.getDetaildescription());
                    myCake.setPreviewdescription(cake.getPreviewdescription());
                    myCake.setImage(cake.getImage());
                    cakeList.add(myCake);
                }
            }
        }

        return cakeList;
    }
}
