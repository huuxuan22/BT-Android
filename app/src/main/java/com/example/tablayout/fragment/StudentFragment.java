package com.example.tablayout.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayout.R;
import com.example.tablayout.student.StudentsViewPageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentFragment#} factory method to
 * create an instance of this fragment.
 */
public class StudentFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private View view;

    public StudentFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student, container, false);
        // Inflate the layout for this fragment
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager2 = view.findViewById(R.id.student_viewpager2);
        StudentsViewPageAdapter studentViewPageAdapter = new StudentsViewPageAdapter(requireActivity());
        viewPager2.setAdapter(studentViewPageAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Tab 1");
                        break;
                    case 1:
                        tab.setText("Tab 2");
                        break;
                    case 2:
                        tab.setText("Tab 3");
                        break;
                }
            }
        }).attach();
        return view;

    }
}