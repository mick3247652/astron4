package com.app.astron.databinding;
import com.app.astron.R;
import com.app.astron.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditAccountBindingImpl extends ActivityEditAccountBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.account_main_layout, 2);
        sViewsWithIds.put(R.id.editor, 3);
        sViewsWithIds.put(R.id.avater, 4);
        sViewsWithIds.put(R.id.account_jid_layout, 5);
        sViewsWithIds.put(R.id.account_jid, 6);
        sViewsWithIds.put(R.id.account_password_layout, 7);
        sViewsWithIds.put(R.id.account_password, 8);
        sViewsWithIds.put(R.id.name_port, 9);
        sViewsWithIds.put(R.id.hostname_layout, 10);
        sViewsWithIds.put(R.id.hostname, 11);
        sViewsWithIds.put(R.id.port_layout, 12);
        sViewsWithIds.put(R.id.port, 13);
        sViewsWithIds.put(R.id.account_register_new, 14);
        sViewsWithIds.put(R.id.os_optimization, 15);
        sViewsWithIds.put(R.id.os_optimization_headline, 16);
        sViewsWithIds.put(R.id.os_optimization_body, 17);
        sViewsWithIds.put(R.id.os_optimization_disable, 18);
        sViewsWithIds.put(R.id.stats, 19);
        sViewsWithIds.put(R.id.session_est, 20);
        sViewsWithIds.put(R.id.server_info_more, 21);
        sViewsWithIds.put(R.id.server_info_pep, 22);
        sViewsWithIds.put(R.id.server_info_blocking, 23);
        sViewsWithIds.put(R.id.server_info_sm, 24);
        sViewsWithIds.put(R.id.server_info_roster_version, 25);
        sViewsWithIds.put(R.id.server_info_carbons, 26);
        sViewsWithIds.put(R.id.server_info_mam, 27);
        sViewsWithIds.put(R.id.server_info_csi, 28);
        sViewsWithIds.put(R.id.push_row, 29);
        sViewsWithIds.put(R.id.server_info_push, 30);
        sViewsWithIds.put(R.id.server_info_http_upload_description, 31);
        sViewsWithIds.put(R.id.server_info_http_upload, 32);
        sViewsWithIds.put(R.id.your_name_box, 33);
        sViewsWithIds.put(R.id.your_name, 34);
        sViewsWithIds.put(R.id.your_name_desc, 35);
        sViewsWithIds.put(R.id.action_edit_your_name, 36);
        sViewsWithIds.put(R.id.pgp_fingerprint_box, 37);
        sViewsWithIds.put(R.id.pgp_fingerprint, 38);
        sViewsWithIds.put(R.id.pgp_fingerprint_desc, 39);
        sViewsWithIds.put(R.id.action_delete_pgp, 40);
        sViewsWithIds.put(R.id.axolotl_fingerprint_box, 41);
        sViewsWithIds.put(R.id.axolotl_fingerprint, 42);
        sViewsWithIds.put(R.id.own_fingerprint_desc, 43);
        sViewsWithIds.put(R.id.axolotl_actions, 44);
        sViewsWithIds.put(R.id.action_copy_axolotl_to_clipboard, 45);
        sViewsWithIds.put(R.id.action_regenerate_axolotl_key, 46);
        sViewsWithIds.put(R.id.other_device_keys_card, 47);
        sViewsWithIds.put(R.id.other_device_keys_title, 48);
        sViewsWithIds.put(R.id.other_device_keys, 49);
        sViewsWithIds.put(R.id.clear_devices, 50);
        sViewsWithIds.put(R.id.button_bar, 51);
        sViewsWithIds.put(R.id.cancel_button, 52);
        sViewsWithIds.put(R.id.save_button, 53);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditAccountBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 54, sIncludes, sViewsWithIds));
    }
    private ActivityEditAccountBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.app.astron.ui.widget.TextInputEditText) bindings[6]
            , (android.support.design.widget.TextInputLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (com.app.astron.ui.widget.TextInputEditText) bindings[8]
            , (android.support.design.widget.TextInputLayout) bindings[7]
            , (android.widget.CheckBox) bindings[14]
            , (android.widget.ImageButton) bindings[45]
            , (android.widget.ImageButton) bindings[40]
            , (android.widget.ImageButton) bindings[36]
            , (android.widget.ImageButton) bindings[46]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.TextView) bindings[42]
            , (android.widget.RelativeLayout) bindings[41]
            , (android.widget.LinearLayout) bindings[51]
            , (android.widget.Button) bindings[52]
            , (android.widget.Button) bindings[50]
            , (android.support.v7.widget.CardView) bindings[3]
            , (android.widget.EditText) bindings[11]
            , (android.support.design.widget.TextInputLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (android.support.v7.widget.CardView) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[49]
            , (android.support.v7.widget.CardView) bindings[47]
            , (android.widget.TextView) bindings[48]
            , (android.widget.TextView) bindings[43]
            , (android.widget.TextView) bindings[38]
            , (android.widget.RelativeLayout) bindings[37]
            , (android.widget.TextView) bindings[39]
            , (android.widget.EditText) bindings[13]
            , (android.support.design.widget.TextInputLayout) bindings[12]
            , (android.widget.TableRow) bindings[29]
            , (android.widget.Button) bindings[53]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TableLayout) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[20]
            , (android.support.v7.widget.CardView) bindings[19]
            , (android.view.View) bindings[1]
            , (android.widget.TextView) bindings[34]
            , (android.widget.RelativeLayout) bindings[33]
            , (android.widget.TextView) bindings[35]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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