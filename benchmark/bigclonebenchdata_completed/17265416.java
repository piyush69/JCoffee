


class c17265416 {
public MyHelperClass runReport(Node o0){ return null; }
public MyHelperClass log;
	public MyHelperClass sched;
	public MyHelperClass basedir;
	public MyHelperClass MainConfig;
	public MyHelperClass addStatsJob(){ return null; }
	public MyHelperClass validate(){ return null; }

    public void run() throws Exception {
        Properties buildprops = new Properties();
        try {
            ClassLoader cl = this.getClass().getClassLoader();
            URL url =(URL)(Object) cl.getResource("build.properties");
            InputStream is =(InputStream)(Object) url.openStream();
            ;
            buildprops.load(is);
        } catch (Exception ex) {
            MyHelperClass log = new MyHelperClass();
            log.error("Problem getting build props", ex);
        }
        System.out.println("Report Server v" + buildprops.getProperty("version", "unknown") + "-" + buildprops.getProperty("build", "unknown"));
        validate();
        if ((boolean)(Object)log.isInfoEnabled()) {
            log.info("Starting Report Server v" + buildprops.getProperty("version", "unknown") + "-" + buildprops.getProperty("build", "unknown"));
        }
        MainConfig config =(MainConfig)(Object) MainConfig.newInstance();
        basedir = config.getBaseDirectory();
        if ((boolean)(Object)log.isInfoEnabled()) {
            log.info("basedir = " + basedir);
        }
        SchedulerFactory schedFact =(SchedulerFactory)(Object) new StdSchedulerFactory();
        sched = schedFact.getScheduler();
        NodeList reports =(NodeList)(Object) config.getReports();
        for (int x = 0; x < (int)(Object)reports.getLength(); x++) {
            try {
                if ((boolean)(Object)log.isInfoEnabled()) {
                    log.info("Adding report at index " + x);
                }
                Node report =(Node)(Object) reports.item(x);
                runReport(report);
            } catch (Exception ex) {
                if ((boolean)(Object)log.isErrorEnabled()) {
                    log.error("Can't add a report at report index " + x, ex);
                }
            }
        }
        addStatsJob();
        sched.start();
        WebServer webserver = new WebServer(8080);
        webserver.setParanoid(false);
        webserver.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isErrorEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass getProperty(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class MainConfig {

public MyHelperClass getReports(){ return null; }
	public MyHelperClass getBaseDirectory(){ return null; }}

class SchedulerFactory {

public MyHelperClass getScheduler(){ return null; }}

class StdSchedulerFactory {

}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

}

class WebServer {

WebServer(int o0){}
	WebServer(){}
	public MyHelperClass setParanoid(boolean o0){ return null; }
	public MyHelperClass start(){ return null; }}
