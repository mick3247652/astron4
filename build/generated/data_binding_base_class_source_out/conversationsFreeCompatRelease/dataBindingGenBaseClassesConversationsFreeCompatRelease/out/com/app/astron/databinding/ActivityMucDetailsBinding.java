package com.app.astron.databinding;

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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import com.app.astron.ui.widget.EmojiWrapperEditText;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMucDetailsBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton changeConferenceButton;

  @NonNull
  public final TextView detailsAccount;

  @NonNull
  public final ImageButton editMucNameButton;

  @NonNull
  public final ImageButton editNickButton;

  @NonNull
  public final Button invite;

  @NonNull
  public final TextView jid;

  @NonNull
  public final RecyclerView media;

  @NonNull
  public final CardView mediaWrapper;

  @NonNull
  public final TextView mucConferenceType;

  @NonNull
  public final LinearLayout mucDisplay;

  @NonNull
  public final EmojiWrapperEditText mucEditSubject;

  @NonNull
  public final EmojiWrapperEditText mucEditTitle;

  @NonNull
  public final LinearLayout mucEditor;

  @NonNull
  public final TextView mucInfoMam;

  @NonNull
  public final TableLayout mucInfoMore;

  @NonNull
  public final LinearLayout mucMainLayout;

  @NonNull
  public final TextView mucRole;

  @NonNull
  public final RelativeLayout mucSettings;

  @NonNull
  public final TextView mucSubject;

  @NonNull
  public final TextView mucTitle;

  @NonNull
  public final TextView mucYourNick;

  @NonNull
  public final TextView noUsersHints;

  @NonNull
  public final ImageButton notificationStatusButton;

  @NonNull
  public final TextView notificationStatusText;

  @NonNull
  public final Button showMedia;

  @NonNull
  public final Button showUsers;

  @NonNull
  public final View toolbar;

  @NonNull
  public final RecyclerView users;

  @NonNull
  public final CardView usersWrapper;

  @NonNull
  public final RoundedImageView yourPhoto;

  protected ActivityMucDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton changeConferenceButton, TextView detailsAccount, ImageButton editMucNameButton,
      ImageButton editNickButton, Button invite, TextView jid, RecyclerView media,
      CardView mediaWrapper, TextView mucConferenceType, LinearLayout mucDisplay,
      EmojiWrapperEditText mucEditSubject, EmojiWrapperEditText mucEditTitle,
      LinearLayout mucEditor, TextView mucInfoMam, TableLayout mucInfoMore,
      LinearLayout mucMainLayout, TextView mucRole, RelativeLayout mucSettings, TextView mucSubject,
      TextView mucTitle, TextView mucYourNick, TextView noUsersHints,
      ImageButton notificationStatusButton, TextView notificationStatusText, Button showMedia,
      Button showUsers, View toolbar, RecyclerView users, CardView usersWrapper,
      RoundedImageView yourPhoto) {
    super(_bindingComponent, _root, _localFieldCount);
    this.changeConferenceButton = changeConferenceButton;
    this.detailsAccount = detailsAccount;
    this.editMucNameButton = editMucNameButton;
    this.editNickButton = editNickButton;
    this.invite = invite;
    this.jid = jid;
    this.media = media;
    this.mediaWrapper = mediaWrapper;
    this.mucConferenceType = mucConferenceType;
    this.mucDisplay = mucDisplay;
    this.mucEditSubject = mucEditSubject;
    this.mucEditTitle = mucEditTitle;
    this.mucEditor = mucEditor;
    this.mucInfoMam = mucInfoMam;
    this.mucInfoMore = mucInfoMore;
    this.mucMainLayout = mucMainLayout;
    this.mucRole = mucRole;
    this.mucSettings = mucSettings;
    this.mucSubject = mucSubject;
    this.mucTitle = mucTitle;
    this.mucYourNick = mucYourNick;
    this.noUsersHints = noUsersHints;
    this.notificationStatusButton = notificationStatusButton;
    this.notificationStatusText = notificationStatusText;
    this.showMedia = showMedia;
    this.showUsers = showUsers;
    this.toolbar = toolbar;
    this.users = users;
    this.usersWrapper = usersWrapper;
    this.yourPhoto = yourPhoto;
  }

  @NonNull
  public static ActivityMucDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_muc_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMucDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMucDetailsBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_muc_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMucDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_muc_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMucDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMucDetailsBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_muc_details, null, false, component);
  }

  public static ActivityMucDetailsBinding bind(@NonNull View view) {
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
  public static ActivityMucDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMucDetailsBinding)bind(component, view, com.app.astron.R.layout.activity_muc_details);
  }
}
