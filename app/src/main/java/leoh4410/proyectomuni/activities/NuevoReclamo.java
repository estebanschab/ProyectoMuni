package leoh4410.proyectomuni.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import leoh4410.proyectomuni.R;
import leoh4410.proyectomuni.ViewPagerAdapter;

public class NuevoReclamo extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private int[] tabIcons = {
            R.drawable.ic_action_time,
            R.drawable.ic_action_position,
            R.drawable.ic_action_my};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_reclamo);


    }
}
