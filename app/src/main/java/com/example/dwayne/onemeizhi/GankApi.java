package com.example.dwayne.onemeizhi;

import com.example.dwayne.onemeizhi.data.MeizhiData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


/**
 * Created by Dwayne on 2017/11/25.
 */

public interface GankApi {
    @GET("data/福利/" + 1 + "/{page}")
    Observable<MeizhiData> getMeizhiData(@Path("page") int page);
}
