package shareholder.infinity.com.invento2k18;

import android.app.Application;

import com.pushbots.push.Pushbots;

/**
 * Created by Abhishek Jakkannavar on 3/5/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Pushbots Library
        Pushbots.sharedInstance().init(this);
    }
}