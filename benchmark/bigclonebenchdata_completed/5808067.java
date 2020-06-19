import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5808067 {
public MyHelperClass getText(Object o0){ return null; }

//    @Override
    public void action(String msg, String uri, Gateway gateway) throws Throwable, Exception {
        String city = "成都";
        if (msg.indexOf("#") != -1) {
            city = msg.substring(msg.indexOf("#") + 1);
        }
        String url = "http://webservice.webxml.com.cn/WebServices/WeatherWS.asmx/getWeather?theCityCode={city}&theUserID=";
        url = url.replace("{city}", URLEncoder.encode(city, "UTF8"));
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        if (conn.getResponseCode() == 200) {
            SAXBuilder builder = new SAXBuilder();
            Document doc =(Document)(Object) builder.build(conn.getInputStream());
            List strings =(List)(Object) doc.getRootElement().getChildren();
            String[] sugguestions =(String[])(Object) getText(strings.get(6)).split("\n");
            StringBuffer buffer = new StringBuffer();
            buffer.append("欢迎使用MapleSMS的天气服务！\n");
            buffer.append("你查询的是 " + getText(strings.get(1)) + "的天气。\n");
            buffer.append(getText(strings.get(4)) + "。\n");
            buffer.append(getText(strings.get(5)) + "。\n");
            buffer.append(sugguestions[0] + "\n");
            buffer.append(sugguestions[1] + "\n");
            buffer.append(sugguestions[7] + "\n");
            buffer.append("感谢你使用MapleSMS的天气服务！祝你愉快！");
            gateway.sendSMS(uri, buffer.toString());
        } else {
            gateway.sendSMS(uri, "对不起，你输入的城市格式有误，请检查后再试~");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getChildren(){ return null; }
	public MyHelperClass split(String o0){ return null; }}

class Gateway {

public MyHelperClass sendSMS(String o0, String o1){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}
