import java.io.*;
import java.lang.*;
import java.util.*;



class c991473 {
public MyHelperClass NULL;
public MyHelperClass monitor;
	public MyHelperClass MessageUtils;

    private void doUpdate(final boolean notifyOnChange) {
        MyHelperClass validServerUrl = new MyHelperClass();
        if (!(Boolean)(Object)validServerUrl) {
            return;
        }
        boolean tempBuildClean = true;
        List failedBuilds = new ArrayList();
        try {
            MyHelperClass url = new MyHelperClass();
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                MyHelperClass ROW_PARSER_PATTERN = new MyHelperClass();
                Matcher matcher =(Matcher)(Object) ROW_PARSER_PATTERN.matcher(line);
                MyHelperClass checkAllProjects = new MyHelperClass();
                if ((Boolean)(Object)matcher.matches() && (Boolean)(Object)checkAllProjects) {
                    MyHelperClass GROUP_PROJECT = new MyHelperClass();
                    String project =(String)(Object) matcher.group(GROUP_PROJECT);
                    MyHelperClass GROUP_STATUS = new MyHelperClass();
                    String status =(String)(Object) matcher.group(GROUP_STATUS);
                    MyHelperClass MessageUtils = new MyHelperClass();
                    if (status.equals(MessageUtils.getString("ccOutput.status.failed"))) {
                        tempBuildClean = false;
                        failedBuilds.add(project);
                    }
                }
            }
        } catch (IOException e) {
            boolean serverReachable =(boolean)(Object) NULL; //new boolean();
            serverReachable = false;
            if (notifyOnChange) {
                MyHelperClass url = new MyHelperClass();
                monitor.notifyServerUnreachable(MessageUtils.getString("error.readError", new String[] { url.toString() }));
            }
            return;
        }
        MyHelperClass buildClean = new MyHelperClass();
        if (notifyOnChange && (boolean)(Object)buildClean && !tempBuildClean) {
            MyHelperClass MessageUtils = new MyHelperClass();
            monitor.notifyBuildFailure(MessageUtils.getString("message.buildFailed", new Object[] { failedBuilds.get(0) }));
        }
//        MyHelperClass buildClean = new MyHelperClass();
        if (notifyOnChange && !(Boolean)(Object)buildClean && tempBuildClean) {
            MyHelperClass MessageUtils = new MyHelperClass();
            monitor.notifyBuildFixed(MessageUtils.getString("message.allBuildsClean"));
        }
//        MyHelperClass buildClean = new MyHelperClass();
        buildClean =(MyHelperClass)(Object) tempBuildClean;
//        MyHelperClass buildClean = new MyHelperClass();
        monitor.setStatus(buildClean);
        boolean serverReachable =(boolean)(Object) NULL; //new boolean();
        serverReachable = true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notifyBuildFixed(MyHelperClass o0){ return null; }
	public MyHelperClass notifyBuildFailure(MyHelperClass o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass getString(String o0, Object[] o1){ return null; }
	public MyHelperClass notifyServerUnreachable(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class Matcher {

public MyHelperClass matches(){ return null; }
	public MyHelperClass group(MyHelperClass o0){ return null; }}
