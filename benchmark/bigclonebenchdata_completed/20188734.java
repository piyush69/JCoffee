import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20188734 {
public MyHelperClass getRoot(){ return null; }
public MyHelperClass getPagelet(){ return null; }

    public String output(final ComponentParameter compParameter)  throws Throwable {
        InputStream inputStream;
        try {
            final URL url = new URL("http://xml.weather.yahoo.com/forecastrss?p=" + getPagelet().getOptionProperty("_weather_code") + "&u=c");
            inputStream = url.openStream();
        } catch (final IOException e) {
            return e.getMessage();
        }
        final StringBuilder sb = new StringBuilder();
        new AbstractXmlDocument(inputStream) {

//            @Override
            protected void init() throws Exception {
                final Element root =(Element)(Object) getRoot();
                final Namespace ns = root.getNamespaceForPrefix("yweather");
                final Element channel = root.element("channel");
                final String link = channel.elementText("link");
                final Element item = channel.element("item");
                MyHelperClass QName = new MyHelperClass();
                Element ele = item.element(QName.get("condition", ns));
                if (ele == null) {
                    sb.append("ERROR");
                    return;
                }
                final String imgPath = getPagelet().getColumnBean().getPortalBean().getCssResourceHomePath(compParameter) + "/images/yahoo/";
                String text, image;
                MyHelperClass YahooWeatherUtils = new MyHelperClass();
                Date date = new SimpleDateFormat(YahooWeatherUtils.RFC822_MASKS[1], Locale.US).parse(ele.attributeValue("date"));
                final int temp = Integer.parseInt(ele.attributeValue("temp"));
                int code = Integer.valueOf(ele.attributeValue("code")).intValue();
                if (code == 3200) {
//                    MyHelperClass YahooWeatherUtils = new MyHelperClass();
                    text = YahooWeatherUtils.yahooTexts[YahooWeatherUtils.yahooTexts.length - 1];
                    image = imgPath + "3200.gif";
                } else {
//                    MyHelperClass YahooWeatherUtils = new MyHelperClass();
                    text = YahooWeatherUtils.yahooTexts[code];
                    image = imgPath + code + ".gif";
                }
                sb.append("<div style=\"line-height: normal;\"><a target=\"_blank\" href=\"").append(link).append("\"><img src=\"");
                sb.append(image).append("\" /></a>");
//                MyHelperClass YahooWeatherUtils = new MyHelperClass();
                sb.append(YahooWeatherUtils.formatHour(date)).append(" - ");
                sb.append(text).append(" - ").append(temp).append("℃").append("<br>");
//                MyHelperClass QName = new MyHelperClass();
                final Iterator<?> it = item.elementIterator(QName.get("forecast", ns));
                while (it.hasNext()) {
                    ele = (Element) it.next();
                    date = new SimpleDateFormat("dd MMM yyyy", Locale.US).parse(ele.attributeValue("date"));
                    final int low = Integer.parseInt(ele.attributeValue("low"));
                    final int high = Integer.parseInt(ele.attributeValue("high"));
                    code = Integer.valueOf(ele.attributeValue("code")).intValue();
                    if (code == 3200) {
//                        MyHelperClass YahooWeatherUtils = new MyHelperClass();
                        text = YahooWeatherUtils.yahooTexts[YahooWeatherUtils.yahooTexts.length - 1];
                        image = imgPath + "3200.gif";
                    } else {
//                        MyHelperClass YahooWeatherUtils = new MyHelperClass();
                        text = YahooWeatherUtils.yahooTexts[code];
                        image = imgPath + code + ".gif";
                    }
//                    MyHelperClass YahooWeatherUtils = new MyHelperClass();
                    sb.append(YahooWeatherUtils.formatWeek(date)).append(" ( ");
                    sb.append(text).append(". ");
                    sb.append(low).append("℃~").append(high).append("℃");
                    sb.append(" )<br>");
                }
                sb.append("</div>");
            }
        };
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RFC822_MASKS;
	public MyHelperClass yahooTexts;
public MyHelperClass get(String o0, Namespace o1){ return null; }
	public MyHelperClass getColumnBean(){ return null; }
	public MyHelperClass formatHour(Date o0){ return null; }
	public MyHelperClass getPortalBean(){ return null; }
	public MyHelperClass getOptionProperty(String o0){ return null; }
	public MyHelperClass formatWeek(Date o0){ return null; }}

class ComponentParameter {

}

class AbstractXmlDocument {

AbstractXmlDocument(InputStream o0){}
	AbstractXmlDocument(){}}

class Element {

public MyHelperClass elementText(String o0){ return null; }
	public MyHelperClass attributeValue(String o0){ return null; }
	public MyHelperClass getNamespaceForPrefix(String o0){ return null; }
	public MyHelperClass element(String o0){ return null; }}

class Namespace {

}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(String o0, Locale o1){}}
