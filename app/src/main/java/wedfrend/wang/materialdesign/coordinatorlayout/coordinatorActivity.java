package wedfrend.wang.materialdesign.coordinatorlayout;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import wedfrend.wang.materialdesign.R;
import wedfrend.wang.materialdesign.behavior.defineBehavior;

public class coordinatorActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        Button btn = (Button) findViewById(R.id.btn);
         tv = (TextView) findViewById(R.id.tv_coordinator);

        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) tv.getLayoutParams();
        SwipeDismissBehavior<TextView> textViewSwipeDismissBehavior = new SwipeDismissBehavior<>();
        textViewSwipeDismissBehavior.setListener(new SwipeDismissBehavior.OnDismissListener() {
            @Override
            public void onDismiss(View view) {

                tv.setVisibility(View.VISIBLE);
                ViewCompat.animate(tv).alpha(1).start();
                startActivity(new Intent(coordinatorActivity.this,defineBehavior.class));

            }

            @Override
            public void onDragStateChanged(int state) {

            }
        });
        params.setBehavior(textViewSwipeDismissBehavior);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Snackbar",Snackbar.LENGTH_SHORT).setAction("pervious", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        退出整个应用
//                        ActivityCompat.finishAffinity(coordinatorActivity.this);
                        finish();
                    }
                }).show();
            }
        });

    }
}
