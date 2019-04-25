package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.ru.astron.ui.widget.EmojiWrapperEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CreatePublicChannelDialogBinding extends ViewDataBinding {
  @NonNull
  public final Spinner account;

  @NonNull
  public final EmojiWrapperEditText groupChatName;

  @NonNull
  public final AutoCompleteTextView jid;

  @NonNull
  public final TextInputLayout nameLayout;

  @NonNull
  public final TextInputLayout xmppAddressLayout;

  protected CreatePublicChannelDialogBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Spinner account, EmojiWrapperEditText groupChatName,
      AutoCompleteTextView jid, TextInputLayout nameLayout, TextInputLayout xmppAddressLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.account = account;
    this.groupChatName = groupChatName;
    this.jid = jid;
    this.nameLayout = nameLayout;
    this.xmppAddressLayout = xmppAddressLayout;
  }

  @NonNull
  public static CreatePublicChannelDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.create_public_channel_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CreatePublicChannelDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CreatePublicChannelDialogBinding>inflateInternal(inflater, com.ru.astron.R.layout.create_public_channel_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static CreatePublicChannelDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.create_public_channel_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CreatePublicChannelDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CreatePublicChannelDialogBinding>inflateInternal(inflater, com.ru.astron.R.layout.create_public_channel_dialog, null, false, component);
  }

  public static CreatePublicChannelDialogBinding bind(@NonNull View view) {
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
  public static CreatePublicChannelDialogBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (CreatePublicChannelDialogBinding)bind(component, view, com.ru.astron.R.layout.create_public_channel_dialog);
  }
}
