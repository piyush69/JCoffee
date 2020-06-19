


class c2305051 {
public MyHelperClass MessageFormat;
public MyHelperClass round(double o0, int o1){ return null; }

    public CandleSeries fetchSeries(final String symbol) throws Exception {
        MyHelperClass TimeZone = new MyHelperClass();
        Calendar cal =(Calendar)(Object) Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        MyHelperClass begin = new MyHelperClass();
        cal.setTime(begin);
        MyHelperClass Calendar = new MyHelperClass();
        String beginYear = String.valueOf(cal.get(Calendar.YEAR));
//        MyHelperClass Calendar = new MyHelperClass();
        String beginMonth = String.valueOf(cal.get(Calendar.MONTH));
//        MyHelperClass Calendar = new MyHelperClass();
        String beginDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        MyHelperClass end = new MyHelperClass();
        if (end == null) {
            GregorianCalendar gCal = new GregorianCalendar();
//            MyHelperClass Calendar = new MyHelperClass();
            gCal.add(Calendar.DATE, -1);
//            MyHelperClass end = new MyHelperClass();
            end = gCal.getTime();
        }
//        MyHelperClass end = new MyHelperClass();
        cal.setTime(end);
//        MyHelperClass Calendar = new MyHelperClass();
        String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
//        MyHelperClass Calendar = new MyHelperClass();
        String month = String.valueOf(cal.get(Calendar.MONTH));
//        MyHelperClass Calendar = new MyHelperClass();
        String year = String.valueOf(cal.get(Calendar.YEAR));
        String resolution = "d";
        MyHelperClass YAHOO_URL = new MyHelperClass();
        String urlStr =(String)(Object) MessageFormat.format(YAHOO_URL, symbol, beginMonth, beginDay, beginYear, month, day, year, resolution);
        BufferedReader reader;
        String line;
        List lineList =(List)(Object) new ArrayList();
        MyHelperClass log = new MyHelperClass();
        log.info("URL [" + urlStr + "]");
        URL url = new URL(urlStr);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        line =(String)(Object) reader.readLine();
//        MyHelperClass log = new MyHelperClass();
        log.debug(line);
        while ((line =(String)(Object) reader.readLine()) != null) {
            lineList.add(0, line);
        }
        List candles =(List)(Object) new ArrayList();
        for (String currentLine :(String[])(Object) (Object[])(Object)lineList) {
//            MyHelperClass log = new MyHelperClass();
            log.debug(currentLine);
            StringTokenizer str = new StringTokenizer(currentLine, ",");
            String datestring =(String)(Object) str.nextToken();
            double open =(double)(Object) round(Double.parseDouble((String)(Object)str.nextToken()), 2);
            double high = Double.parseDouble((String)(Object)str.nextToken());
            double low = Double.parseDouble((String)(Object)str.nextToken());
            double close = Double.parseDouble((String)(Object)str.nextToken());
            long volume = 0;
            double adjclose = 0;
            if ((boolean)(Object)str.hasMoreTokens()) {
                volume = Long.parseLong((String)(Object)str.nextToken());
                MyHelperClass splitAdjust = new MyHelperClass();
                if ((boolean)(Object)splitAdjust) {
                    adjclose = Double.parseDouble((String)(Object)str.nextToken());
                }
            }
            MyHelperClass sdf = new MyHelperClass();
            Date date =(Date)(Object) sdf.parse(datestring);
            Candle candle = null;
            MyHelperClass splitAdjust = new MyHelperClass();
            if ((boolean)(Object)splitAdjust) {
                double adjustmentFactor = adjclose / close;
                candle = new Candle(symbol, date, round(open * adjustmentFactor, 2), round(high * adjustmentFactor, 2), round(low * adjustmentFactor, 2), adjclose, volume);
            } else {
                candle = new Candle(symbol, date, open, high, low, close, volume);
            }
            candles.add(candle);
        }
        return new CandleSeries(candles);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YEAR;
	public MyHelperClass MONTH;
	public MyHelperClass DATE;
	public MyHelperClass DAY_OF_MONTH;
public MyHelperClass getTimeZone(String o0){ return null; }
	public MyHelperClass format(MyHelperClass o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class CandleSeries {

CandleSeries(){}
	CandleSeries(List o0){}}

class Calendar {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass setTime(MyHelperClass o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class GregorianCalendar {

public MyHelperClass add(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getTime(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class List {

public MyHelperClass add(Candle o0){ return null; }
	public MyHelperClass add(int o0, String o1){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Candle {

Candle(String o0, Date o1, double o2, double o3, double o4, double o5, long o6){}
	Candle(String o0, Date o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, double o5, long o6){}
	Candle(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class Date {

}
