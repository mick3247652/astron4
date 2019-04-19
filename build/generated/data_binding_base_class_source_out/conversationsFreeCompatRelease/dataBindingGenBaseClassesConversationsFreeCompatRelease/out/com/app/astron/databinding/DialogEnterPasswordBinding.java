package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.astron.ui.widget.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogEnterPasswordBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText accountPassword;

  @NonNull
  public final TextInputLayout accountPasswordLayout;

  @NonNull
  public final TextView explain;

  protected DialogEnterPasswordBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText accountPassword, TextInputLayout accountPasswordLayout, TextView explain) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountPassword = accountPassword;
    this.accountPasswordLayout = accountPasswordLayout;
    this.explain = explain;
  }

  @NonNull
  public static DialogEnterPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_enter_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogEnterPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogEnterPasswordBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_enter_password, root, attachToRoot, component);
  }

  @NonNull
  public static DialogEnterPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_enter_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogEnterPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogEnterPasswordBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_enter_password, null, false, component);
  }

  public static DialogEnterPasswordBinding bind(@NonNull View view) {
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
  public static DialogEnterPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogEnterPasswordBinding)bind(component, view, com.app.astron.R.layout.dialog_enter_password);
  }
}
