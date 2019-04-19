package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchBinding extends ViewDataBinding {
  @NonNull
  public final ListView searchResults;

  @NonNull
  public final View toolbar;

  protected ActivitySearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ListView searchResults, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchResults = searchResults;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_search, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_search, null, false, component);
  }

  public static ActivitySearchBinding bind(@NonNull View view) {
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
  public static ActivitySearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySearchBinding)bind(component, view, com.app.astron.R.layout.activity_search);
  }
}
