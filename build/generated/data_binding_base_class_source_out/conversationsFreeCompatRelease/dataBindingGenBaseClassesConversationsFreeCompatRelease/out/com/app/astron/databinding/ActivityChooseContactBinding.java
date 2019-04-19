package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityChooseContactBinding extends ViewDataBinding {
  @NonNull
  public final ListView chooseContactList;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final View toolbar;

  protected ActivityChooseContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ListView chooseContactList, FloatingActionButton fab, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chooseContactList = chooseContactList;
    this.fab = fab;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityChooseContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_choose_contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChooseContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityChooseContactBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_choose_contact, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityChooseContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_choose_contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChooseContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityChooseContactBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_choose_contact, null, false, component);
  }

  public static ActivityChooseContactBinding bind(@NonNull View view) {
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
  public static ActivityChooseContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityChooseContactBinding)bind(component, view, com.app.astron.R.layout.activity_choose_contact);
  }
}
