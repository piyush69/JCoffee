import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18196382 {
public static MyHelperClass verify(Report o0, EODQuote o1){ return null; }
	public static MyHelperClass constructURL(TradingDate o0){ return null; }
	public static MyHelperClass getProxySettings(){ return null; }
//public MyHelperClass getProxySettings(){ return null; }
//	public MyHelperClass constructURL(TradingDate o0){ return null; }
//	public MyHelperClass verify(Report o0, EODQuote o1){ return null; }

    public static List importDate(Report report, TradingDate date) throws Throwable, ImportExportException {
        List quotes = new ArrayList();
        String urlString =(String)(Object) constructURL(date);
        EODQuoteFilter filter =(EODQuoteFilter)(Object) new MetaStockQuoteFilter();
        ProxyPreferences proxyPreferences =(ProxyPreferences)(Object) getProxySettings();
        try {
            URL url = new URL(urlString);
            InputStreamReader input = new InputStreamReader(url.openStream());
            BufferedReader bufferedInput = new BufferedReader(input);
            String line = null;
            do {
                line = bufferedInput.readLine();
                if (line != null) {
                    try {
                        EODQuote quote =(EODQuote)(Object) filter.toEODQuote(line);
                        quotes.add(quote);
                        verify(report, quote);
                    } catch (UncheckedIOException e) {
                        report.addError(Locale.getString("DFLOAT_DISPLAY_URL") + ":" + date + ":" + Locale.getString("ERROR") + ": " + e.getMessage());
                    }
                }
            } while (line != null);
            bufferedInput.close();
        } catch (BindException e) {
            throw new ImportExportException((String)(Object)Locale.getString("UNABLE_TO_CONNECT_ERROR", e.getMessage()));
        } catch (ConnectException e) {
            throw new ImportExportException((String)(Object)Locale.getString("UNABLE_TO_CONNECT_ERROR", e.getMessage()));
        } catch (UnknownHostException e) {
            throw new ImportExportException((String)(Object)Locale.getString("UNKNOWN_HOST_ERROR", e.getMessage()));
        } catch (NoRouteToHostException e) {
            throw new ImportExportException((String)(Object)Locale.getString("DESTINATION_UNREACHABLE_ERROR", e.getMessage()));
        } catch (MalformedURLException e) {
            throw new ImportExportException((String)(Object)Locale.getString("INVALID_PROXY_ERROR", proxyPreferences.host, proxyPreferences.port));
        } catch (FileNotFoundException e) {
            report.addError(Locale.getString("FLOAT_DISPLAY_URL") + ":" + date + ":" + Locale.getString("ERROR") + ": " + Locale.getString("NO_QUOTES_FOUND"));
        } catch (IOException e) {
            throw new ImportExportException((String)(Object)Locale.getString("ERROR_DOWNLOADING_QUOTES"));
        }
        return quotes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Report {

public MyHelperClass addError(String o0){ return null; }}

class TradingDate {

}

class ImportExportException extends Exception{
	public ImportExportException(String errorMessage) { super(errorMessage); }
}

class EODQuoteFilter {

public MyHelperClass toEODQuote(String o0){ return null; }}

class MetaStockQuoteFilter {

}

class EODQuote {

}

class QuoteFormatException extends Exception{
	public QuoteFormatException(String errorMessage) { super(errorMessage); }
}

class Locale {

public static MyHelperClass getString(String o0){ return null; }
	public static MyHelperClass getString(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public static MyHelperClass getString(String o0, String o1){ return null; }}

class ProxyPreferences {
public MyHelperClass host;
	public MyHelperClass port;
}
