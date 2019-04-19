package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogBlockContactBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox reportSpam;

  @NonNull
  public final TextView text;

  protected DialogBlockContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox reportSpam, TextView text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.reportSpam = reportSpam;
    this.text = text;
  }

  @NonNull
  public static DialogBlockContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_block_contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogBlockContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogBlockContactBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_block_contact, root, attachToRoot, component);
  }

  @NonNull
  public static DialogBlockContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_block_contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogBlockContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogBlockContactBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_block_contact, null, false, component);
  }

  public static DialogBlockContactBinding bind(@NonNull View view) {
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
  public static DialogBlockContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogBlockContactBinding)bind(component, view, com.app.astron.R.layout.dialog_block_contact);
  }
}
