import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18339787 {

    private void reload()  throws Throwable {
        MyHelperClass xml = new MyHelperClass();
        if (xml != null) {
            try {
                String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                MyHelperClass exchangeRateDate = new MyHelperClass();
                if (currentDate.equalsIgnoreCase(exchangeRateDate)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        XPath xpath = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            URLConnection conn = null;
            URL url = new URL("http://www.ecb.int/stats/eurofxref/eurofxref-daily.xml");
            conn = url.openConnection();
            MyHelperClass xml = new MyHelperClass();
            xml = docBuilder.parse(conn.getInputStream());
            MyHelperClass XPathFactory = new MyHelperClass();
            xpath = XPathFactory.newInstance().newXPath();
            MyHelperClass exchangeRateDate = new MyHelperClass();
            exchangeRateDate = xpath.evaluate("/Envelope/Cube/Cube/@time", xml);
            MyHelperClass XPathFactory = new MyHelperClass();
            xpath = XPathFactory.newInstance().newXPath();
            MyHelperClass xml = new MyHelperClass();
            NodeList currenciesNode = (NodeList) xpath.evaluate("/Envelope/Cube/Cube/Cube[@currency]", xml, XPathConstants.NODESET);
            MyHelperClass currencies = new MyHelperClass();
            currencies = new String[currenciesNode.getLength()];
            MyHelperClass currencies = new MyHelperClass();
            for (int i = 0; i < currencies.length; i++) {
                MyHelperClass currencies = new MyHelperClass();
                currencies[i] = currenciesNode.item(i).getAttributes().getNamedItem("currency").getTextContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SimpleDateFormat {

}

class XPath {

}

class DocumentBuilderFactory {

}

class DocumentBuilder {

}

class NodeList {

}
