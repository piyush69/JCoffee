
import java.io.UncheckedIOException;


class c505090 {

    public static void main(String[] args) {
        URL url = null;
        EventHeap eh = new EventHeap("iw-room2");
        Event newEvent;
        float chan1 = -1, chan2 = -1;
        try {
            url = new URL("http://iw--bluetooth-ap/cgi-bin/sens.cgi");
        } catch (UncheckedIOException e) {
        }
        byte buf[] = new byte[1000];
        while (true) {
            try {
                InputStream in =(InputStream)(Object) url.openStream();
                int length =(int)(Object) in.read(buf);
                String page = new String(buf);
                String data = page.substring(290);
                if (data.startsWith("No Sensors Found")) {
                    Thread.sleep(1000);
                } else {
                    String sensorID = data.substring(15, 32);
                    String channel1 = data.substring(163, 167);
                    String channel2 = data.substring(266, 270);
                    if (Float.parseFloat(channel1) != chan1) {
                        System.out.println(sensorID);
                        System.out.println("Channel 1:" + channel1);
                        newEvent = new Event("iStuffInputEvent");
                        newEvent.addField("Device", "Slider");
                        newEvent.addField("ID", sensorID + ":channel1");
                        newEvent.addField("Value", channel1);
                        newEvent.addField("Max", String.valueOf(5));
                        newEvent.addField("Min", String.valueOf(0));
                        eh.putEvent(newEvent);
                        chan1 = Float.parseFloat(channel1);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class EventHeap {

EventHeap(String o0){}
	EventHeap(){}
	public MyHelperClass putEvent(Event o0){ return null; }}

class Event {

Event(String o0){}
	Event(){}
	public MyHelperClass addField(String o0, String o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}
