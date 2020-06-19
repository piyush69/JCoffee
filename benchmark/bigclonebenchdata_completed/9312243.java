import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9312243 {
public MyHelperClass population;
	public MyHelperClass config;
	public MyHelperClass network;
public MyHelperClass uncaughtException;
	public MyHelperClass IOUtils;
	public MyHelperClass collectLogMessagesAppender;
	public MyHelperClass dumpDataAtEnd;
	public MyHelperClass FILENAME_POPULATION;
	public MyHelperClass log;
	public MyHelperClass shutdownHook;
	public MyHelperClass controlerIO;
	public MyHelperClass FILENAME_NETWORK;
	public MyHelperClass FILENAME_CONFIG;
	public MyHelperClass getLastIteration(){ return null; }
	public MyHelperClass getConfig(){ return null; }

    void shutdown(final boolean unexpected) {
        if (unexpected) {
            MyHelperClass log = new MyHelperClass();
            log.warn("S H U T D O W N   ---   received unexpected shutdown request.");
        } else {
            MyHelperClass log = new MyHelperClass();
            log.info("S H U T D O W N   ---   start regular shutdown.");
        }
        if (this.uncaughtException != null) {
            log.warn("Shutdown probably caused by the following Exception.", this.uncaughtException);
        }
        log.error("check if we need the controler listener infrastructure");
        if ((boolean)(Object)this.dumpDataAtEnd) {
            new PopulationWriter(this.population, this.network).write(this.controlerIO.getOutputFilename(FILENAME_POPULATION));
            new NetworkWriter(this.network).write(this.controlerIO.getOutputFilename(FILENAME_NETWORK));
            new ConfigWriter(this.config).write(this.controlerIO.getOutputFilename(FILENAME_CONFIG));
            if (!unexpected && (boolean)(Object)this.getConfig().vspExperimental().isWritingOutputEvents()) {
                File toFile = new File((String)(Object)this.controlerIO.getOutputFilename("output_events.xml.gz"));
                File fromFile = new File((String)(Object)this.controlerIO.getIterationFilename(this.getLastIteration(), "events.xml.gz"));
                IOUtils.copyFile(fromFile, toFile);
            }
        }
        if (unexpected) {
            log.info("S H U T D O W N   ---   unexpected shutdown request completed.");
        } else {
            log.info("S H U T D O W N   ---   regular shutdown completed.");
        }
        try {
            Runtime.getRuntime().removeShutdownHook((Thread)(Object)this.shutdownHook);
        } catch (IllegalStateException e) {
            log.info("Cannot remove shutdown hook. " + e.getMessage());
        }
        this.shutdownHook = null;
        this.collectLogMessagesAppender = null;
        IOUtils.closeOutputDirLogging();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeOutputDirLogging(){ return null; }
	public MyHelperClass getOutputFilename(String o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass warn(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass vspExperimental(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isWritingOutputEvents(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getOutputFilename(MyHelperClass o0){ return null; }
	public MyHelperClass getIterationFilename(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class PopulationWriter {

PopulationWriter(){}
	PopulationWriter(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class NetworkWriter {

NetworkWriter(MyHelperClass o0){}
	NetworkWriter(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ConfigWriter {

ConfigWriter(MyHelperClass o0){}
	ConfigWriter(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}
