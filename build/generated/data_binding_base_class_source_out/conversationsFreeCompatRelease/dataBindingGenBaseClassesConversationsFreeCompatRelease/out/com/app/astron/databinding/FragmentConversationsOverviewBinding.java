package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentConversationsOverviewBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView list;

  protected FragmentConversationsOverviewBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FloatingActionButton fab, RecyclerView list) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fab = fab;
    this.list = list;
  }

  @NonNull
  public static FragmentConversationsOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_conversations_overview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConversationsOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentConversationsOverviewBinding>inflateInternal(inflater, com.app.astron.R.layout.fragment_conversations_overview, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentConversationsOverviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_conversations_overview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConversationsOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentConversationsOverviewBinding>inflateInternal(inflater, com.app.astron.R.layout.fragment_conversations_overview, null, false, component);
  }

  public static FragmentConversationsOverviewBinding bind(@NonNull View view) {
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
  public static FragmentConversationsOverviewBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentConversationsOverviewBinding)bind(component, view, com.app.astron.R.layout.fragment_conversations_overview);
  }
}
