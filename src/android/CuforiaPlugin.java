package com.seanzx.cuforia;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.vuforia.Vuforia;

/**
 * This class echoes a string called from JavaScript.
 */
public class CuforiaPlugin extends CordovaPlugin {

    private static String TAG = "cuforia";
    public String key = "ARWew8T/////AAAAAFfGjmmevkaStzS/ubwzoq41fZDzeg7vVS4hFrktpLuHbBXUVEe7yawMjAXfruf810aenI4bFAH4pHgM/D5ErIyLhsn6ct1qnMRGJy2tqcRsTOHZuqnEMRLiCwtnANvO8qxN5DXztFJSqCgrW2can9708d5o32QvsB/T6eD1BKao9ZIMXApddusf7NLizCHkxAESC7+UQVPZYeiwr1VoJqbyhvaxd1CdDo55/wfGgkuQQenFsRrAnppQcPyYn0C51GmgdCa8JY6ynp6jI5UWMC7TIIji64rO5PSkp3Tn0lRsifD+2MyOCm3jAhrpF42wPaWa/XG3qbXUvXlatcDjVJDM4+prw3U2iOl+xW2cdvBX";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        
        if(action.equals("startVuforia")) {
            startVuforia(action, args, callbackContext);            
        }
        else {
            return false;
        }
        return true;        
    }

    public void startVuforia(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //TODO:
        Vuforia.setInitParameters(cordova.getActivity(), Vuforia.GL_20, key);

        JSONObject json = new JSONObject();

        if(Vuforia.init() > 0) {
            Log.d(TAG, "vuforia started");
            json.put("success", "true");
        }
        else {
            Log.d(TAG, "vuforia failed to start");
            json.put("success", "false");
            json.put("message", "vuforia failed to start");
        }

        PluginResult result = new PluginResult(PluginResult.Status.OK, json);
        callbackContext.sendPluginResult(result);

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
