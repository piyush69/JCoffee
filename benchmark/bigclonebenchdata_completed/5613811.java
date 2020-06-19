import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5613811 {
public MyHelperClass id;
	public MyHelperClass NULL;
public MyHelperClass layout;
	public MyHelperClass startActivity(Intent o0){ return null; }
public MyHelperClass list;
	public MyHelperClass TAG;
	public MyHelperClass Log;
	public MyHelperClass adapter;
	public MyHelperClass getIntent(){ return null; }

//    @Override
    public void onCreate(Bundle savedInstanceState)  throws Throwable {
        this.onCreate(savedInstanceState);
        setContentView(layout.main);
        ListView list = NULL; //new ListView();
        list = (ListView) findViewById(id.list);
        MyHelperClass db = new MyHelperClass();
        db = new DBAdapter(this);
        ArrayList<Data> news = NULL; //new ArrayList<Data>();
        news = new ArrayList<Data>();
        MyHelperClass adapter = new MyHelperClass();
        adapter = new NewsAdapter(news);
//        MyHelperClass adapter = new MyHelperClass();
        list.setAdapter(adapter);
        MyHelperClass SAXParserFactory = new MyHelperClass();
        SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
        SAXParser parser = null;
        DefaultHandler handler = null;
        try {
            parser =(SAXParser)(Object) factory.newSAXParser();
            handler = new DefaultHandler() {

                Data newsItem;

//                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    Log.d(TAG, qName);
                    if (qName.equals("item")) newsItem = new Data();
                    boolean title = NULL; //new boolean();
                    if (qName.equals("title")) title = true;
                    boolean link = NULL; //new boolean();
                    if (qName.equals("link")) link = true;
                    boolean description = NULL; //new boolean();
                    if (qName.equals("description")) description = true;
                }

//                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (qName.equals("item")) news.add(newsItem);
                    boolean title = NULL; //new boolean();
                    if (qName.equals("title")) title = false;
                    boolean link = NULL; //new boolean();
                    if (qName.equals("link")) link = false;
                    boolean description = NULL; //new boolean();
                    if (qName.equals("description")) description = false;
                }

//                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (newsItem == null) {
                        return;
                    }
                    MyHelperClass title = new MyHelperClass();
                    if ((boolean)(Object)title) {
                        newsItem.setTitle(new String(ch, start, length));
                    }
                    MyHelperClass link = new MyHelperClass();
                    if ((boolean)(Object)link) {
                        newsItem.setLink(new String(ch, start, length));
                    }
                    MyHelperClass description = new MyHelperClass();
                    if ((boolean)(Object)description) {
                        newsItem.setDesc(new String(ch, start, length));
                    }
                }
            };
        } catch (ParserConfigurationException e1) {
            e1.printStackTrace();
        } catch (SAXException e1) {
            e1.printStackTrace();
        }
        Intent siteIntent =(Intent)(Object) getIntent();
        String siteurl =(String)(Object) siteIntent.getStringExtra("siteurl");
        URLConnection connection = null;
        URL url;
        try {
            url = new URL(siteurl);
            Log.i(TAG, "1");
            connection = url.openConnection();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.i(TAG, "2");
        try {
            parser.parse(connection.getInputStream(), handler);
            Log.i(TAG, "3");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        adapter.notifyDataSetChanged();
        list.setOnItemClickListener(new OnItemClickListener() {

//            @Override
            public void onItemClick(AdapterView adapt, View view, int position, long id) {
                String link;
                link = news.get(position).getLink();
                Intent intent = new Intent(NewsReaderActivity.this, WebViewActivity.class);
                intent.putExtra("link", link);
                startActivity(intent);
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass main;
public MyHelperClass notifyDataSetChanged(){ return null; }
	public MyHelperClass setAdapter(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass setOnItemClickListener(){ return null; }
	public MyHelperClass setOnItemClickListener(<anonymous OnItemClickListener> o0){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }}

class Bundle {

}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, DefaultHandler o1){ return null; }}

class DefaultHandler {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class Intent {

public MyHelperClass putExtra(String o0, String o1){ return null; }
	public MyHelperClass getStringExtra(String o0){ return null; }}

class OnItemClickListener {

}

class ListView {

}

class DBAdapter {

DBAdapter(c5613811 o0){}
	DBAdapter(){}}

class Data {

public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass getLink(){ return null; }
	public MyHelperClass setDesc(String o0){ return null; }
	public MyHelperClass setLink(String o0){ return null; }}

class NewsAdapter {

NewsAdapter(ArrayList<Data> o0){}
	NewsAdapter(){}}

class Attributes {

}

class AdapterView {

}

class View {

}

class NewsReaderActivity {

}

class WebViewActivity {

}
