package com.yhao.today.dagger.component;

import com.yhao.today.dagger.module.MainActivityModule;
import com.yhao.today.dagger.scope.PerActivity;
import com.yhao.today.ui.MainActivity;

import dagger.Component;

/**
 * Created by yhao on 2017/11/20.
 * https://github.com/yhaolpz
 */

@PerActivity
@Component(modules = {MainActivityModule.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
