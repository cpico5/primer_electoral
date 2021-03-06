package mx.gob.cdmx.primerelectoral;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class NotificacionIDTokenService extends FirebaseInstanceIdService {
    private final String TAG="FIREBASE_TOKEN";

    @Override
    public void onTokenRefresh() {
       // super.onTokenRefresh();
        String token= FirebaseInstanceId.getInstance().getToken();
        enviarTokenRegistro(token);
    }

private void enviarTokenRegistro(String token){

        if(token==null){
            Log.d(TAG,"Sin token");
        }else {
            Log.d(TAG, token);
        }
}


}
