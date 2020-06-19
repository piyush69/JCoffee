import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17938737 {
public MyHelperClass Messages;

//        @SuppressWarnings("unchecked")
        private List<String> getLogFile()  throws Throwable {
            String homeServer = "";
            Realm realm = null;
            MyHelperClass node = new MyHelperClass();
            if (null == node) {
                if (null != System.getProperty("ThinClientManager.server.Codebase")) try {
                    homeServer = new URL(System.getProperty("ThinClientManager.server.Codebase")).getHost();
                } catch (final MalformedURLException e1) {
                    e1.printStackTrace();
                }
            } else {
//                MyHelperClass node = new MyHelperClass();
                realm = (Realm) node.getLookup().lookup(Realm.class);
                if (null != realm.getSchemaProviderName()) homeServer =(String)(Object) realm.getSchemaProviderName(); else if (null != realm.getConnectionDescriptor().getHostname()) homeServer = realm.getConnectionDescriptor().getHostname();
            }
            if (homeServer.length() == 0) homeServer = "localhost";
            try {
                MyHelperClass fileName = new MyHelperClass();
                final URL url = new URL("http", homeServer, 8080,(String)(Object) fileName);
                final BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                final ArrayList<String> lines = new ArrayList<String>();
                String line;
                MyHelperClass isClient = new MyHelperClass();
                if ((boolean)(Object)isClient) {
                    MyHelperClass macAdress = new MyHelperClass();
                    while ((line = br.readLine()) != null) if (line.contains((CharSequence)(Object)macAdress)) lines.add(line);
//                    MyHelperClass macAdress = new MyHelperClass();
                    if (lines.size() == 0) lines.add(Messages.getString("LogDetailView.getLogFile.NoEntrysForTC", macAdress));
                } else while ((line = br.readLine()) != null) lines.add(line);
                br.close();
                MyHelperClass Messages = new MyHelperClass();
                if (lines.size() == 0) lines.add((String)(Object)Messages.getString("LogDetailView.getLogFile.NoEntrys"));
                return lines;
            } catch (final MalformedURLException e) {
                e.printStackTrace();
                MyHelperClass ErrorManager = new MyHelperClass();
                ErrorManager.getDefault().notify(e);
            } catch (final IOException e) {
                e.printStackTrace();
                MyHelperClass ErrorManager = new MyHelperClass();
                ErrorManager.getDefault().notify(e);
            }
            return Collections.EMPTY_LIST;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getString(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getLookup(){ return null; }
	public MyHelperClass lookup(Class<Realm o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class Realm {

public MyHelperClass getSchemaProviderName(){ return null; }
	public MyHelperClass getConnectionDescriptor(){ return null; }}

class Object {

public MyHelperClass notify(IOException o0){ return null; }
	public MyHelperClass notify(MalformedURLException o0){ return null; }}
