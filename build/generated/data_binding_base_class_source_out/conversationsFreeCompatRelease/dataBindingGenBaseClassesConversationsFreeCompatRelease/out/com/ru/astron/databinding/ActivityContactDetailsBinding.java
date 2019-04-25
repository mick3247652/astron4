package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import com.wefika.flowlayout.FlowLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityContactDetailsBinding extends ViewDataBinding {
  @NonNull
  public final Button addContactButton;

  @NonNull
  public final TextView detailsAccount;

  @NonNull
  public final QuickContactBadge detailsContactBadge;

  @NonNull
  public final LinearLayout detailsContactKeys;

  @NonNull
  public final TextView detailsContactjid;

  @NonNull
  public final LinearLayout detailsJidbox;

  @NonNull
  public final TextView detailsLastseen;

  @NonNull
  public final LinearLayout detailsMainLayout;

  @NonNull
  public final CheckBox detailsReceivePresence;

  @NonNull
  public final CheckBox detailsSendPresence;

  @NonNull
  public final CardView keysWrapper;

  @NonNull
  public final RecyclerView media;

  @NonNull
  public final CardView mediaWrapper;

  @NonNull
  public final Button scanButton;

  @NonNull
  public final Button showInactiveDevices;

  @NonNull
  public final Button showMedia;

  @NonNull
  public final TextView statusMessage;

  @NonNull
  public final FlowLayout tags;

  @NonNull
  public final View toolbar;

  protected ActivityContactDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button addContactButton, TextView detailsAccount,
      QuickContactBadge detailsContactBadge, LinearLayout detailsContactKeys,
      TextView detailsContactjid, LinearLayout detailsJidbox, TextView detailsLastseen,
      LinearLayout detailsMainLayout, CheckBox detailsReceivePresence, CheckBox detailsSendPresence,
      CardView keysWrapper, RecyclerView media, CardView mediaWrapper, Button scanButton,
      Button showInactiveDevices, Button showMedia, TextView statusMessage, FlowLayout tags,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addContactButton = addContactButton;
    this.detailsAccount = detailsAccount;
    this.detailsContactBadge = detailsContactBadge;
    this.detailsContactKeys = detailsContactKeys;
    this.detailsContactjid = detailsContactjid;
    this.detailsJidbox = detailsJidbox;
    this.detailsLastseen = detailsLastseen;
    this.detailsMainLayout = detailsMainLayout;
    this.detailsReceivePresence = detailsReceivePresence;
    this.detailsSendPresence = detailsSendPresence;
    this.keysWrapper = keysWrapper;
    this.media = media;
    this.mediaWrapper = mediaWrapper;
    this.scanButton = scanButton;
    this.showInactiveDevices = showInactiveDevices;
    this.showMedia = showMedia;
    this.statusMessage = statusMessage;
    this.tags = tags;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contact_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityContactDetailsBinding>inflateInternal(inflater, com.ru.astron.R.layout.activity_contact_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contact_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityContactDetailsBinding>inflateInternal(inflater, com.ru.astron.R.layout.activity_contact_details, null, false, component);
  }

  public static ActivityContactDetailsBinding bind(@NonNull View view) {
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
  public static ActivityContactDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityContactDetailsBinding)bind(component, view, com.ru.astron.R.layout.activity_contact_details);
  }
}
