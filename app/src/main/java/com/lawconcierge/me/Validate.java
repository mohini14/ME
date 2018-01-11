package com.lawconcierge.me;

import android.app.Activity;
import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mohini on 11/01/18.
 */

public class Validate {

    /**
     * method validates if the input string is in email format or not
     * @param activity
     * @param emailId
     * @return boolean value depending upon if a string is a email id or not
     */
    public static boolean validateEmail(Activity activity, String emailId) {

        boolean returnValue = true;

        // if email id is empty
        if (emailId.isEmpty( )) {

            Utility.showToast(activity, activity.getString(R.string.empty_field_message));
            returnValue = false;
        }
        // email id is not in correct format
        else if (!(Patterns.EMAIL_ADDRESS.matcher(emailId).matches( ))) {
            Utility.showToast(activity, activity.getString(R.string.wrong_emailid_message));
            returnValue = false;
        }

        return returnValue;
    }

    /**
     * method validates if the input string is in password format or not
     * @param activity
     * @param password
     * @return boolean value depending upon if a string is a password format or not
     */
    public static boolean validatePassword(Activity activity, String password) {

        boolean returnValue = true;

        // check if password is empty
        if (password.isEmpty( )) {
            Utility.showToast(activity, activity.getString(R.string.empty_field_message));
            returnValue = false;
        }
        // if password is not of correct format
        //todo
        else if (password.length( ) < 7) {
            Utility.showAlertBox(activity, activity.getString(R.string.wrong_password_message));
            returnValue = false;
        }
        return returnValue;
    }
}
