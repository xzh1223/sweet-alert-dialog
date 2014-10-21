package cn.pedant.SweetAlert;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import cn.pedant.SweetAlert.ui.SweetAlertDialog;

public class TestActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        findViewById(R.id.basic_test).setOnClickListener(this);
        findViewById(R.id.under_text_test).setOnClickListener(this);
        findViewById(R.id.error_text_test).setOnClickListener(this);
        findViewById(R.id.success_text_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SweetAlertDialog sweetAlertDialog = null;
        switch (v.getId()) {
            case R.id.basic_test:
                sweetAlertDialog = new SweetAlertDialog(this);
                break;
            case R.id.under_text_test:
                sweetAlertDialog = new SweetAlertDialog(this);
                sweetAlertDialog.setContentText("It's pretty, isn't it?");
                break;
            case R.id.error_text_test:
                sweetAlertDialog = new SweetAlertDialog(this, SweetAlertDialog.AlertType.ERROR_TYPE);
                sweetAlertDialog.setTitleText("Oops...");
                sweetAlertDialog.setContentText("Something went wrong!");
                break;
            case R.id.success_text_test:
                sweetAlertDialog = new SweetAlertDialog(this, SweetAlertDialog.AlertType.SUCCESS_TYPE);
                sweetAlertDialog.setTitleText("Good job!");
                sweetAlertDialog.setContentText("You clicked the button!");
                break;
        }
        if (sweetAlertDialog != null) {
            sweetAlertDialog.show();
        }
    }
}
