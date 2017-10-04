package app.rhuangal.com.fcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @author roberto huangal diaz
 * @web https://github.com/rhuangal/
 * @version 1.0
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnEjemplo1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEjemplo1:
                goToActivity(Ejemplo1Activity.class);
                break;
        }
    }

    private void goToActivity(Class activity){
        Intent intent= new Intent(this,activity);
        startActivity(intent);
    }

}
