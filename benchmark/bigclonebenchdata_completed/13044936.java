


class c13044936 {
public MyHelperClass Calendar;

    public List parseTLE(String urlString) throws IOException {
        List elementSets =(List)(Object) new ArrayList();
        BufferedReader reader = null;
        try {
            String line = null;
            int i = 0;
            URL url = new URL(urlString);
            String[] lines = new String[3];
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                i++;
                switch(i) {
                    case 1:
                        {
                            lines[0] = line;
                            break;
                        }
                    case 2:
                        {
                            lines[1] = line;
                            break;
                        }
                    case 3:
                        {
                            lines[2] = line;
                            MyHelperClass StringUtils = new MyHelperClass();
                            Long catnum = Long.parseLong((String)(Object)StringUtils.strip(lines[1].substring(2, 7)));
//                            MyHelperClass StringUtils = new MyHelperClass();
                            long setnum = Long.parseLong((String)(Object)StringUtils.strip(lines[1].substring(64, 68)));
                            MyHelperClass TZ = new MyHelperClass();
                            elementSets.add(new SatelliteElementSet(catnum, lines, setnum, Calendar.getInstance(TZ).getTime()));
                            i = 0;
                            break;
                        }
                    default:
                        {
                            throw new IOException("TLE string did not contain three elements");
                        }
                }
            }
        } finally {
            if (null != reader) {
                reader.close();
            }
        }
        return elementSets;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass strip(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }}

class List {

public MyHelperClass add(SatelliteElementSet o0){ return null; }}

class SatelliteElementSet {

SatelliteElementSet(Long o0, String[] o1, long o2, MyHelperClass o3){}
	SatelliteElementSet(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
