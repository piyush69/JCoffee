import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21125261 {

//    @Test
    public void test() throws Throwable, Exception {
        InputStream is = this.getClass().getResourceAsStream("originAndDestination.xml");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, byteArrayOutputStream);
        MyHelperClass MDFReader = new MyHelperClass();
        TrafficModelDefinition def = MDFReader.read(byteArrayOutputStream.toByteArray());
        TrafficSimulationEngine se = new TrafficSimulationEngine();
        se.init(def);
        int linkId = 2;
        int segmentId = 0;
        Map<Integer, Set<Integer>> linkSegments = new HashMap<Integer, Set<Integer>>();
        Set<Integer> segments = new HashSet<Integer>();
        segments.add(segmentId);
        linkSegments.put(linkId, segments);
        FrameProperties frameProperties = new FrameProperties(linkSegments, new HashSet<Integer>());
        se.setFrameProperties(frameProperties);
        for (float time = 0; time < 60 * 10; time += 0.1f) {
            se.step(0.1f);
            for (RoadObject vehicle : se.getDynamicObjects()) {
                System.out.println(time + ": X=" + vehicle.getPosition() + "\tV=" + vehicle.getSpeed());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class Test {

}

class TrafficModelDefinition {

}

class TrafficSimulationEngine {

public MyHelperClass setFrameProperties(FrameProperties o0){ return null; }
	public MyHelperClass getDynamicObjects(){ return null; }
	public MyHelperClass step(float o0){ return null; }
	public MyHelperClass init(TrafficModelDefinition o0){ return null; }}

class FrameProperties {

FrameProperties(Map<Integer,Set<Integer>>,HashSet<Integer> o0){}
	FrameProperties(){}}

class RoadObject {

public MyHelperClass getSpeed(){ return null; }
	public MyHelperClass getPosition(){ return null; }}
