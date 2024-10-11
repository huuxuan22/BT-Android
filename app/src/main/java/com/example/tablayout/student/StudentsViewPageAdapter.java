package com.example.tablayout.student;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout.fragment.HomeFragment;
import com.example.tablayout.fragment.SettingFragment;
import com.example.tablayout.fragment.StudentFragment;

public class StudentsViewPageAdapter extends FragmentStateAdapter {

    public StudentsViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Tạo các fragment theo từng vị trí
        switch (position) {
            case 0:
                return new Tab1Fragment(); // Thay thế với fragment tương ứng
            case 1:
                return new Tab2Fragment(); // Thay thế với fragment tương ứng
            case 2:
                return new Tab3Fragment(); // Thay thế với fragment tương ứng
            default:
                return new Tab1Fragment(); // Fragment mặc định
        }
    }

    @Override
    public int getItemCount() {
        // Trả về số lượng fragment
        return 3; // Ví dụ: có 3 fragment
    }


}

