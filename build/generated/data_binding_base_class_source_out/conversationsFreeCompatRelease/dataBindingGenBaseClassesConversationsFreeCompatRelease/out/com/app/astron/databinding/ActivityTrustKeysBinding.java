package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTrustKeysBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button disableButton;

  @NonNull
  public final LinearLayout foreignKeys;

  @NonNull
  public final TextView keyErrorGeneral;

  @NonNull
  public final TextView keyErrorHintMutual;

  @NonNull
  public final TextView keyErrorMessage;

  @NonNull
  public final CardView keyErrorMessageCard;

  @NonNull
  public final TextView keyErrorMessageTitle;

  @NonNull
  public final CardView ownKeysCard;

  @NonNull
  public final LinearLayout ownKeysDetails;

  @NonNull
  public final TextView ownKeysTitle;

  @NonNull
  public final Button saveButton;

  @NonNull
  public final View toolbar;

  protected ActivityTrustKeysBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout buttonBar, Button cancelButton, Button disableButton, LinearLayout foreignKeys,
      TextView keyErrorGeneral, TextView keyErrorHintMutual, TextView keyErrorMessage,
      CardView keyErrorMessageCard, TextView keyErrorMessageTitle, CardView ownKeysCard,
      LinearLayout ownKeysDetails, TextView ownKeysTitle, Button saveButton, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.disableButton = disableButton;
    this.foreignKeys = foreignKeys;
    this.keyErrorGeneral = keyErrorGeneral;
    this.keyErrorHintMutual = keyErrorHintMutual;
    this.keyErrorMessage = keyErrorMessage;
    this.keyErrorMessageCard = keyErrorMessageCard;
    this.keyErrorMessageTitle = keyErrorMessageTitle;
    this.ownKeysCard = ownKeysCard;
    this.ownKeysDetails = ownKeysDetails;
    this.ownKeysTitle = ownKeysTitle;
    this.saveButton = saveButton;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_trust_keys, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTrustKeysBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_trust_keys, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_trust_keys, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTrustKeysBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_trust_keys, null, false, component);
  }

  public static ActivityTrustKeysBinding bind(@NonNull View view) {
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
  public static ActivityTrustKeysBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTrustKeysBinding)bind(component, view, com.app.astron.R.layout.activity_trust_keys);
  }
}
