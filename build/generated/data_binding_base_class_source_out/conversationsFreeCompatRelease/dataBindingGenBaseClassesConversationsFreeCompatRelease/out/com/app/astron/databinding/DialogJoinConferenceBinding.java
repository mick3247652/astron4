package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.Spinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogJoinConferenceBinding extends ViewDataBinding {
  @NonNull
  public final Spinner account;

  @NonNull
  public final TextInputLayout accountJidLayout;

  @NonNull
  public final CheckBox bookmark;

  @NonNull
  public final AutoCompleteTextView jid;

  protected DialogJoinConferenceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Spinner account, TextInputLayout accountJidLayout, CheckBox bookmark,
      AutoCompleteTextView jid) {
    super(_bindingComponent, _root, _localFieldCount);
    this.account = account;
    this.accountJidLayout = accountJidLayout;
    this.bookmark = bookmark;
    this.jid = jid;
  }

  @NonNull
  public static DialogJoinConferenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_join_conference, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogJoinConferenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogJoinConferenceBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_join_conference, root, attachToRoot, component);
  }

  @NonNull
  public static DialogJoinConferenceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_join_conference, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogJoinConferenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogJoinConferenceBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_join_conference, null, false, component);
  }

  public static DialogJoinConferenceBinding bind(@NonNull View view) {
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
  public static DialogJoinConferenceBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogJoinConferenceBinding)bind(component, view, com.app.astron.R.layout.dialog_join_conference);
  }
}
