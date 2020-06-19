import java.io.*;
import java.lang.*;
import java.util.*;



class c20028790 {

    private static boolean setBundleInfoName(String location, List<BundleInfo> list) {
        try {
            URL url = new URL(location);
            BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream(), "UTF-8"));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                int pos1 = line.indexOf('=');
                if (pos1 < 0) {
                    continue;
                }
                String bundleSymbolicName = line.substring(0, pos1);
                String bundleName = line.substring(pos1 + 1);
                for (BundleInfo info : list) {
                    if (info.bundleSymbolicName.equals(bundleSymbolicName)) {
                        info.bundleName =(MyHelperClass)(Object) bundleName;
                        break;
                    }
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BundleInfo {
public MyHelperClass bundleSymbolicName;
	public MyHelperClass bundleName;
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
