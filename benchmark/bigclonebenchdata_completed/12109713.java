import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12109713 {
public MyHelperClass Object;
public MyHelperClass NULL;
public MyHelperClass firstTime;
	public MyHelperClass setAscending(boolean o0){ return null; }

    protected long loadFromSource(long afterThisTime)  throws Throwable {
        long startTime = System.currentTimeMillis();
        MyHelperClass dataSourceDescriptor = new MyHelperClass();
        QuoteDataSourceDescriptor quoteDataSourceDescriptor = (QuoteDataSourceDescriptor)(QuoteDataSourceDescriptor)(Object) dataSourceDescriptor;
        MyHelperClass dataPools = new MyHelperClass();
        List<Quote> dataPool =(List<Quote>)(Object) dataPools.get(quoteDataSourceDescriptor.sourceSymbol);
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        SimpleDateFormat sdf = new SimpleDateFormat(quoteDataSourceDescriptor.dateFormat, Locale.US);
        Date fromDate = new Date();
        Date toDate = new Date();
        MyHelperClass FIRST_TIME_LOAD = new MyHelperClass();
        if (afterThisTime == (long)(Object)FIRST_TIME_LOAD) {
            fromDate =(Date)(Object) quoteDataSourceDescriptor.fromDate;
            toDate =(Date)(Object) quoteDataSourceDescriptor.toDate;
        } else {
            calendar.setTimeInMillis(afterThisTime);
            fromDate = calendar.getTime();
        }
        calendar.setTime(fromDate);
        int a = calendar.get(Calendar.MONTH);
        int b = calendar.get(Calendar.DAY_OF_MONTH);
        int c = calendar.get(Calendar.YEAR);
        calendar.setTime(toDate);
        int d = calendar.get(Calendar.MONTH);
        int e = calendar.get(Calendar.DAY_OF_MONTH);
        int f = calendar.get(Calendar.YEAR);
        BufferedReader dis;
        StringBuffer urlStr = new StringBuffer();
        urlStr.append("http://table.finance.yahoo.com/table.csv").append("?s=");
        urlStr.append(quoteDataSourceDescriptor.sourceSymbol);
        urlStr.append("&a=" + a + "&b=" + b + "&c=" + c + "&d=" + d + "&e=" + e + "&f=" + f);
        urlStr.append("&g=d&ignore=.csv");
        try {
            URL url = new URL(urlStr.toString());
            System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setAllowUserInteraction(true);
            conn.setRequestMethod("GET");
            conn.setInstanceFollowRedirects(true);
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
            dis = new BufferedReader(isr);
            String s = dis.readLine();
            int iDateTime = 0;
            int iOpen = 1;
            int iHigh = 2;
            int iLow = 3;
            int iClose = 4;
            int iVolume = 5;
            int iAdjClose = 6;
            int count =(int)(Object) NULL; //new int();
            count = 0;
            calendar.clear();
            while ((s = dis.readLine()) != null) {
                String[] items;
                items = s.split(",");
                if (items.length < 6) {
                    break;
                }
                Date date = null;
                try {
                    date =(Date)(Object) sdf.parse(items[iDateTime].trim());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                    continue;
                }
                calendar.clear();
                calendar.setTime(date);
                long time = calendar.getTimeInMillis();
                if (time <= afterThisTime) {
                    continue;
                }
                Quote quote = new Quote();
                quote.time =(MyHelperClass)(Object) time;
                quote.open =(MyHelperClass)(Object) Float.parseFloat(items[iOpen].trim());
                quote.high =(MyHelperClass)(Object) Float.parseFloat(items[iHigh].trim());
                quote.low =(MyHelperClass)(Object) Float.parseFloat(items[iLow].trim());
                quote.close =(MyHelperClass)(Object) Float.parseFloat(items[iClose].trim());
                quote.volume =(MyHelperClass)(Object)(float)(Object)(float)(Object)(float)(Object)(float)(Object)(float)(Object)(float)(Object)(float)(Object) Float.parseFloat(items[iVolume].trim()) / 100f;
                quote.amount =(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object) -1;
                quote.close_adj =(MyHelperClass)(Object) Float.parseFloat(items[iAdjClose].trim());
                if ((int)(Object)quote.high * (int)(Object)quote.low * (int)(Object)quote.close == 0) {
                    quote = null;
                    continue;
                }
                dataPool.add(quote);
//                MyHelperClass count = new MyHelperClass();
                if ((int)(Object)count == 0) {
                    long firstTime =(long)(Object) NULL; //new long();
                    firstTime = time;
                }
                long lastTime =(long)(Object) NULL; //new long();
                lastTime = time;
//                MyHelperClass lastTime = new MyHelperClass();
                setAscending((lastTime >= (long)(Object)firstTime) ? true : false);
//                MyHelperClass count = new MyHelperClass();
                count++;
            }
        } catch (Exception ex) {
            System.out.println("Error in Reading File: " + ex.getMessage());
        }
        MyHelperClass lastTime = new MyHelperClass();
        long newestTime = ((int)(Object)lastTime >= (int)(Object)firstTime) ? lastTime : firstTime;
        return newestTime;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int count;
public MyHelperClass get(MyHelperClass o0){ return null; }}

class QuoteDataSourceDescriptor {
public MyHelperClass toDate;
	public MyHelperClass dateFormat;
	public MyHelperClass fromDate;
	public MyHelperClass sourceSymbol;
}

class Quote {
public MyHelperClass volume;
	public MyHelperClass low;
	public MyHelperClass open;
	public MyHelperClass amount;
	public MyHelperClass close_adj;
	public MyHelperClass close;
	public MyHelperClass time;
	public MyHelperClass high;
}

class SimpleDateFormat {

SimpleDateFormat(MyHelperClass o0, Locale o1){}
	SimpleDateFormat(){}
	public MyHelperClass parse(String o0){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
