import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23609826 {

//    @Override
    public void onSensorChanged(SensorEvent event)  throws Throwable {
        float values[] =(float[])(Object) event.values;
        MyHelperClass httpRequestRunning = new MyHelperClass();
        if ((boolean)(Object)httpRequestRunning) {
            return;
        }
        MyHelperClass SensorManager = new MyHelperClass();
        float x = values[0] / (float)(Object)SensorManager.GRAVITY_EARTH;
//        MyHelperClass SensorManager = new MyHelperClass();
        float y = values[1] / (float)(Object)SensorManager.GRAVITY_EARTH;
//        MyHelperClass SensorManager = new MyHelperClass();
        float z = values[2] / (float)(Object)SensorManager.GRAVITY_EARTH;
        MyHelperClass edtIpAddress = new MyHelperClass();
        String ip = edtIpAddress.getText().toString();
        String server = new String("http://" + ip + ":8080/ACC/");
        server += String.valueOf(x);
        server += "/";
        server += String.valueOf(y);
        server += "/";
        server += String.valueOf(z);
        final URL url;
        try {
            url = new URL(server);
        } catch (MalformedURLException e) {
            return;
        }
//        MyHelperClass httpRequestRunning = new MyHelperClass();
        httpRequestRunning =(MyHelperClass)(Object) true;
        MyHelperClass handler = new MyHelperClass();
        handler.post(new Runnable() {

            public void run() {
                try {
                    URLConnection conn = url.openConnection();
                    conn.getInputStream().close();
                } catch (IOException e) {
                }
                MyHelperClass NULL = new MyHelperClass();
                boolean httpRequestRunning =(boolean)(Object) NULL; //new boolean();
                httpRequestRunning = false;
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GRAVITY_EARTH;
public MyHelperClass post( Runnable o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass post(){ return null; }}

class SensorEvent {
public MyHelperClass values;
}
