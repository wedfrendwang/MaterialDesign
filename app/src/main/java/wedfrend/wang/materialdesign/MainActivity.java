package wedfrend.wang.materialdesign;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.EventLogTags;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import wedfrend.wang.materialdesign.behavior.defineBehavior;
import wedfrend.wang.materialdesign.coordinatorlayout.coordinatorActivity;
import wedfrend.wang.materialdesign.textinput.textInputActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab = (TabLayout) findViewById(R.id.tab);
        //ViewPager中的相应方法还没有哦使用
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        //DrawerLayout
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        //直到现在，相应的Navigation 还是没有使用到。但是DrawerLayout+toolbar联动效果有了吧
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setItemIconTintList(null);
        //设置NavigationView的Header控件
        View v = navigationView.getHeaderView(0);
//        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
//        imageView.setImageResource(R.mipmap.img);
        navigationView.getMenu().findItem(R.id.item_1).setVisible(false);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.item_1:
                    break;
                    case R.id.item_2:
                        break;
                    case R.id.item_3:
                        break;
                    case R.id.item_4:
                        break;
                    case R.id.item_5:
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,coordinatorActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.item_6:
                        Intent inte = new Intent();
                        inte.setClass(MainActivity.this,defineBehavior.class);
                        startActivity(inte);
                        break;
                    case R.id.item_7:
                        Intent inten = new Intent();
                        inten.setClass(MainActivity.this,textInputActivity.class);
                        startActivity(inten);
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar的使用
                Log.i(TAG, "onClick: 开始");
                Snackbar.make(v,"wedfrend@163.com",Snackbar.LENGTH_LONG).setAction("点击", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,coordinatorActivity.class);
                        startActivity(intent);

                    }
                }).show();
            }
        });

        List<String> listString = new ArrayList<>();
        for (int i = 0; i <32 ; i++) {
            listString.add(String.format(Locale.CANADA,"第%02d页",i));
        }
        viewPager.setAdapter(new myAdapter(getSupportFragmentManager(),listString));
        //设置Tablayout的标题头部，但是要注意的是我们必须Adapter中设置一个方法，getPageTitle
        tab.setupWithViewPager(viewPager);
    }
}
