package com.app.astron.databinding;
import com.app.astron.R;
import com.app.astron.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConversationListRowBindingImpl extends ConversationListRowBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frame, 1);
        sViewsWithIds.put(R.id.conversation_image, 2);
        sViewsWithIds.put(R.id.conversation_name, 3);
        sViewsWithIds.put(R.id.conversation_lastwrapper, 4);
        sViewsWithIds.put(R.id.sender_name, 5);
        sViewsWithIds.put(R.id.txt_img_wrapper, 6);
        sViewsWithIds.put(R.id.conversation_lastmsg_img, 7);
        sViewsWithIds.put(R.id.conversation_lastmsg, 8);
        sViewsWithIds.put(R.id.notification_status, 9);
        sViewsWithIds.put(R.id.unread_count, 10);
        sViewsWithIds.put(R.id.conversation_lastupdate, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConversationListRowBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ConversationListRowBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (com.app.astron.ui.widget.UnreadCountCustomView) bindings[10]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
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