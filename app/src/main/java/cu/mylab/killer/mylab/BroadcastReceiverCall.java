package cu.mylab.killer.mylab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by killer on 26/09/2017.
 */
public class BroadcastReceiverCall extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //Toast.makeText(context, "Ha conectado el cargador.", Toast.LENGTH_SHORT).show();
        Log.i("ReceptorCall", "SMS recibido");
    }
}
