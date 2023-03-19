
package com.okcanvas.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.util.Base64;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class RNActivityModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNActivityModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNActivityManager";
  }

  @ReactMethod
  void navigateToExample() {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      //Intent intent = new Intent(activity, MiniAppActivity.class);
      Intent intent = new Intent(activity, Class.forName("com.okcanvas.activity.MiniAppActivity"));
      activity.startActivity(intent);
    }
  }

  @ReactMethod
  void dialNumber(@NonNull String number) {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
      activity.startActivity(intent);
    }
  }

  @ReactMethod
  void getActivityName(@NonNull Callback callback) {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      callback.invoke(activity.getClass().getSimpleName());
    } else {
      callback.invoke("No current activity");
    }
  }

  @ReactMethod
  void getActivityNameAsPromise(@NonNull Promise promise) {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      promise.resolve(activity.getClass().getSimpleName());
    } else {
      promise.reject("NO_ACTIVITY", "No current activity");
    }
  }

}