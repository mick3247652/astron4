package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import com.app.astron.ui.widget.EmojiWrapperEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CreateConferenceDialogBinding extends ViewDataBinding {
  @NonNull
  public final Spinner account;

  @NonNull
  public final EmojiWrapperEditText groupChatName;

  protected CreateConferenceDialogBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Spinner account, EmojiWrapperEditText groupChatName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.account = account;
    this.groupChatName = groupChatName;
  }

  @NonNull
  public static CreateConferenceDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.create_conference_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CreateConferenceDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CreateConferenceDialogBinding>inflateInternal(inflater, com.app.astron.R.layout.create_conference_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static CreateConferenceDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.create_conference_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CreateConferenceDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CreateConferenceDialogBinding>inflateInternal(inflater, com.app.astron.R.layout.create_conference_dialog, null, false, component);
  }

  public static CreateConferenceDialogBinding bind(@NonNull View view) {
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
  public static CreateConferenceDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (CreateConferenceDialogBinding)bind(component, view, com.app.astron.R.layout.create_conference_dialog);
  }
}
