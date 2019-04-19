package com.app.astron.utils;

import android.app.Activity;
import android.content.Intent;

import com.app.astron.Config;
import com.app.astron.entities.Account;
import com.app.astron.services.XmppConnectionService;
import com.app.astron.ui.ConversationsActivity;
import com.app.astron.ui.EditAccountActivity;
import com.app.astron.ui.ManageAccountActivity;
import com.app.astron.ui.StartConversationActivity;
import com.app.astron.ui.WelcomeActivity;

public class SignupUtils {

    public static Intent getSignUpIntent(final Activity activity) {
        Intent intent = new Intent(activity, WelcomeActivity.class);
        StartConversationActivity.addInviteUri(intent, activity.getIntent());
        return intent;
    }

    public static Intent getRedirectionIntent(final ConversationsActivity activity) {
        final XmppConnectionService service = activity.xmppConnectionService;
        Account pendingAccount = AccountUtils.getPendingAccount(service);
        Intent intent;
        if (pendingAccount != null) {
            intent = new Intent(activity, EditAccountActivity.class);
            intent.putExtra("jid", pendingAccount.getJid().asBareJid().toString());
        } else {
            if (service.getAccounts().size() == 0) {
                if (Config.X509_VERIFICATION) {
                    intent = new Intent(activity, ManageAccountActivity.class);
                } else if (Config.MAGIC_CREATE_DOMAIN != null) {
                    intent = getSignUpIntent(activity);
                } else {
                    intent = new Intent(activity, EditAccountActivity.class);
                }
            } else {
                intent = new Intent(activity, StartConversationActivity.class);
            }
        }
        intent.putExtra("init", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        return intent;
    }
}