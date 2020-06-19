


class c17202158 {

    static HashSet readZoneIDs(String zoneFileName) {
        HashSet zoneids = new HashSet();
        try {
            URL url =(URL)(Object) zoneFileName.getClass().getResource(zoneFileName);
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(url.openStream()));
            String line = null;
            while ((line =(String)(Object) lnr.readLine()) != null) zoneids.add(Integer.parseInt(line));
        } catch (Exception xc) {
            xc.printStackTrace();
        }
        return zoneids;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HashSet {

public MyHelperClass add(int o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
