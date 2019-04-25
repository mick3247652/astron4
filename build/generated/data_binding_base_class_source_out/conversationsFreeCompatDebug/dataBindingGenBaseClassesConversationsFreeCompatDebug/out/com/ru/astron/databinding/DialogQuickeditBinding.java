package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ru.astron.ui.widget.EmojiWrapperEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogQuickeditBinding extends ViewDataBinding {
  @NonNull
  public final EmojiWrapperEditText inputEditText;

  @NonNull
  public final TextInputLayout inputLayout;

  protected DialogQuickeditBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EmojiWrapperEditText inputEditText, TextInputLayout inputLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputEditText = inputEditText;
    this.inputLayout = inputLayout;
  }

  @NonNull
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_quickedit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogQuickeditBinding>inflateInternal(inflater, com.ru.astron.R.layout.dialog_quickedit, root, attachToRoot, component);
  }

  @NonNull
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_quickedit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogQuickeditBinding>inflateInternal(inflater, com.ru.astron.R.layout.dialog_quickedit, null, false, component);
  }

  public static DialogQuickeditBinding bind(@NonNull View view) {
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
  public static DialogQuickeditBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogQuickeditBinding)bind(component, view, com.ru.astron.R.layout.dialog_quickedit);
  }
}
