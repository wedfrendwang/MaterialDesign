package wedfrend.wang.materialdesign.textinput;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import wedfrend.wang.materialdesign.R;

public class textInputActivity extends AppCompatActivity implements TextWatcher{

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        if (s.toString().length()<6){
            textInputLayout.setError("账号至少为6位");
            textInputLayout.setErrorEnabled(true);
        }else{
            textInputLayout.setErrorEnabled(false);
        }

    }
    TextInputLayout textInputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        textInputLayout = (TextInputLayout) findViewById(R.id.textInputLayout);
        textInputLayout.getEditText().addTextChangedListener(this);

    }
}
