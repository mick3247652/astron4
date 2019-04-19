package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContactKeyBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout actionContainer;

  @NonNull
  public final ImageButton buttonEnableDevice;

  @NonNull
  public final ImageButton buttonRemove;

  @NonNull
  public final TextView key;

  @NonNull
  public final TextView keyType;

  @NonNull
  public final SwitchCompat tglTrust;

  @NonNull
  public final ImageView verifiedFingerprint;

  protected ContactKeyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout actionContainer, ImageButton buttonEnableDevice, ImageButton buttonRemove,
      TextView key, TextView keyType, SwitchCompat tglTrust, ImageView verifiedFingerprint) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionContainer = actionContainer;
    this.buttonEnableDevice = buttonEnableDevice;
    this.buttonRemove = buttonRemove;
    this.key = key;
    this.keyType = keyType;
    this.tglTrust = tglTrust;
    this.verifiedFingerprint = verifiedFingerprint;
  }

  @NonNull
  public static ContactKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact_key, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContactKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContactKeyBinding>inflateInternal(inflater, com.app.astron.R.layout.contact_key, root, attachToRoot, component);
  }

  @NonNull
  public static ContactKeyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact_key, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContactKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContactKeyBinding>inflateInternal(inflater, com.app.astron.R.layout.contact_key, null, false, component);
  }

  public static ContactKeyBinding bind(@NonNull View view) {
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
  public static ContactKeyBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContactKeyBinding)bind(component, view, com.app.astron.R.layout.contact_key);
  }
}
