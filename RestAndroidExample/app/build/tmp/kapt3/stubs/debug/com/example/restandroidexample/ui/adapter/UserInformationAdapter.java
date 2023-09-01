package com.example.restandroidexample.ui.adapter;

/**
 * User information adapter
 * @param users List<Result>
 * @param clickListener Int
 * @return recyclerview
 * @author memb
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/restandroidexample/ui/adapter/UserInformationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/restandroidexample/ui/holder/UserInformationHolder;", "users", "", "Lcom/example/mobileandroidtest/model/Result;", "clickListener", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class UserInformationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.restandroidexample.ui.holder.UserInformationHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.mobileandroidtest.model.Result> users = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> clickListener = null;
    
    public UserInformationAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.mobileandroidtest.model.Result> users, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
        super();
    }
    
    /**
     * Override onCreateViewHolder
     * @param parent ViewGroup
     * @param viewType Int
     * @return UserInformationHolder
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.restandroidexample.ui.holder.UserInformationHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * Override onBindViewHolder
     * @param holder UserInformationHolder
     * @param position Int
     */
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.restandroidexample.ui.holder.UserInformationHolder holder, int position) {
    }
    
    /**
     * Override getItemCount
     * @return users.size
     */
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
}