package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityImportBackupBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final LinearLayout inProgress;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final View toolbar;

  protected ActivityImportBackupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CoordinatorLayout coordinator, LinearLayout inProgress, RecyclerView list, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinator = coordinator;
    this.inProgress = inProgress;
    this.list = list;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityImportBackupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_import_backup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImportBackupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityImportBackupBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_import_backup, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityImportBackupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_import_backup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImportBackupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityImportBackupBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_import_backup, null, false, component);
  }

  public static ActivityImportBackupBinding bind(@NonNull View view) {
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
  public static ActivityImportBackupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityImportBackupBinding)bind(component, view, com.app.astron.R.layout.activity_import_backup);
  }
}
