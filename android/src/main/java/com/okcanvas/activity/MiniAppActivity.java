package com.okcanvas.activity;

import android.os.Bundle;
import android.app.ActivityManager;
import android.content.Context;
import android.widget.Toast;
import android.os.Build;
import android.text.TextUtils;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationManagerCompat;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;





public class MiniAppActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "MiniAppActivity";
  }

  /**
    * Demonstrates how to add a custom option to the dev menu.
    * https://stackoverflow.com/a/44882371/3968276
    * This only works from the debug build with dev options enabled.
    */
  @Override
  @CallSuper
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }



}
