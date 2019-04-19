package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AccountRowBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView accountImage;

  @NonNull
  public final TextView accountJid;

  @NonNull
  public final TextView accountStatus;

  @NonNull
  public final SwitchCompat tglAccountStatus;

  protected AccountRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView accountImage, TextView accountJid, TextView accountStatus,
      SwitchCompat tglAccountStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountImage = accountImage;
    this.accountJid = accountJid;
    this.accountStatus = accountStatus;
    this.tglAccountStatus = tglAccountStatus;
  }

  @NonNull
  public static AccountRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.account_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AccountRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AccountRowBinding>inflateInternal(inflater, com.app.astron.R.layout.account_row, root, attachToRoot, component);
  }

  @NonNull
  public static AccountRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.account_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AccountRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AccountRowBinding>inflateInternal(inflater, com.app.astron.R.layout.account_row, null, false, component);
  }

  public static AccountRowBinding bind(@NonNull View view) {
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
  public static AccountRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (AccountRowBinding)bind(component, view, com.app.astron.R.layout.account_row);
  }
}
