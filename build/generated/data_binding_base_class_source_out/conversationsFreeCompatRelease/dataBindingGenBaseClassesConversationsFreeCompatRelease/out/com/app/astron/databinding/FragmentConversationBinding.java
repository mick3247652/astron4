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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.astron.ui.widget.EditMessage;
import com.app.astron.ui.widget.UnreadCountCustomView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentConversationBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView mediaPreview;

  @NonNull
  public final ListView messagesView;

  @NonNull
  public final FloatingActionButton scrollToBottomButton;

  @NonNull
  public final RelativeLayout snackbar;

  @NonNull
  public final TextView snackbarAction;

  @NonNull
  public final TextView snackbarMessage;

  @NonNull
  public final ImageButton textSendButton;

  @NonNull
  public final EditMessage textinput;

  @NonNull
  public final RelativeLayout textsend;

  @NonNull
  public final UnreadCountCustomView unreadCountCustomView;

  protected FragmentConversationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView mediaPreview, ListView messagesView, FloatingActionButton scrollToBottomButton,
      RelativeLayout snackbar, TextView snackbarAction, TextView snackbarMessage,
      ImageButton textSendButton, EditMessage textinput, RelativeLayout textsend,
      UnreadCountCustomView unreadCountCustomView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mediaPreview = mediaPreview;
    this.messagesView = messagesView;
    this.scrollToBottomButton = scrollToBottomButton;
    this.snackbar = snackbar;
    this.snackbarAction = snackbarAction;
    this.snackbarMessage = snackbarMessage;
    this.textSendButton = textSendButton;
    this.textinput = textinput;
    this.textsend = textsend;
    this.unreadCountCustomView = unreadCountCustomView;
  }

  @NonNull
  public static FragmentConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_conversation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentConversationBinding>inflateInternal(inflater, com.app.astron.R.layout.fragment_conversation, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentConversationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_conversation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentConversationBinding>inflateInternal(inflater, com.app.astron.R.layout.fragment_conversation, null, false, component);
  }

  public static FragmentConversationBinding bind(@NonNull View view) {
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
  public static FragmentConversationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentConversationBinding)bind(component, view, com.app.astron.R.layout.fragment_conversation);
  }
}
