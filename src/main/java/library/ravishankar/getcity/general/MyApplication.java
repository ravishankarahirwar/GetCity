package library.ravishankar.getcity.general;

import android.app.Application;

import library.ravishankar.getcity.managers.ContentManager;
import library.ravishankar.getcity.rest.RestClientManager;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        RestClientManager.init(getApplicationContext());
        ContentManager.init(getApplicationContext());
    }
}
