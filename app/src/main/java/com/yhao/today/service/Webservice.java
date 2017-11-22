package com.yhao.today.service;

import android.arch.lifecycle.LiveData;

import com.yhao.today.pojo.BingPic;
import com.yhao.today.pojo.Body;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yhao on 2017/11/21.
 * https://github.com/yhaolpz
 */

public interface Webservice {


    @GET("1287-1?showapi_sign=758d7ae717294581b8b44a4668d01e8b&showapi_appid=50325")
    LiveData<WrapResult<Body<BingPic>>> getBingPic();

    @GET("1287-1?showapi_sign=758d7ae717294581b8b44a4668d01e8b&showapi_appid=50325")
    Call<WrapResult<Body<BingPic>>> getBingPicCall();


}
