package www.smartandroidcourse.com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splash=new Thread(){
            public void run(){

                try{
                    sleep(4*1000);
                    Intent splash_intent=new Intent(getApplicationContext(),HomeScreen.class);
                    startActivity(splash_intent);
                    finish();
                }catch (Exception e){

                }
            }


        };
        splash.start();
    }
    }

