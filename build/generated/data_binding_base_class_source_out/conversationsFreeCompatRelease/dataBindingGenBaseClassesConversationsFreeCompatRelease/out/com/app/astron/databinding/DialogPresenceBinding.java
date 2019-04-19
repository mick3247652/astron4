package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.app.astron.ui.widget.ImmediateAutoCompleteTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogPresenceBinding extends ViewDataBinding {
  @NonNull
  public final RadioButton away;

  @NonNull
  public final RadioButton dnd;

  @NonNull
  public final RadioButton online;

  @NonNull
  public final RadioGroup show;

  @NonNull
  public final ImmediateAutoCompleteTextView statusMessage;

  @NonNull
  public final RadioButton xa;

  protected DialogPresenceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioButton away, RadioButton dnd, RadioButton online, RadioGroup show,
      ImmediateAutoCompleteTextView statusMessage, RadioButton xa) {
    super(_bindingComponent, _root, _localFieldCount);
    this.away = away;
    this.dnd = dnd;
    this.online = online;
    this.show = show;
    this.statusMessage = statusMessage;
    this.xa = xa;
  }

  @NonNull
  public static DialogPresenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_presence, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogPresenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogPresenceBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_presence, root, attachToRoot, component);
  }

  @NonNull
  public static DialogPresenceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_presence, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogPresenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogPresenceBinding>inflateInternal(inflater, com.app.astron.R.layout.dialog_presence, null, false, component);
  }

  public static DialogPresenceBinding bind(@NonNull View view) {
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
  public static DialogPresenceBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogPresenceBinding)bind(component, view, com.app.astron.R.layout.dialog_presence);
  }
}
