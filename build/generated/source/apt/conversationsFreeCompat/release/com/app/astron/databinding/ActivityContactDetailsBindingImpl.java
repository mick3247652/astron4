package com.app.astron.databinding;
import com.app.astron.R;
import com.app.astron.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityContactDetailsBindingImpl extends ActivityContactDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.details_main_layout, 2);
        sViewsWithIds.put(R.id.details_contact_badge, 3);
        sViewsWithIds.put(R.id.details_jidbox, 4);
        sViewsWithIds.put(R.id.details_contactjid, 5);
        sViewsWithIds.put(R.id.tags, 6);
        sViewsWithIds.put(R.id.details_lastseen, 7);
        sViewsWithIds.put(R.id.status_message, 8);
        sViewsWithIds.put(R.id.add_contact_button, 9);
        sViewsWithIds.put(R.id.details_send_presence, 10);
        sViewsWithIds.put(R.id.details_receive_presence, 11);
        sViewsWithIds.put(R.id.details_account, 12);
        sViewsWithIds.put(R.id.media_wrapper, 13);
        sViewsWithIds.put(R.id.media, 14);
        sViewsWithIds.put(R.id.show_media, 15);
        sViewsWithIds.put(R.id.keys_wrapper, 16);
        sViewsWithIds.put(R.id.details_contact_keys, 17);
        sViewsWithIds.put(R.id.scan_button, 18);
        sViewsWithIds.put(R.id.show_inactive_devices, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityContactDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityContactDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.QuickContactBadge) bindings[3]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.CheckBox) bindings[10]
            , (android.support.v7.widget.CardView) bindings[16]
            , (android.support.v7.widget.RecyclerView) bindings[14]
            , (android.support.v7.widget.CardView) bindings[13]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (com.wefika.flowlayout.FlowLayout) bindings[6]
            , (android.view.View) bindings[1]
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