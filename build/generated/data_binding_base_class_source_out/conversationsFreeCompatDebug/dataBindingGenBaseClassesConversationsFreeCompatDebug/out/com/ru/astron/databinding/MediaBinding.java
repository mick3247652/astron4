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

public abstract class MediaBinding extends ViewDataBinding {
  @NonNull
  public final ImageView media;

  protected MediaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView media) {
    super(_bindingComponent, _root, _localFieldCount);
    this.media = media;
  }

  @NonNull
  public static MediaBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.media, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MediaBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MediaBinding>inflateInternal(inflater, com.ru.astron.R.layout.media, root, attachToRoot, component);
  }

  @NonNull
  public static MediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.media, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MediaBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<MediaBinding>inflateInternal(inflater, com.ru.astron.R.layout.media, null, false, component);
  }

  public static MediaBinding bind(@NonNull View view) {
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
  public static MediaBinding bind(@NonNull View view, @Nullable Object component) {
    return (MediaBinding)bind(component, view, com.ru.astron.R.layout.media);
  }
}
