import java.io.*;
import java.lang.*;
import java.util.*;



class c12724823 {
public MyHelperClass Application;
public MyHelperClass askDownloadNewVersion(String o0, String o1){ return null; }

    private void checkForNewVersion() {
        try {
            ResourceMap resourceMap =(ResourceMap)(Object) Application.getInstance(TaskStackApp.class).getContext().getResourceMap(NewTaskDialog.class);
            String versionUrl =(String)(Object) resourceMap.getString("Application.versionFileUrl");
            long startTime = System.currentTimeMillis();
            System.out.println("Retrieving version file from\n" + versionUrl);
            URL url = new URL(versionUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.startsWith("LastVersion")) {
                    String remoteVersion = str.substring(str.indexOf("=") + 1);
                    String localVersion =(String)(Object) resourceMap.getString("Application.version");
                    System.out.println("Version file found");
                    System.out.println("Local version: " + localVersion);
                    System.out.println("Remote version: " + remoteVersion);
                    if (remoteVersion.compareTo(localVersion) > 0) {
                        askDownloadNewVersion(remoteVersion, localVersion);
                    }
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Elapsed time " + (endTime - startTime) + "ms");
            in.close();
        } catch (UncheckedIOException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContext(){ return null; }
	public MyHelperClass getResourceMap(Class<NewTaskDialog> o0){ return null; }
	public MyHelperClass getInstance(Class<TaskStackApp> o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ResourceMap {

public MyHelperClass getString(String o0){ return null; }}

class NewTaskDialog {

}

class TaskStackApp {

}
