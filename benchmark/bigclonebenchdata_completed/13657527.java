import java.io.*;
import java.lang.*;
import java.util.*;



class c13657527 {
public MyHelperClass Logger;

    synchronized List<String> getDatasetsList(String surl) {
        MyHelperClass datasetsList = new MyHelperClass();
        if (datasetsList == null) {
//            MyHelperClass datasetsList = new MyHelperClass();
            datasetsList =(MyHelperClass)(Object) new HashMap<String, List<String>>();
        }
//        MyHelperClass datasetsList = new MyHelperClass();
        List<String> result =(List<String>)(Object) datasetsList.get(surl);
        if (result == null) {
            BufferedReader reader = null;
            try {
                URL url = new URL(surl + "?server=list");
                reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                ArrayList<String> list = new ArrayList<String>();
                while (s != null) {
                    list.add(s);
                    s = reader.readLine();
                }
//                MyHelperClass datasetsList = new MyHelperClass();
                datasetsList.put(surl, list);
            } catch (IOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(Das2ServerDataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException(ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    MyHelperClass Level = new MyHelperClass();
                    Logger.getLogger(Das2ServerDataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//        MyHelperClass datasetsList = new MyHelperClass();
        return(List<String>)(Object) datasetsList.get(surl);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass put(String o0, ArrayList<String> o1){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class Das2ServerDataSourceFactory {

}
