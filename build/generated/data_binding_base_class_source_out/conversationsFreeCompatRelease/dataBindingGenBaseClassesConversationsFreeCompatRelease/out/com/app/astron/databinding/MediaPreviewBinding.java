package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MediaPreviewBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton deleteButton;

  @NonNull
  public final ImageView mediaPreview;

  protected MediaPreviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton deleteButton, ImageView mediaPreview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteButton = deleteButton;
    this.mediaPreview = mediaPreview;
  }

  @NonNull
  public static MediaPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.media_preview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MediaPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MediaPreviewBinding>inflateInternal(inflater, com.app.astron.R.layout.media_preview, root, attachToRoot, component);
  }

  @NonNull
  public static MediaPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.media_preview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MediaPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MediaPreviewBinding>inflateInternal(inflater, com.app.astron.R.layout.media_preview, null, false, component);
  }

  public static MediaPreviewBinding bind(@NonNull View view) {
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
  public static MediaPreviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (MediaPreviewBinding)bind(component, view, com.app.astron.R.layout.media_preview);
  }
}
