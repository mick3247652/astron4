package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.leinardi.android.speeddial.SpeedDialOverlayLayout;
import com.leinardi.android.speeddial.SpeedDialView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityStartConversationBinding extends ViewDataBinding {
  @NonNull
  public final SpeedDialOverlayLayout overlay;

  @NonNull
  public final SpeedDialView speedDial;

  @NonNull
  public final ViewPager startConversationViewPager;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final View toolbar;

  protected ActivityStartConversationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, SpeedDialOverlayLayout overlay, SpeedDialView speedDial,
      ViewPager startConversationViewPager, TabLayout tabLayout, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.overlay = overlay;
    this.speedDial = speedDial;
    this.startConversationViewPager = startConversationViewPager;
    this.tabLayout = tabLayout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityStartConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_start_conversation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityStartConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityStartConversationBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_start_conversation, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityStartConversationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_start_conversation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityStartConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityStartConversationBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_start_conversation, null, false, component);
  }

  public static ActivityStartConversationBinding bind(@NonNull View view) {
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
  public static ActivityStartConversationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityStartConversationBinding)bind(component, view, com.app.astron.R.layout.activity_start_conversation);
  }
}
