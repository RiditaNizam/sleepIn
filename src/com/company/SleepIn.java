package com.company;

/**
 * Created by ridita on 1/21/17.
 */
public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == true && vacation == true) {
            return true;
        } else if (weekday == false && vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}

