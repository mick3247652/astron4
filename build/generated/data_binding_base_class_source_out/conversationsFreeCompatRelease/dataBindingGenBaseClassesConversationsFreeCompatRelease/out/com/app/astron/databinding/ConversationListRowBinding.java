package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.astron.ui.widget.UnreadCountCustomView;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ConversationListRowBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView conversationImage;

  @NonNull
  public final TextView conversationLastmsg;

  @NonNull
  public final ImageView conversationLastmsgImg;

  @NonNull
  public final TextView conversationLastupdate;

  @NonNull
  public final RelativeLayout conversationLastwrapper;

  @NonNull
  public final TextView conversationName;

  @NonNull
  public final FrameLayout frame;

  @NonNull
  public final ImageView notificationStatus;

  @NonNull
  public final TextView senderName;

  @NonNull
  public final LinearLayout txtImgWrapper;

  @NonNull
  public final UnreadCountCustomView unreadCount;

  protected ConversationListRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView conversationImage, TextView conversationLastmsg,
      ImageView conversationLastmsgImg, TextView conversationLastupdate,
      RelativeLayout conversationLastwrapper, TextView conversationName, FrameLayout frame,
      ImageView notificationStatus, TextView senderName, LinearLayout txtImgWrapper,
      UnreadCountCustomView unreadCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.conversationImage = conversationImage;
    this.conversationLastmsg = conversationLastmsg;
    this.conversationLastmsgImg = conversationLastmsgImg;
    this.conversationLastupdate = conversationLastupdate;
    this.conversationLastwrapper = conversationLastwrapper;
    this.conversationName = conversationName;
    this.frame = frame;
    this.notificationStatus = notificationStatus;
    this.senderName = senderName;
    this.txtImgWrapper = txtImgWrapper;
    this.unreadCount = unreadCount;
  }

  @NonNull
  public static ConversationListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conversation_list_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ConversationListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ConversationListRowBinding>inflateInternal(inflater, com.app.astron.R.layout.conversation_list_row, root, attachToRoot, component);
  }

  @NonNull
  public static ConversationListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conversation_list_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ConversationListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ConversationListRowBinding>inflateInternal(inflater, com.app.astron.R.layout.conversation_list_row, null, false, component);
  }

  public static ConversationListRowBinding bind(@NonNull View view) {
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
  public static ConversationListRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (ConversationListRowBinding)bind(component, view, com.app.astron.R.layout.conversation_list_row);
  }
}
