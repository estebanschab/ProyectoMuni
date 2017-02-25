package leoh4410.proyectomuni.activities.menu;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import leoh4410.proyectomuni.R;


public class PrincipalActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerMenuAdapter viewPagerAdapter;
    private int[] tabIcons = {
            R.drawable.ic_action_time,
            R.drawable.ic_action_position,
            R.drawable.ic_action_my};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    //TODO
    private void setupViewPager(ViewPager viewPager)
    {
        viewPagerAdapter = new ViewPagerMenuAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new LastFragment(), "Ultimos");
        viewPagerAdapter.addFragments(new NearFragment(), "Cercanos");
        viewPagerAdapter.addFragments(new MyFragment(), "Propios");
        viewPager.setAdapter(viewPagerAdapter);
    }

    //TODO
    private void setupTabIcons()
    {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO
        switch (item.getItemId()) {
            case R.id.action_add:
                Toast.makeText(getApplicationContext(), getText(R.string.AgregarReclamo), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_refresh:
                Toast.makeText(getApplicationContext(), getText(R.string.Refrescar), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_config:
                Toast.makeText(getApplicationContext(), getText(R.string.Configurar), Toast.LENGTH_SHORT).show();
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

}