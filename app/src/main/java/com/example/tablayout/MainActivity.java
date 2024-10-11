package com.example.tablayout;

import android.os.Bundle;
import android.view.MenuItem;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.example.tablayout.fragment.ViewPageAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager2);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Sử dụng ViewPager2 với FragmentStateAdapter
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(this);
        viewPager.setAdapter(viewPageAdapter);

        // Lắng nghe sự thay đổi trang và cập nhật trạng thái của BottomNavigationView
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.student).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.setting).setChecked(true);
                        break;
                }
            }
        });

        // Lắng nghe sự chọn lựa trong BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    viewPager.setCurrentItem(0);
                    return true;
                } else if (item.getItemId() == R.id.student) {
                    viewPager.setCurrentItem(1);
                    return true;
                } else if (item.getItemId() == R.id.setting) {
                    viewPager.setCurrentItem(2);
                    return true;
                }
                return false;
            }
        });
    }
}

