package com.seanzx.cuforia;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Cuforia extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        
        // Handle all expected actions
        if(action.equals("cordovaStartVuforia")) {
            startVuforia(action, args, callbackContext);
        }
        else if(action.equals("cordovaStopVuforia")) {
            stopVuforia(action, args, callbackContext);
        }
        else if(action.equals("cordovaStopTrackers")) {
            stopVuforiaTrackers(action, args, callbackContext);
        }
        else if(action.equals("cordovaStartTrackers")) {
            startVuforiaTrackers(action, args, callbackContext);
        }
        else if(action.equals("cordovaUpdateTargets")) {
            updateVuforiaTargets(action, args, callbackContext);
        }
        else {
            return false;
        }

        return true;
    }

    public void startVuforia(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //TODO:
    }

    public void stopVuforia(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //TODO:
    }

    public void startVuforiaTrackers(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //TODO:
    }

    public void updateVuforiaTargets(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //TODO:
    }
}
