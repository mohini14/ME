package com.lawconcierge.me;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

/**
 * Created by mohini on 11/01/18.
 */

public class Utility {

    public static void hideKeyboard(Activity activity){

        View view = activity.getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public  static void manageKeyboardOnView(final Activity activity, int id){

        activity.findViewById(id).setOnTouchListener(new View.OnTouchListener( ) {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Utility.hideKeyboard(activity);
                return false;
            }
        });
    }

    public static void showAlertBox(Activity activity, String message){

        AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
        alertDialog.setTitle(R.string.alert_message);
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, activity.getString(R.string.ok_message),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public static void showToast(Activity activity, String text){

        Toast.makeText(activity, text, Toast.LENGTH_LONG).show();
    }
}
