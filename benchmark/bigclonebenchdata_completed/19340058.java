import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19340058 {
public MyHelperClass httpClient;
public MyHelperClass NbBundle;
	public MyHelperClass register;
	public MyHelperClass EntityUtils;
	public MyHelperClass getStockFromCache(String o0){ return null; }
	public MyHelperClass cacheStock(String o0, String o1){ return null; }
	public MyHelperClass isStockCached(String o0){ return null; }

    public String fetchStockCompanyName(Stock stock)  throws Throwable {
        String companyName = "";
        MyHelperClass StockUtil = new MyHelperClass();
        String symbol = StockUtil.getStock(stock);
        if ((boolean)(Object)isStockCached(symbol)) {
            return(String)(Object) getStockFromCache(symbol);
        }
        String url = NbBundle.getMessage(MrSwingDataFeed.class, "MrSwingDataFeed.stockInfo.url", new String[] { symbol, register.get("username", ""), register.get("password", "") });
        HttpContext context =(HttpContext)(Object) new BasicHttpContext();
        HttpGet method = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(method, context);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                companyName = EntityUtils.toString(entity).split("\n")[1];
                cacheStock(symbol, companyName);
                EntityUtils.consume(entity);
            }
        } catch (Exception ex) {
            companyName = "";
        } finally {
            method.abort();
        }
        return companyName;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0, String o1){ return null; }
	public MyHelperClass getMessage(Class<MrSwingDataFeed o0, String o1, String[] o2){ return null; }
	public MyHelperClass getStock(Stock o0){ return null; }
	public MyHelperClass consume(HttpEntity o0){ return null; }}

class Stock {

}

class MrSwingDataFeed {

}

class HttpContext {

}

class BasicHttpContext {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
