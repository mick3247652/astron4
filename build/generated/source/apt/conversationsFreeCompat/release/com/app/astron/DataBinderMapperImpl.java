package com.app.astron;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.app.astron.databinding.AccountRowBindingImpl;
import com.app.astron.databinding.ActivityChooseContactBindingImpl;
import com.app.astron.databinding.ActivityContactDetailsBindingImpl;
import com.app.astron.databinding.ActivityConversationsBindingImpl;
import com.app.astron.databinding.ActivityConversationsBindingW945dpImpl;
import com.app.astron.databinding.ActivityEditAccountBindingImpl;
import com.app.astron.databinding.ActivityImportBackupBindingImpl;
import com.app.astron.databinding.ActivityMediaBrowserBindingImpl;
import com.app.astron.databinding.ActivityMucDetailsBindingImpl;
import com.app.astron.databinding.ActivityMucUsersBindingImpl;
import com.app.astron.databinding.ActivityPublishProfilePictureBindingImpl;
import com.app.astron.databinding.ActivityRecordingBindingImpl;
import com.app.astron.databinding.ActivitySearchBindingImpl;
import com.app.astron.databinding.ActivityShareLocationBindingImpl;
import com.app.astron.databinding.ActivityShowLocationBindingImpl;
import com.app.astron.databinding.ActivityStartConversationBindingImpl;
import com.app.astron.databinding.ActivityTrustKeysBindingImpl;
import com.app.astron.databinding.ContactBindingImpl;
import com.app.astron.databinding.ContactKeyBindingImpl;
import com.app.astron.databinding.ConversationListRowBindingImpl;
import com.app.astron.databinding.CreateConferenceDialogBindingImpl;
import com.app.astron.databinding.CreatePublicChannelDialogBindingImpl;
import com.app.astron.databinding.DialogBlockContactBindingImpl;
import com.app.astron.databinding.DialogEnterPasswordBindingImpl;
import com.app.astron.databinding.DialogJoinConferenceBindingImpl;
import com.app.astron.databinding.DialogPresenceBindingImpl;
import com.app.astron.databinding.DialogQuickeditBindingImpl;
import com.app.astron.databinding.EnterJidDialogBindingImpl;
import com.app.astron.databinding.FragmentConversationBindingImpl;
import com.app.astron.databinding.FragmentConversationsOverviewBindingImpl;
import com.app.astron.databinding.KeysCardBindingImpl;
import com.app.astron.databinding.MediaBindingImpl;
import com.app.astron.databinding.MediaPreviewBindingImpl;
import com.app.astron.databinding.UserPreviewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACCOUNTROW = 1;

  private static final int LAYOUT_ACTIVITYCHOOSECONTACT = 2;

  private static final int LAYOUT_ACTIVITYCONTACTDETAILS = 3;

  private static final int LAYOUT_ACTIVITYCONVERSATIONS = 4;

  private static final int LAYOUT_ACTIVITYEDITACCOUNT = 5;

  private static final int LAYOUT_ACTIVITYIMPORTBACKUP = 6;

  private static final int LAYOUT_ACTIVITYMEDIABROWSER = 7;

  private static final int LAYOUT_ACTIVITYMUCDETAILS = 8;

  private static final int LAYOUT_ACTIVITYMUCUSERS = 9;

  private static final int LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE = 10;

  private static final int LAYOUT_ACTIVITYRECORDING = 11;

  private static final int LAYOUT_ACTIVITYSEARCH = 12;

  private static final int LAYOUT_ACTIVITYSHARELOCATION = 13;

  private static final int LAYOUT_ACTIVITYSHOWLOCATION = 14;

  private static final int LAYOUT_ACTIVITYSTARTCONVERSATION = 15;

  private static final int LAYOUT_ACTIVITYTRUSTKEYS = 16;

  private static final int LAYOUT_CONTACT = 17;

  private static final int LAYOUT_CONTACTKEY = 18;

  private static final int LAYOUT_CONVERSATIONLISTROW = 19;

  private static final int LAYOUT_CREATECONFERENCEDIALOG = 20;

  private static final int LAYOUT_CREATEPUBLICCHANNELDIALOG = 21;

  private static final int LAYOUT_DIALOGBLOCKCONTACT = 22;

  private static final int LAYOUT_DIALOGENTERPASSWORD = 23;

  private static final int LAYOUT_DIALOGJOINCONFERENCE = 24;

  private static final int LAYOUT_DIALOGPRESENCE = 25;

  private static final int LAYOUT_DIALOGQUICKEDIT = 26;

  private static final int LAYOUT_ENTERJIDDIALOG = 27;

  private static final int LAYOUT_FRAGMENTCONVERSATION = 28;

  private static final int LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW = 29;

  private static final int LAYOUT_KEYSCARD = 30;

  private static final int LAYOUT_MEDIA = 31;

  private static final int LAYOUT_MEDIAPREVIEW = 32;

  private static final int LAYOUT_USERPREVIEW = 33;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(33);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.account_row, LAYOUT_ACCOUNTROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_choose_contact, LAYOUT_ACTIVITYCHOOSECONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_contact_details, LAYOUT_ACTIVITYCONTACTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_conversations, LAYOUT_ACTIVITYCONVERSATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_edit_account, LAYOUT_ACTIVITYEDITACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_import_backup, LAYOUT_ACTIVITYIMPORTBACKUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_media_browser, LAYOUT_ACTIVITYMEDIABROWSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_muc_details, LAYOUT_ACTIVITYMUCDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_muc_users, LAYOUT_ACTIVITYMUCUSERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_publish_profile_picture, LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_recording, LAYOUT_ACTIVITYRECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_share_location, LAYOUT_ACTIVITYSHARELOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_show_location, LAYOUT_ACTIVITYSHOWLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_start_conversation, LAYOUT_ACTIVITYSTARTCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.activity_trust_keys, LAYOUT_ACTIVITYTRUSTKEYS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.contact, LAYOUT_CONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.contact_key, LAYOUT_CONTACTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.conversation_list_row, LAYOUT_CONVERSATIONLISTROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.create_conference_dialog, LAYOUT_CREATECONFERENCEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.create_public_channel_dialog, LAYOUT_CREATEPUBLICCHANNELDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.dialog_block_contact, LAYOUT_DIALOGBLOCKCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.dialog_enter_password, LAYOUT_DIALOGENTERPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.dialog_join_conference, LAYOUT_DIALOGJOINCONFERENCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.dialog_presence, LAYOUT_DIALOGPRESENCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.dialog_quickedit, LAYOUT_DIALOGQUICKEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.enter_jid_dialog, LAYOUT_ENTERJIDDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.fragment_conversation, LAYOUT_FRAGMENTCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.fragment_conversations_overview, LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.keys_card, LAYOUT_KEYSCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.media, LAYOUT_MEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.media_preview, LAYOUT_MEDIAPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.astron.R.layout.user_preview, LAYOUT_USERPREVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACCOUNTROW: {
          if ("layout/account_row_0".equals(tag)) {
            return new AccountRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for account_row is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHOOSECONTACT: {
          if ("layout/activity_choose_contact_0".equals(tag)) {
            return new ActivityChooseContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_choose_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCONTACTDETAILS: {
          if ("layout/activity_contact_details_0".equals(tag)) {
            return new ActivityContactDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_contact_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCONVERSATIONS: {
          if ("layout-w945dp/activity_conversations_0".equals(tag)) {
            return new ActivityConversationsBindingW945dpImpl(component, view);
          }
          if ("layout/activity_conversations_0".equals(tag)) {
            return new ActivityConversationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_conversations is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITACCOUNT: {
          if ("layout/activity_edit_account_0".equals(tag)) {
            return new ActivityEditAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_account is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYIMPORTBACKUP: {
          if ("layout/activity_import_backup_0".equals(tag)) {
            return new ActivityImportBackupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_import_backup is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMEDIABROWSER: {
          if ("layout/activity_media_browser_0".equals(tag)) {
            return new ActivityMediaBrowserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_media_browser is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMUCDETAILS: {
          if ("layout/activity_muc_details_0".equals(tag)) {
            return new ActivityMucDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_muc_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMUCUSERS: {
          if ("layout/activity_muc_users_0".equals(tag)) {
            return new ActivityMucUsersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_muc_users is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE: {
          if ("layout/activity_publish_profile_picture_0".equals(tag)) {
            return new ActivityPublishProfilePictureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_publish_profile_picture is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECORDING: {
          if ("layout/activity_recording_0".equals(tag)) {
            return new ActivityRecordingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recording is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHARELOCATION: {
          if ("layout/activity_share_location_0".equals(tag)) {
            return new ActivityShareLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_share_location is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHOWLOCATION: {
          if ("layout/activity_show_location_0".equals(tag)) {
            return new ActivityShowLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_show_location is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTARTCONVERSATION: {
          if ("layout/activity_start_conversation_0".equals(tag)) {
            return new ActivityStartConversationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_start_conversation is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRUSTKEYS: {
          if ("layout/activity_trust_keys_0".equals(tag)) {
            return new ActivityTrustKeysBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_trust_keys is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTACT: {
          if ("layout/contact_0".equals(tag)) {
            return new ContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for contact is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTACTKEY: {
          if ("layout/contact_key_0".equals(tag)) {
            return new ContactKeyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for contact_key is invalid. Received: " + tag);
        }
        case  LAYOUT_CONVERSATIONLISTROW: {
          if ("layout/conversation_list_row_0".equals(tag)) {
            return new ConversationListRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for conversation_list_row is invalid. Received: " + tag);
        }
        case  LAYOUT_CREATECONFERENCEDIALOG: {
          if ("layout/create_conference_dialog_0".equals(tag)) {
            return new CreateConferenceDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for create_conference_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_CREATEPUBLICCHANNELDIALOG: {
          if ("layout/create_public_channel_dialog_0".equals(tag)) {
            return new CreatePublicChannelDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for create_public_channel_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGBLOCKCONTACT: {
          if ("layout/dialog_block_contact_0".equals(tag)) {
            return new DialogBlockContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_block_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGENTERPASSWORD: {
          if ("layout/dialog_enter_password_0".equals(tag)) {
            return new DialogEnterPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_enter_password is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGJOINCONFERENCE: {
          if ("layout/dialog_join_conference_0".equals(tag)) {
            return new DialogJoinConferenceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_join_conference is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGPRESENCE: {
          if ("layout/dialog_presence_0".equals(tag)) {
            return new DialogPresenceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_presence is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGQUICKEDIT: {
          if ("layout/dialog_quickedit_0".equals(tag)) {
            return new DialogQuickeditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_quickedit is invalid. Received: " + tag);
        }
        case  LAYOUT_ENTERJIDDIALOG: {
          if ("layout/enter_jid_dialog_0".equals(tag)) {
            return new EnterJidDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for enter_jid_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONVERSATION: {
          if ("layout/fragment_conversation_0".equals(tag)) {
            return new FragmentConversationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_conversation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW: {
          if ("layout/fragment_conversations_overview_0".equals(tag)) {
            return new FragmentConversationsOverviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_conversations_overview is invalid. Received: " + tag);
        }
        case  LAYOUT_KEYSCARD: {
          if ("layout/keys_card_0".equals(tag)) {
            return new KeysCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for keys_card is invalid. Received: " + tag);
        }
        case  LAYOUT_MEDIA: {
          if ("layout/media_0".equals(tag)) {
            return new MediaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for media is invalid. Received: " + tag);
        }
        case  LAYOUT_MEDIAPREVIEW: {
          if ("layout/media_preview_0".equals(tag)) {
            return new MediaPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for media_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_USERPREVIEW: {
          if ("layout/user_preview_0".equals(tag)) {
            return new UserPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_preview is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(34);

    static {
      sKeys.put("layout/account_row_0", com.app.astron.R.layout.account_row);
      sKeys.put("layout/activity_choose_contact_0", com.app.astron.R.layout.activity_choose_contact);
      sKeys.put("layout/activity_contact_details_0", com.app.astron.R.layout.activity_contact_details);
      sKeys.put("layout-w945dp/activity_conversations_0", com.app.astron.R.layout.activity_conversations);
      sKeys.put("layout/activity_conversations_0", com.app.astron.R.layout.activity_conversations);
      sKeys.put("layout/activity_edit_account_0", com.app.astron.R.layout.activity_edit_account);
      sKeys.put("layout/activity_import_backup_0", com.app.astron.R.layout.activity_import_backup);
      sKeys.put("layout/activity_media_browser_0", com.app.astron.R.layout.activity_media_browser);
      sKeys.put("layout/activity_muc_details_0", com.app.astron.R.layout.activity_muc_details);
      sKeys.put("layout/activity_muc_users_0", com.app.astron.R.layout.activity_muc_users);
      sKeys.put("layout/activity_publish_profile_picture_0", com.app.astron.R.layout.activity_publish_profile_picture);
      sKeys.put("layout/activity_recording_0", com.app.astron.R.layout.activity_recording);
      sKeys.put("layout/activity_search_0", com.app.astron.R.layout.activity_search);
      sKeys.put("layout/activity_share_location_0", com.app.astron.R.layout.activity_share_location);
      sKeys.put("layout/activity_show_location_0", com.app.astron.R.layout.activity_show_location);
      sKeys.put("layout/activity_start_conversation_0", com.app.astron.R.layout.activity_start_conversation);
      sKeys.put("layout/activity_trust_keys_0", com.app.astron.R.layout.activity_trust_keys);
      sKeys.put("layout/contact_0", com.app.astron.R.layout.contact);
      sKeys.put("layout/contact_key_0", com.app.astron.R.layout.contact_key);
      sKeys.put("layout/conversation_list_row_0", com.app.astron.R.layout.conversation_list_row);
      sKeys.put("layout/create_conference_dialog_0", com.app.astron.R.layout.create_conference_dialog);
      sKeys.put("layout/create_public_channel_dialog_0", com.app.astron.R.layout.create_public_channel_dialog);
      sKeys.put("layout/dialog_block_contact_0", com.app.astron.R.layout.dialog_block_contact);
      sKeys.put("layout/dialog_enter_password_0", com.app.astron.R.layout.dialog_enter_password);
      sKeys.put("layout/dialog_join_conference_0", com.app.astron.R.layout.dialog_join_conference);
      sKeys.put("layout/dialog_presence_0", com.app.astron.R.layout.dialog_presence);
      sKeys.put("layout/dialog_quickedit_0", com.app.astron.R.layout.dialog_quickedit);
      sKeys.put("layout/enter_jid_dialog_0", com.app.astron.R.layout.enter_jid_dialog);
      sKeys.put("layout/fragment_conversation_0", com.app.astron.R.layout.fragment_conversation);
      sKeys.put("layout/fragment_conversations_overview_0", com.app.astron.R.layout.fragment_conversations_overview);
      sKeys.put("layout/keys_card_0", com.app.astron.R.layout.keys_card);
      sKeys.put("layout/media_0", com.app.astron.R.layout.media);
      sKeys.put("layout/media_preview_0", com.app.astron.R.layout.media_preview);
      sKeys.put("layout/user_preview_0", com.app.astron.R.layout.user_preview);
    }
  }
}
