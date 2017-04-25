package wedfrend.wang.materialdesign.behavior;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import wedfrend.wang.materialdesign.R;

public class defineBehavior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_behavior);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        //代码中设置Behavior
//        TextView textView = (TextView) findViewById(R.id.tv_behavior);
//        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) textView.getLayoutParams();
//        myBehavior myBehavior = new myBehavior();
//        params.setBehavior(myBehavior);


//        线性垂直布局
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
//        线性水平布局
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(manager);
//        网格布局
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        瀑布流布局
//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        List<String> listStr = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            listStr.add(String.format(Locale.CHINA,"第%02d条数据",i));
        }
        myAdapter myadapter = new myAdapter(listStr,defineBehavior.this);
        recyclerView.setAdapter(myadapter);
        
        /*
            1.来说说ToolBar
            在ToolBar中有很多的属性可以使用，但是受IOS系统的影响，在国内大多数的设计中
            在toolBar中都会有一个返回按钮，
            并且大多数的Title也在系统级的中间位置
            右边则是一个菜单栏按钮

            除了理解并掌握原生态的toolBar的同时，还是需要进行适应开发。
         */

//        Toolbar toolbar = (Toolbar) findViewById(R.id.behavior_toolbar);
////        toolbar.setTitle("wedfrend");
//        setSupportActionBar(toolbar);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDefaultDisplayHomeAsUpEnabled(true);
//        actionBar.setTitle("wedfrend");
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        collapsingToolbarLayout.setTitle("wangxiaobo");


    }
}
