import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4464301 {
public MyHelperClass scenarioData;
	public MyHelperClass population;
public MyHelperClass network;
	public MyHelperClass FILENAME_LANES;
	public MyHelperClass shutdownHook;
	public MyHelperClass FILENAME_NETWORK;
	public MyHelperClass log;
	public MyHelperClass IOUtils;
	public MyHelperClass config;
	public MyHelperClass FILENAME_POPULATION;
	public MyHelperClass FILENAME_CONFIG;
	public MyHelperClass state;
	public MyHelperClass collectLogMessagesAppender;
	public MyHelperClass controlerIO;
	public MyHelperClass controlerListenerManager;
	public MyHelperClass uncaughtException;
	public MyHelperClass FILENAME_HOUSEHOLDS;
	public MyHelperClass ControlerState;
	public MyHelperClass dumpDataAtEnd;
	public MyHelperClass getLastIteration(){ return null; }
	public MyHelperClass getFacilities(){ return null; }
	public MyHelperClass getScenario(){ return null; }
	public MyHelperClass getConfig(){ return null; }

    protected void shutdown(final boolean unexpected)  throws Throwable {
        ControlerState oldState =(ControlerState)(Object) this.state;
        this.state = ControlerState.Shutdown;
        if (oldState == (ControlerState)(Object)ControlerState.Running) {
            if (unexpected) {
                log.warn("S H U T D O W N   ---   received unexpected shutdown request.");
            } else {
                log.info("S H U T D O W N   ---   start regular shutdown.");
            }
            if (this.uncaughtException != null) {
                log.warn("Shutdown probably caused by the following Exception.", this.uncaughtException);
            }
            this.controlerListenerManager.fireControlerShutdownEvent(unexpected);
            if ((boolean)(Object)this.dumpDataAtEnd) {
                Knowledges kk;
                if ((boolean)(Object)this.config.scenario().isUseKnowledges()) {
                    kk =(Knowledges)(Object) (this.getScenario()).getKnowledges();
                } else {
                    kk =(Knowledges)(Object) this.getScenario().retrieveNotEnabledKnowledges();
                }
                new PopulationWriter(this.population, this.network, kk).write(this.controlerIO.getOutputFilename(FILENAME_POPULATION));
                new NetworkWriter(this.network).write(this.controlerIO.getOutputFilename(FILENAME_NETWORK));
                new ConfigWriter(this.config).write(this.controlerIO.getOutputFilename(FILENAME_CONFIG));
                ActivityFacilities facilities =(ActivityFacilities)(Object) this.getFacilities();
                if (facilities != null) {
                    new FacilitiesWriter((ActivityFacilitiesImpl)(ActivityFacilitiesImpl)(Object) facilities).write(this.controlerIO.getOutputFilename("output_facilities.xml.gz"));
                }
                if ((boolean)(Object)((NetworkFactoryImpl)(NetworkFactoryImpl)(Object) this.network.getFactory()).isTimeVariant()) {
                    new NetworkChangeEventsWriter().write(this.controlerIO.getOutputFilename("output_change_events.xml.gz"), ((NetworkImpl)(NetworkImpl)(Object) this.network).getNetworkChangeEvents());
                }
                if ((boolean)(Object)this.config.scenario().isUseHouseholds()) {
                    new HouseholdsWriterV10(this.scenarioData.getHouseholds()).writeFile(this.controlerIO.getOutputFilename(FILENAME_HOUSEHOLDS));
                }
                if ((boolean)(Object)this.config.scenario().isUseLanes()) {
                    new LaneDefinitionsWriter20(this.scenarioData.getScenarioElement((LaneDefinitions20)(Object)LaneDefinitions20.class)).write(this.controlerIO.getOutputFilename(FILENAME_LANES));
                }
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

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Running;
	public MyHelperClass Shutdown;
public MyHelperClass warn(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getOutputFilename(String o0){ return null; }
	public MyHelperClass closeOutputDirLogging(){ return null; }
	public MyHelperClass isWritingOutputEvents(){ return null; }
	public MyHelperClass isUseLanes(){ return null; }
	public MyHelperClass getFactory(){ return null; }
	public MyHelperClass getHouseholds(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass vspExperimental(){ return null; }
	public MyHelperClass getScenarioElement(LaneDefinitions20 o0){ return null; }
	public MyHelperClass isUseHouseholds(){ return null; }
	public MyHelperClass getKnowledges(){ return null; }
	public MyHelperClass fireControlerShutdownEvent(boolean o0){ return null; }
	public MyHelperClass getIterationFilename(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass scenario(){ return null; }
	public MyHelperClass retrieveNotEnabledKnowledges(){ return null; }
	public MyHelperClass getOutputFilename(MyHelperClass o0){ return null; }
	public MyHelperClass isUseKnowledges(){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class ControlerState {

}

class Knowledges {

}

class ActivityFacilities {

}

class NetworkFactoryImpl {

public MyHelperClass isTimeVariant(){ return null; }}

class PopulationWriter {

PopulationWriter(MyHelperClass o0, MyHelperClass o1, Knowledges o2){}
	PopulationWriter(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class NetworkWriter {

NetworkWriter(MyHelperClass o0){}
	NetworkWriter(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ConfigWriter {

ConfigWriter(MyHelperClass o0){}
	ConfigWriter(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FacilitiesWriter {

FacilitiesWriter(){}
	FacilitiesWriter(ActivityFacilitiesImpl o0){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ActivityFacilitiesImpl {

}

class NetworkChangeEventsWriter {

public MyHelperClass write(MyHelperClass o0, MyHelperClass o1){ return null; }}

class NetworkImpl {

public MyHelperClass getNetworkChangeEvents(){ return null; }}

class HouseholdsWriterV10 {

HouseholdsWriterV10(MyHelperClass o0){}
	HouseholdsWriterV10(){}
	public MyHelperClass writeFile(MyHelperClass o0){ return null; }}

class LaneDefinitionsWriter20 {

LaneDefinitionsWriter20(MyHelperClass o0){}
	LaneDefinitionsWriter20(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class LaneDefinitions20 {

}
