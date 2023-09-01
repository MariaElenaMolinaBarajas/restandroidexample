// Generated by data binding compiler. Do not edit!
package com.example.restandroidexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.restandroidexample.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNoInternetConnectionBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRetry;

  @NonNull
  public final ConstraintLayout frameLayout;

  protected FragmentNoInternetConnectionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnRetry, ConstraintLayout frameLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRetry = btnRetry;
    this.frameLayout = frameLayout;
  }

  @NonNull
  public static FragmentNoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_no_internet_connection, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNoInternetConnectionBinding>inflateInternal(inflater, R.layout.fragment_no_internet_connection, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_no_internet_connection, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNoInternetConnectionBinding>inflateInternal(inflater, R.layout.fragment_no_internet_connection, null, false, component);
  }

  public static FragmentNoInternetConnectionBinding bind(@NonNull View view) {
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
  public static FragmentNoInternetConnectionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentNoInternetConnectionBinding)bind(component, view, R.layout.fragment_no_internet_connection);
  }
}
