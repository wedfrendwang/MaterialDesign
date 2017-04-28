package wedfrend.wang.materialdesign.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import wedfrend.wang.materialdesign.R;

public class testActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        Toolbar toolbar = ((Toolbar) findViewById(R.id.test_toolbar));
//        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case android.R.id.home:
                Toast.makeText(testActivity.this,"ok",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.icon:
                Toast.makeText(testActivity.this,"icon",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.title:
                Toast.makeText(testActivity.this,"icon",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
