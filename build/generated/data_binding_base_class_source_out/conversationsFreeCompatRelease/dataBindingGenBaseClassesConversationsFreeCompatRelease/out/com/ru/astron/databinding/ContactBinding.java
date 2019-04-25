package com.ru.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.wefika.flowlayout.FlowLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContactBinding extends ViewDataBinding {
  @NonNull
  public final TextView contactDisplayName;

  @NonNull
  public final TextView contactJid;

  @NonNull
  public final RoundedImageView contactPhoto;

  @NonNull
  public final TextView key;

  @NonNull
  public final FlowLayout tags;

  protected ContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView contactDisplayName, TextView contactJid, RoundedImageView contactPhoto, TextView key,
      FlowLayout tags) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contactDisplayName = contactDisplayName;
    this.contactJid = contactJid;
    this.contactPhoto = contactPhoto;
    this.key = key;
    this.tags = tags;
  }

  @NonNull
  public static ContactBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContactBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContactBinding>inflateInternal(inflater, com.ru.astron.R.layout.contact, root, attachToRoot, component);
  }

  @NonNull
  public static ContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContactBinding>inflateInternal(inflater, com.ru.astron.R.layout.contact, null, false, component);
  }

  public static ContactBinding bind(@NonNull View view) {
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
  public static ContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContactBinding)bind(component, view, com.ru.astron.R.layout.contact);
  }
}
