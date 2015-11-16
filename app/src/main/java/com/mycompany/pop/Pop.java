package com.mycompany.pop;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by Pop on 11/10/2015 AD.
 */
public class Pop extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "JcZt8HEnIKbpVYdVhG3rwg00vom0uhrU7eYeyO9W", "1ZxTC8PkhctH0mnsIxdjW5wcyl0IOmRHX4Y4sV5R");
        ParseFacebookUtils.initialize(getApplicationContext());
    }
}
