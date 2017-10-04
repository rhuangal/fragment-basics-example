package app.rhuangal.com.fcom;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import app.rhuangal.com.fcom.ui.listener.Ejemplo1Listener;
import app.rhuangal.com.fcom.ui.fragments.WriteFragment;
import app.rhuangal.com.fcom.ui.fragments.ShowFragment;

/**
 * @author roberto huangal diaz
 * @web https://github.com/rhuangal/
 * @version 1.0
 */

public class Ejemplo1Activity extends AppCompatActivity implements Ejemplo1Listener{

    private WriteFragment fragmentA;
    private ShowFragment fragmentB;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1);
        fragmentManager= getSupportFragmentManager();
        fragmentA = (WriteFragment) fragmentManager.findFragmentById(R.id.fragmentWrite);
        fragmentB = (ShowFragment) fragmentManager.findFragmentById(R.id.fragmentShow);
    }

    @Override
    public void sendMessage(String message) {
        Log.i("Ejemplo1Activity", "recibimos y enviamos: " + message);
        fragmentB.mostrarMensaje(message);
    }

}
