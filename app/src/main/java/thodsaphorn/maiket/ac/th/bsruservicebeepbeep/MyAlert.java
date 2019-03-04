package thodsaphorn.maiket.ac.th.bsruservicebeepbeep;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlert {

    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }
    public void normalDialog(String title,String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}
