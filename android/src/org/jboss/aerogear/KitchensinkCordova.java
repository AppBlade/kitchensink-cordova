package org.jboss.aerogear;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

import com.appblade.framework.AppBlade;

public class KitchensinkCordova extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        String token = "c8223091173a8949c02ec6d5838f487b";
        String secret = "cb29424385cb284b381d76261e538faf";
        String uuid = "dd70ca7b-a841-48f2-bdee-7fcc0929e9f5";
        String issuance = "1333051907";
        
        AppBlade.register(this, token, secret, uuid, issuance);
        
        super.loadUrl("file:///android_asset/www/index.html");
    }
    
    @Override
    public void onResume()
    {
    	super.onResume();
    	AppBlade.authorize(this);
    }
}

