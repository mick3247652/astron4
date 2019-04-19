package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Deprecated;
import java.lang.Object;
import org.osmdroid.views.MapView;

public abstract class ActivityShowLocationBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final MapView map;

  @NonNull
  public final View toolbar;

  protected ActivityShowLocationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fab, MapView map, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fab = fab;
    this.map = map;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityShowLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_show_location, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityShowLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityShowLocationBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_show_location, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityShowLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_show_location, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityShowLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityShowLocationBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_show_location, null, false, component);
  }

  public static ActivityShowLocationBinding bind(@NonNull View view) {
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
  public static ActivityShowLocationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityShowLocationBinding)bind(component, view, com.app.astron.R.layout.activity_show_location);
  }
}
