package com.example.tablayoutandviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayoutandviewpager.fragments.CalculatorFragment;
import com.example.tablayoutandviewpager.fragments.HomeFragment;
import com.example.tablayoutandviewpager.fragments.MyAccountFragment;

public class MyViewAdapter extends FragmentStateAdapter {
    public MyViewAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return  new HomeFragment();
            case 1:
                return new CalculatorFragment();
            case 2:
                return new MyAccountFragment();
            default:
                return new HomeFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
