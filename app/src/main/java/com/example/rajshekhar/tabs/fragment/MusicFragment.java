package com.example.rajshekhar.tabs.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rajshekhar.tabs.R;

public class MusicFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater,ViewGroup container,
                           Bundle savedInstanceState){
      return inflater.inflate(R.layout.fragment_home,container,false);
  }

}







