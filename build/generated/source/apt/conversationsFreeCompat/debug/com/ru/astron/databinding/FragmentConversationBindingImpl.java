package com.ru.astron.databinding;
import com.ru.astron.R;
import com.ru.astron.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConversationBindingImpl extends FragmentConversationBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.messages_view, 1);
        sViewsWithIds.put(R.id.scroll_to_bottom_button, 2);
        sViewsWithIds.put(R.id.unread_count_custom_view, 3);
        sViewsWithIds.put(R.id.textsend, 4);
        sViewsWithIds.put(R.id.media_preview, 5);
        sViewsWithIds.put(R.id.textinput, 6);
        sViewsWithIds.put(R.id.textSendButton, 7);
        sViewsWithIds.put(R.id.snackbar, 8);
        sViewsWithIds.put(R.id.snackbar_message, 9);
        sViewsWithIds.put(R.id.snackbar_action, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConversationBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentConversationBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.RecyclerView) bindings[5]
            , (android.widget.ListView) bindings[1]
            , (android.support.design.widget.FloatingActionButton) bindings[2]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageButton) bindings[7]
            , (com.ru.astron.ui.widget.EditMessage) bindings[6]
            , (android.widget.RelativeLayout) bindings[4]
            , (com.ru.astron.ui.widget.UnreadCountCustomView) bindings[3]
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