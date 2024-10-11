package com.example.tablayout.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdapter extends FragmentStateAdapter {

    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Tạo các fragment theo từng vị trí
        switch (position) {
            case 0:
                return new HomeFragment(); // Thay thế với fragment tương ứng
            case 1:
                return new StudentFragment(); // Thay thế với fragment tương ứng
            case 2:
                return new SettingFragment(); // Thay thế với fragment tương ứng
            default:
                return new HomeFragment(); // Fragment mặc định
        }
    }

    @Override
    public int getItemCount() {
        // Trả về số lượng fragment
        return 3; // Ví dụ: có 3 fragment
    }
}

