
import java.io.UncheckedIOException;


class c2767689 {
public MyHelperClass logger;
	public MyHelperClass getSymbol(){ return null; }

//    @Override
    public void loadData() {
        try {
            MyHelperClass symbol = new MyHelperClass();
            String url = "http://ichart.finance.yahoo.com/table.csv?s=" + symbol + "&a=00&b=2&c=1962&d=11&e=11&f=2099&g=d&ignore=.csv";
            URLConnection conn =(URLConnection)(Object) (new URL(url)).openConnection();
            conn.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            in.readLine();
            String str = "";
            while ((str =(String)(Object) in.readLine()) != null) {
                final String[] split = str.split(",");
                final String date = split[0];
                final double open = Double.parseDouble(split[1]);
                final double high = Double.parseDouble(split[2]);
                final double low = Double.parseDouble(split[3]);
                final double close = Double.parseDouble(split[4]);
                final int volume = Integer.parseInt(split[5]);
                final double adjClose = Double.parseDouble(split[6]);
                final HistoricalPrice price = new HistoricalPrice(date, open, high, low, close, volume, adjClose);
                MyHelperClass historicalPrices = new MyHelperClass();
                historicalPrices.add(price);
            }
            in.close();
//            MyHelperClass symbol = new MyHelperClass();
            url = "http://ichart.finance.yahoo.com/table.csv?s=" + symbol + "&a=00&b=2&c=1962&d=11&e=17&f=2008&g=v&ignore=.csv";
            conn =(URLConnection)(Object) (new URL(url)).openConnection();
            conn.connect();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            in.readLine();
            str = "";
            while ((str =(String)(Object) in.readLine()) != null) {
                final String[] split = str.split(",");
                final String date = split[0];
                final double amount = Double.parseDouble(split[1]);
                final Dividend dividend = new Dividend(date, amount);
                MyHelperClass dividends = new MyHelperClass();
                dividends.add(dividend);
            }
            in.close();
        } catch (final UncheckedIOException ioe) {
            logger.error("Error parsing historical prices for " + getSymbol(),(IOException)(Object) ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass add(HistoricalPrice o0){ return null; }
	public MyHelperClass add(Dividend o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class HistoricalPrice {

HistoricalPrice(String o0, double o1, double o2, double o3, double o4, int o5, double o6){}
	HistoricalPrice(){}}

class Dividend {

Dividend(String o0, double o1){}
	Dividend(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
