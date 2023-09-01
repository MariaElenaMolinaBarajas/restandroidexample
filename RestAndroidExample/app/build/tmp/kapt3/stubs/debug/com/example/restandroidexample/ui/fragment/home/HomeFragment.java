package com.example.restandroidexample.ui.fragment.home;

/**
 * Home fragment : Fragment()
 * @author memb
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/restandroidexample/ui/fragment/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/restandroidexample/databinding/FragmentHomeBinding;", "shareViewModel", "Lcom/example/mobileandroidtest/viewmodel/shared/SharedViewModel;", "getShareViewModel", "()Lcom/example/mobileandroidtest/viewmodel/shared/SharedViewModel;", "shareViewModel$delegate", "Lkotlin/Lazy;", "getServiceUserInformation", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "validateInternetConnection", "view", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.restandroidexample.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy shareViewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.mobileandroidtest.viewmodel.shared.SharedViewModel getShareViewModel() {
        return null;
    }
    
    /**
     * override onCreateView
     * creates and returns the view hierarchy associated with the fragment.
     */
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Validate internet connection
     * @param view View
     */
    private final void validateInternetConnection(android.view.View view) {
    }
    
    /**
     * Get services user information when application is connected to internet
     * @exception Exception
     */
    private final void getServiceUserInformation() {
    }
}