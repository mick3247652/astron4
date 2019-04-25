package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class KeysCardBinding extends ViewDataBinding {
  @NonNull
  public final CardView foreignKeysCard;

  @NonNull
  public final LinearLayout foreignKeysDetails;

  @NonNull
  public final TextView foreignKeysTitle;

  @NonNull
  public final TextView noKeysToAccept;

  protected KeysCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView foreignKeysCard, LinearLayout foreignKeysDetails, TextView foreignKeysTitle,
      TextView noKeysToAccept) {
    super(_bindingComponent, _root, _localFieldCount);
    this.foreignKeysCard = foreignKeysCard;
    this.foreignKeysDetails = foreignKeysDetails;
    this.foreignKeysTitle = foreignKeysTitle;
    this.noKeysToAccept = noKeysToAccept;
  }

  @NonNull
  public static KeysCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.keys_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static KeysCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<KeysCardBinding>inflateInternal(inflater, com.ru.astron.R.layout.keys_card, root, attachToRoot, component);
  }

  @NonNull
  public static KeysCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.keys_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static KeysCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<KeysCardBinding>inflateInternal(inflater, com.ru.astron.R.layout.keys_card, null, false, component);
  }

  public static KeysCardBinding bind(@NonNull View view) {
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
  public static KeysCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (KeysCardBinding)bind(component, view, com.ru.astron.R.layout.keys_card);
  }
}
