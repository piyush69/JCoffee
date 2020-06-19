import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11677415 {
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @Test
    public void behaveTest()  throws Throwable {
        InputStream is = this.getClass().getResourceAsStream("safetyCaseTest.mdf");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, out);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read mdf", e);
        }
        TrafficSimulationEngine engine = new TrafficSimulationEngine();
        MyHelperClass MDFReader = new MyHelperClass();
        TrafficModelDefinition def = MDFReader.read(out.toByteArray());
        engine.init(def);
        Map<Integer, Set<Integer>> linkSegments = new HashMap<Integer, Set<Integer>>();
        Set<Integer> segments = new HashSet<Integer>();
        segments.add(0);
        linkSegments.put(0, segments);
        FrameProperties frameProperties = new FrameProperties(linkSegments, new HashSet<Integer>());
        engine.setFrameProperties(frameProperties);
        RegularVehicle vehicle = (RegularVehicle) engine.getDynamicObjects().iterator().next();
        CompositeDriver driver = (CompositeDriver) vehicle.getDriver();
        driver.drive(0.1f);
        SafetyCase safety = new SafetyCase(driver);
        RectangleCCRange ccRange = (RectangleCCRange) safety.behave(0.1f);
        HandRange turnRange = ccRange.getTurnRange();
        HandRange probeRange = new HandRange();
        MyHelperClass Hand = new MyHelperClass();
        probeRange.remove(Hand.Left);
        assertTrue(turnRange.equals(probeRange));
        MyHelperClass Priority = new MyHelperClass();
        assertTrue(ccRange.getPriority() == Priority.SafetyCase);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Left;
	public MyHelperClass SafetyCase;
public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class Test {

}

class TrafficSimulationEngine {

public MyHelperClass setFrameProperties(FrameProperties o0){ return null; }
	public MyHelperClass getDynamicObjects(){ return null; }
	public MyHelperClass init(TrafficModelDefinition o0){ return null; }}

class TrafficModelDefinition {

}

class FrameProperties {

FrameProperties(Map<Integer,Set<Integer>>,HashSet<Integer> o0){}
	FrameProperties(){}}

class RegularVehicle {

public MyHelperClass getDriver(){ return null; }}

class CompositeDriver {

public MyHelperClass drive(float o0){ return null; }}

class SafetyCase {

SafetyCase(CompositeDriver o0){}
	SafetyCase(){}
	public MyHelperClass behave(float o0){ return null; }}

class RectangleCCRange {

public MyHelperClass getTurnRange(){ return null; }
	public MyHelperClass getPriority(){ return null; }}

class HandRange {

}
