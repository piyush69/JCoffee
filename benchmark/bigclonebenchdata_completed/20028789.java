import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20028789 {
public MyHelperClass setBundleInfoName(String o0, List<BundleInfo o1){ return null; }

    private static BundleInfo[] getBundleInfoArray(String location) throws Throwable, IOException {
        MyHelperClass BUNDLE_LIST_FILE = new MyHelperClass();
        URL url = new URL(location + BUNDLE_LIST_FILE);
        BufferedReader br = null;
        List<BundleInfo> list = new ArrayList<BundleInfo>();
        try {
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                int pos1 = line.indexOf('=');
                if (pos1 < 0) {
                    continue;
                }
                BundleInfo info = new BundleInfo();
                info.bundleSymbolicName = line.substring(0, pos1);
                info.location = line.substring(pos1 + 1);
                list.add(info);
            }
            MyHelperClass BUNDLE_NAME_LIST_FILE = new MyHelperClass();
            if (!setBundleInfoName(location + BUNDLE_NAME_LIST_FILE + "_" + Locale.getDefault().getLanguage(), list)) {
//                MyHelperClass BUNDLE_NAME_LIST_FILE = new MyHelperClass();
                setBundleInfoName(location + BUNDLE_NAME_LIST_FILE, list);
            }
            MyHelperClass BUNDLE_INFO_EMPTY_ARRAY = new MyHelperClass();
            return list.toArray(BUNDLE_INFO_EMPTY_ARRAY);
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BundleInfo {
public MyHelperClass bundleSymbolicName;
	public MyHelperClass location;
}

class Collection {

public MyHelperClass toArray(MyHelperClass o0){ return null; }}
