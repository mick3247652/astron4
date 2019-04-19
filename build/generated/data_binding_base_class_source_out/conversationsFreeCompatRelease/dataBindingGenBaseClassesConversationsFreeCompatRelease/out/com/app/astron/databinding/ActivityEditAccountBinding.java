package com.app.astron.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.app.astron.ui.widget.TextInputEditText;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityEditAccountBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText accountJid;

  @NonNull
  public final TextInputLayout accountJidLayout;

  @NonNull
  public final LinearLayout accountMainLayout;

  @NonNull
  public final TextInputEditText accountPassword;

  @NonNull
  public final TextInputLayout accountPasswordLayout;

  @NonNull
  public final CheckBox accountRegisterNew;

  @NonNull
  public final ImageButton actionCopyAxolotlToClipboard;

  @NonNull
  public final ImageButton actionDeletePgp;

  @NonNull
  public final ImageButton actionEditYourName;

  @NonNull
  public final ImageButton actionRegenerateAxolotlKey;

  @NonNull
  public final RoundedImageView avater;

  @NonNull
  public final LinearLayout axolotlActions;

  @NonNull
  public final TextView axolotlFingerprint;

  @NonNull
  public final RelativeLayout axolotlFingerprintBox;

  @NonNull
  public final LinearLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button clearDevices;

  @NonNull
  public final CardView editor;

  @NonNull
  public final EditText hostname;

  @NonNull
  public final TextInputLayout hostnameLayout;

  @NonNull
  public final LinearLayout namePort;

  @NonNull
  public final CardView osOptimization;

  @NonNull
  public final TextView osOptimizationBody;

  @NonNull
  public final Button osOptimizationDisable;

  @NonNull
  public final TextView osOptimizationHeadline;

  @NonNull
  public final LinearLayout otherDeviceKeys;

  @NonNull
  public final CardView otherDeviceKeysCard;

  @NonNull
  public final TextView otherDeviceKeysTitle;

  @NonNull
  public final TextView ownFingerprintDesc;

  @NonNull
  public final TextView pgpFingerprint;

  @NonNull
  public final RelativeLayout pgpFingerprintBox;

  @NonNull
  public final TextView pgpFingerprintDesc;

  @NonNull
  public final EditText port;

  @NonNull
  public final TextInputLayout portLayout;

  @NonNull
  public final TableRow pushRow;

  @NonNull
  public final Button saveButton;

  @NonNull
  public final TextView serverInfoBlocking;

  @NonNull
  public final TextView serverInfoCarbons;

  @NonNull
  public final TextView serverInfoCsi;

  @NonNull
  public final TextView serverInfoHttpUpload;

  @NonNull
  public final TextView serverInfoHttpUploadDescription;

  @NonNull
  public final TextView serverInfoMam;

  @NonNull
  public final TableLayout serverInfoMore;

  @NonNull
  public final TextView serverInfoPep;

  @NonNull
  public final TextView serverInfoPush;

  @NonNull
  public final TextView serverInfoRosterVersion;

  @NonNull
  public final TextView serverInfoSm;

  @NonNull
  public final TextView sessionEst;

  @NonNull
  public final CardView stats;

  @NonNull
  public final View toolbar;

  @NonNull
  public final TextView yourName;

  @NonNull
  public final RelativeLayout yourNameBox;

  @NonNull
  public final TextView yourNameDesc;

  protected ActivityEditAccountBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText accountJid, TextInputLayout accountJidLayout,
      LinearLayout accountMainLayout, TextInputEditText accountPassword,
      TextInputLayout accountPasswordLayout, CheckBox accountRegisterNew,
      ImageButton actionCopyAxolotlToClipboard, ImageButton actionDeletePgp,
      ImageButton actionEditYourName, ImageButton actionRegenerateAxolotlKey,
      RoundedImageView avater, LinearLayout axolotlActions, TextView axolotlFingerprint,
      RelativeLayout axolotlFingerprintBox, LinearLayout buttonBar, Button cancelButton,
      Button clearDevices, CardView editor, EditText hostname, TextInputLayout hostnameLayout,
      LinearLayout namePort, CardView osOptimization, TextView osOptimizationBody,
      Button osOptimizationDisable, TextView osOptimizationHeadline, LinearLayout otherDeviceKeys,
      CardView otherDeviceKeysCard, TextView otherDeviceKeysTitle, TextView ownFingerprintDesc,
      TextView pgpFingerprint, RelativeLayout pgpFingerprintBox, TextView pgpFingerprintDesc,
      EditText port, TextInputLayout portLayout, TableRow pushRow, Button saveButton,
      TextView serverInfoBlocking, TextView serverInfoCarbons, TextView serverInfoCsi,
      TextView serverInfoHttpUpload, TextView serverInfoHttpUploadDescription,
      TextView serverInfoMam, TableLayout serverInfoMore, TextView serverInfoPep,
      TextView serverInfoPush, TextView serverInfoRosterVersion, TextView serverInfoSm,
      TextView sessionEst, CardView stats, View toolbar, TextView yourName,
      RelativeLayout yourNameBox, TextView yourNameDesc) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountJid = accountJid;
    this.accountJidLayout = accountJidLayout;
    this.accountMainLayout = accountMainLayout;
    this.accountPassword = accountPassword;
    this.accountPasswordLayout = accountPasswordLayout;
    this.accountRegisterNew = accountRegisterNew;
    this.actionCopyAxolotlToClipboard = actionCopyAxolotlToClipboard;
    this.actionDeletePgp = actionDeletePgp;
    this.actionEditYourName = actionEditYourName;
    this.actionRegenerateAxolotlKey = actionRegenerateAxolotlKey;
    this.avater = avater;
    this.axolotlActions = axolotlActions;
    this.axolotlFingerprint = axolotlFingerprint;
    this.axolotlFingerprintBox = axolotlFingerprintBox;
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.clearDevices = clearDevices;
    this.editor = editor;
    this.hostname = hostname;
    this.hostnameLayout = hostnameLayout;
    this.namePort = namePort;
    this.osOptimization = osOptimization;
    this.osOptimizationBody = osOptimizationBody;
    this.osOptimizationDisable = osOptimizationDisable;
    this.osOptimizationHeadline = osOptimizationHeadline;
    this.otherDeviceKeys = otherDeviceKeys;
    this.otherDeviceKeysCard = otherDeviceKeysCard;
    this.otherDeviceKeysTitle = otherDeviceKeysTitle;
    this.ownFingerprintDesc = ownFingerprintDesc;
    this.pgpFingerprint = pgpFingerprint;
    this.pgpFingerprintBox = pgpFingerprintBox;
    this.pgpFingerprintDesc = pgpFingerprintDesc;
    this.port = port;
    this.portLayout = portLayout;
    this.pushRow = pushRow;
    this.saveButton = saveButton;
    this.serverInfoBlocking = serverInfoBlocking;
    this.serverInfoCarbons = serverInfoCarbons;
    this.serverInfoCsi = serverInfoCsi;
    this.serverInfoHttpUpload = serverInfoHttpUpload;
    this.serverInfoHttpUploadDescription = serverInfoHttpUploadDescription;
    this.serverInfoMam = serverInfoMam;
    this.serverInfoMore = serverInfoMore;
    this.serverInfoPep = serverInfoPep;
    this.serverInfoPush = serverInfoPush;
    this.serverInfoRosterVersion = serverInfoRosterVersion;
    this.serverInfoSm = serverInfoSm;
    this.sessionEst = sessionEst;
    this.stats = stats;
    this.toolbar = toolbar;
    this.yourName = yourName;
    this.yourNameBox = yourNameBox;
    this.yourNameDesc = yourNameDesc;
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_account, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEditAccountBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_edit_account, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_account, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEditAccountBinding>inflateInternal(inflater, com.app.astron.R.layout.activity_edit_account, null, false, component);
  }

  public static ActivityEditAccountBinding bind(@NonNull View view) {
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
  public static ActivityEditAccountBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEditAccountBinding)bind(component, view, com.app.astron.R.layout.activity_edit_account);
  }
}
