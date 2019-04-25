package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class UserPreviewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatar;

  protected UserPreviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView avatar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
  }

  @NonNull
  public static UserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_preview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UserPreviewBinding>inflateInternal(inflater, com.ru.astron.R.layout.user_preview, root, attachToRoot, component);
  }

  @NonNull
  public static UserPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_preview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UserPreviewBinding>inflateInternal(inflater, com.ru.astron.R.layout.user_preview, null, false, component);
  }

  public static UserPreviewBinding bind(@NonNull View view) {
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
  public static UserPreviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (UserPreviewBinding)bind(component, view, com.ru.astron.R.layout.user_preview);
  }
}
