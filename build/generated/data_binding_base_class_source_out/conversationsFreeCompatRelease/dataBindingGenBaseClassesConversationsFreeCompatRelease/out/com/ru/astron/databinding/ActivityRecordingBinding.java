package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRecordingBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button shareButton;

  @NonNull
  public final TextView timer;

  protected ActivityRecordingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout buttonBar, Button cancelButton, Button shareButton, TextView timer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.shareButton = shareButton;
    this.timer = timer;
  }

  @NonNull
  public static ActivityRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recording, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRecordingBinding>inflateInternal(inflater, com.ru.astron.R.layout.activity_recording, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRecordingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recording, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRecordingBinding>inflateInternal(inflater, com.ru.astron.R.layout.activity_recording, null, false, component);
  }

  public static ActivityRecordingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityRecordingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRecordingBinding)bind(component, view, com.ru.astron.R.layout.activity_recording);
  }
}
