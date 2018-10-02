package com.example.dell.actividad9_receptora;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceptor extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving

        //Mensaje que aparecerá al momento de darle clic al boton de EMITIR en la Actividad9_Emisora
        Toast.makeText(context,"Transmision Recibida", Toast.LENGTH_SHORT).show();
    }
}
