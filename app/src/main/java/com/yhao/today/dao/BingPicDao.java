package com.yhao.today.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.yhao.today.pojo.BingPic;

import java.util.List;

/**
 * Created by yhao on 17-11-21.
 * room dao
 */

public interface BingPicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertBingPic(BingPic... bingPics);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<Long> insertBingPic(List<BingPic> bingPics);


    @Delete
    void deleteBingPic(BingPic... bingPics);


    @Query("SELECT * FROM BingPic")
    LiveData<List<BingPic>> loadAllBingPic();

}
