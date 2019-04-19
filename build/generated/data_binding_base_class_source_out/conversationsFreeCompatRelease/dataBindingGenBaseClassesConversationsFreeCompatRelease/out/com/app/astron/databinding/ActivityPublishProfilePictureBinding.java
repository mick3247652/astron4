package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPublishProfilePictureBinding extends ViewDataBinding {
  @NonNull
  public final ImageView accountImage;

  @NonNull
  public final FrameLayout accountImageWrapper;

  @NonNull
  public final LinearLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final TextView hint;

  @NonNull
  public final TextView hintOrWarning;

  @NonNull
  public final Button publishButton;

  @NonNull
  public final TextView secondaryHint;

  @NonNull
  public final View toolbar;

  protected ActivityPublishProfilePictureBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView accountImage, FrameLayout accountImageWrapper,
      LinearLayout buttonBar, Button cancelButton, TextView hint, TextView hintOrWarning,
      Button publishButton, TextView secondaryHint, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountImage = accountImage;
    this.accountImageWrapper = accountImageWrapper;
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.hint = hint;
    this.hintOrWarning = hintOrWarning;
    this.publishButton = publishButton;
    this.secondaryHint = secondaryHint;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityPublishProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_publish_profile_picture, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPublishProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPublishProfilePictureBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_publish_profile_picture, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPublishProfilePictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_publish_profile_picture, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPublishProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPublishProfilePictureBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_publish_profile_picture, null, false, component);
  }

  public static ActivityPublishProfilePictureBinding bind(@NonNull View view) {
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
  public static ActivityPublishProfilePictureBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityPublishProfilePictureBinding)bind(component, view, com.app.astron.R.layout.activity_publish_profile_picture);
  }
}
