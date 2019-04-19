package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMucUsersBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final View toolbar;

  protected ActivityMucUsersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CoordinatorLayout coordinator, RecyclerView list, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinator = coordinator;
    this.list = list;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityMucUsersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_muc_users, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMucUsersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMucUsersBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_muc_users, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMucUsersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_muc_users, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMucUsersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMucUsersBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_muc_users, null, false, component);
  }

  public static ActivityMucUsersBinding bind(@NonNull View view) {
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
  public static ActivityMucUsersBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMucUsersBinding)bind(component, view, com.app.astron.R.layout.activity_muc_users);
  }
}
