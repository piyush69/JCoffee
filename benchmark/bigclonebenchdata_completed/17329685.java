
import java.io.UncheckedIOException;


class c17329685 {
public static MyHelperClass TimeUtil;
//public MyHelperClass TimeUtil;

    private static void updateLeapSeconds() throws IOException, MalformedURLException, NumberFormatException {
        URL url = new URL("http://cdf.gsfc.nasa.gov/html/CDFLeapSeconds.txt");
        InputStream in;
        try {
            in =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException ex) {
            url =(URL)(Object) LeapSecondsConverter.class.getResource("CDFLeapSeconds.txt");
            in =(InputStream)(Object) url.openStream();
            System.err.println("Using local copy of leap seconds!!!");
        }
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String s = "";
        ArrayList leapSeconds;// = new ArrayList();
        leapSeconds = new ArrayList(50);
        ArrayList withoutLeapSeconds;// = new ArrayList();
        withoutLeapSeconds = new ArrayList(50);
        String lastLine = s;
        while (s != null) {
            s =(String)(Object) r.readLine();
            if (s == null) {
                System.err.println("Last leap second read from " + url + " " + lastLine);
                continue;
            }
            if (s.startsWith(";")) {
                continue;
            }
            String[] ss = s.trim().split("\\s+", -2);
            if (ss[0].compareTo("1972") < 0) {
                continue;
            }
            int iyear = Integer.parseInt(ss[0]);
            int imonth = Integer.parseInt(ss[1]);
            int iday = Integer.parseInt(ss[2]);
            int ileap = (int) (Double.parseDouble(ss[3]));
            MyHelperClass Units = new MyHelperClass();
            double us2000 =(double)(Object) TimeUtil.createTimeDatum(iyear, imonth, iday, 0, 0, 0, 0).doubleValue(Units.us2000);
//            MyHelperClass leapSeconds = new MyHelperClass();
            leapSeconds.add(Long.valueOf(((long) us2000) * 1000L - 43200000000000L + (long) (ileap - 32) * 1000000000));
//            MyHelperClass withoutLeapSeconds = new MyHelperClass();
            withoutLeapSeconds.add(us2000);
        }
//        MyHelperClass leapSeconds = new MyHelperClass();
        leapSeconds.add(Long.MAX_VALUE);
//        MyHelperClass withoutLeapSeconds = new MyHelperClass();
        withoutLeapSeconds.add(Double.MAX_VALUE);
        long lastUpdateMillis;// = new long();
        lastUpdateMillis = System.currentTimeMillis();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass us2000;
public MyHelperClass doubleValue(MyHelperClass o0){ return null; }
	public MyHelperClass add(long o0){ return null; }
	public MyHelperClass createTimeDatum(int o0, int o1, int o2, int o3, int o4, int o5, int o6){ return null; }
	public MyHelperClass add(double o0){ return null; }
	public MyHelperClass add(Long o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class LeapSecondsConverter {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class ArrayList {

ArrayList(){}
	ArrayList(int o0){}
	public MyHelperClass add(long o0){ return null; }
	public MyHelperClass add(double o0){ return null; }
	public MyHelperClass add(Long o0){ return null; }}
