package com.example.restandroidexample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.restandroidexample.databinding.ActivityMainBindingImpl;
import com.example.restandroidexample.databinding.FragmentHomeBindingImpl;
import com.example.restandroidexample.databinding.FragmentNoInternetConnectionBindingImpl;
import com.example.restandroidexample.databinding.FragmentUserDetailsBindingImpl;
import com.example.restandroidexample.databinding.FragmentUserInformationBindingImpl;
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
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTNOINTERNETCONNECTION = 3;

  private static final int LAYOUT_FRAGMENTUSERDETAILS = 4;

  private static final int LAYOUT_FRAGMENTUSERINFORMATION = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.restandroidexample.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.restandroidexample.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.restandroidexample.R.layout.fragment_no_internet_connection, LAYOUT_FRAGMENTNOINTERNETCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.restandroidexample.R.layout.fragment_user_details, LAYOUT_FRAGMENTUSERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.restandroidexample.R.layout.fragment_user_information, LAYOUT_FRAGMENTUSERINFORMATION);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOINTERNETCONNECTION: {
          if ("layout/fragment_no_internet_connection_0".equals(tag)) {
            return new FragmentNoInternetConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_no_internet_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERDETAILS: {
          if ("layout/fragment_user_details_0".equals(tag)) {
            return new FragmentUserDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERINFORMATION: {
          if ("layout/fragment_user_information_0".equals(tag)) {
            return new FragmentUserInformationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_information is invalid. Received: " + tag);
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
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.restandroidexample.R.layout.activity_main);
      sKeys.put("layout/fragment_home_0", com.example.restandroidexample.R.layout.fragment_home);
      sKeys.put("layout/fragment_no_internet_connection_0", com.example.restandroidexample.R.layout.fragment_no_internet_connection);
      sKeys.put("layout/fragment_user_details_0", com.example.restandroidexample.R.layout.fragment_user_details);
      sKeys.put("layout/fragment_user_information_0", com.example.restandroidexample.R.layout.fragment_user_information);
    }
  }
}
