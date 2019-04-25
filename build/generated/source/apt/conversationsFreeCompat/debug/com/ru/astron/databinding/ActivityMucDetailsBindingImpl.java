package com.ru.astron.databinding;
import com.ru.astron.R;
import com.ru.astron.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMucDetailsBindingImpl extends ActivityMucDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.muc_main_layout, 2);
        sViewsWithIds.put(R.id.your_photo, 3);
        sViewsWithIds.put(R.id.muc_display, 4);
        sViewsWithIds.put(R.id.muc_title, 5);
        sViewsWithIds.put(R.id.muc_subject, 6);
        sViewsWithIds.put(R.id.muc_editor, 7);
        sViewsWithIds.put(R.id.muc_edit_title, 8);
        sViewsWithIds.put(R.id.muc_edit_subject, 9);
        sViewsWithIds.put(R.id.edit_muc_name_button, 10);
        sViewsWithIds.put(R.id.muc_settings, 11);
        sViewsWithIds.put(R.id.muc_conference_type, 12);
        sViewsWithIds.put(R.id.change_conference_button, 13);
        sViewsWithIds.put(R.id.muc_info_more, 14);
        sViewsWithIds.put(R.id.muc_info_mam, 15);
        sViewsWithIds.put(R.id.jid, 16);
        sViewsWithIds.put(R.id.users_wrapper, 17);
        sViewsWithIds.put(R.id.no_users_hints, 18);
        sViewsWithIds.put(R.id.users, 19);
        sViewsWithIds.put(R.id.invite, 20);
        sViewsWithIds.put(R.id.show_users, 21);
        sViewsWithIds.put(R.id.muc_your_nick, 22);
        sViewsWithIds.put(R.id.muc_role, 23);
        sViewsWithIds.put(R.id.edit_nick_button, 24);
        sViewsWithIds.put(R.id.notification_status_text, 25);
        sViewsWithIds.put(R.id.notification_status_button, 26);
        sViewsWithIds.put(R.id.details_account, 27);
        sViewsWithIds.put(R.id.media_wrapper, 28);
        sViewsWithIds.put(R.id.media, 29);
        sViewsWithIds.put(R.id.show_media, 30);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMucDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityMucDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.TextView) bindings[27]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[24]
            , (android.widget.Button) bindings[20]
            , (android.widget.TextView) bindings[16]
            , (android.support.v7.widget.RecyclerView) bindings[29]
            , (android.support.v7.widget.CardView) bindings[28]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[4]
            , (com.ru.astron.ui.widget.EmojiWrapperEditText) bindings[9]
            , (com.ru.astron.ui.widget.EmojiWrapperEditText) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TableLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[23]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageButton) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.Button) bindings[30]
            , (android.widget.Button) bindings[21]
            , (android.view.View) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[19]
            , (android.support.v7.widget.CardView) bindings[17]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}