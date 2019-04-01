package com.yangwei.www.design.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description BaseActivity
 */
public abstract class BaseActivity extends AppCompatActivity implements Ikeys {
    protected abstract void initView();

    public void goPage(Class<? extends Activity> clas) {
        goPage(clas, null);
    }

    public void goPage(Class<? extends Activity> clas, Bundle data) {
        goPage(clas, data, -1);
    }

    public void goPage(Class<? extends Activity> clas, Bundle data, int requestCode) {
        if (clas == null) {
            return;
        }
        Intent intent = new Intent(this, clas);
        if (data != null) {
            intent.putExtra(KEY_DATA, data);
        }
        startActivityForResult(intent, requestCode);
    }
}
