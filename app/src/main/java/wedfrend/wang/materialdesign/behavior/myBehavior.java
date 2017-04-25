package wedfrend.wang.materialdesign.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by welive on 2017/4/24.
 *
 * 自定义的Behavior
 *
 * 两种设定模式
 *
 * 1：在代码中设置
 *
 * 2:在布局中，实现两个参数的构造方法
 */

public class myBehavior extends CoordinatorLayout.Behavior {
    private static final String TAG = "myBehavior";

    public myBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     *
     * @param coordinatorLayout
     * @param child
     * @param directTargetChild
     * @param target
     * @param nestedScrollAxes
     * @return  返回值是否关心
     */
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
//        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
        return true;
    }

    /**
     * 滚动
     * @param coordinatorLayout
     * @param child
     * @param target
     * @param dxConsumed
     * @param dyConsumed//向上滑动的距离
     * @param dxUnconsumed
     * @param dyUnconsumed
     */
    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);

        Log.i(TAG, "onNestedScroll: dxConsumed--------------》"+dxConsumed);
        Log.i(TAG, "onNestedScroll: dyConsumed--------------》"+dyConsumed);
        Log.i(TAG, "onNestedScroll: dxUnconsumed--------------》"+dxUnconsumed);
        Log.i(TAG, "onNestedScroll: dyUnconsumed--------------》"+dyUnconsumed);
        //垂直滚动只需要判断y的值
        if(dyConsumed>0){//向上滚动，干什么事情呢？

            ViewCompat.animate(child).scaleX(0).scaleY(0).start();
        }else{
            //向下滚动
            ViewCompat.animate(child).scaleX(1).scaleY(1).start();

        }
    }
}
