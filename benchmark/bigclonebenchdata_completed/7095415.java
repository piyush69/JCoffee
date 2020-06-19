import java.io.*;
import java.lang.*;
import java.util.*;



class c7095415 {
public MyHelperClass map;
	public MyHelperClass list;

    public void CountModel(URL url) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        String line;
        list =(MyHelperClass)(Object) new ArrayList<CountModelItem>();
        map =(MyHelperClass)(Object) new HashMap<String, CountModelItem>();
        line = in.readLine();
        int n = 1;
        String[] rowAttrib;
        CountModelItem item;
        while ((line = in.readLine()) != null) {
            rowAttrib = line.split(";");
            item = new CountModelItem(n, Integer.valueOf(rowAttrib[1]).intValue(), Integer.valueOf(rowAttrib[2]).intValue(), Integer.valueOf(rowAttrib[3]).intValue(), rowAttrib[0]);
            list.add(item);
            map.put(item.getHash(), item);
            n++;
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, CountModelItem o1){ return null; }
	public MyHelperClass add(CountModelItem o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class CountModelItem {

CountModelItem(){}
	CountModelItem(int o0, int o1, int o2, int o3, String o4){}
	public MyHelperClass getHash(){ return null; }}
