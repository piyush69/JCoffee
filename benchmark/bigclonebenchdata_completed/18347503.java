


class c18347503 {
public MyHelperClass borderImages(String o0, String o1){ return null; }

    public void setPage(String url) {
        System.out.println("SetPage(" + url + ")");
        if (url != null) {
            if (!url.startsWith("http://")) {
                url = "http://" + url;
            }
            boolean exists = false;
            MyHelperClass urlComboBox = new MyHelperClass();
            for (int i = 0; i < (int)(Object)urlComboBox.getItemCount(); i++) {
//                MyHelperClass urlComboBox = new MyHelperClass();
                if (((String)(String)(Object) urlComboBox.getItemAt(i)).equals(url)) {
                    exists = true;
//                    MyHelperClass urlComboBox = new MyHelperClass();
                    urlComboBox.setSelectedItem(url);
                }
            }
            if (!exists) {
//                MyHelperClass urlComboBox = new MyHelperClass();
                int i =(int)(Object) urlComboBox.getSelectedIndex();
//                MyHelperClass urlComboBox = new MyHelperClass();
                if (i == -1 ||(int)(Object) urlComboBox.getItemCount() == 0) {
                    i = 0;
                } else {
                    i++;
                }
//                MyHelperClass urlComboBox = new MyHelperClass();
                urlComboBox.insertItemAt(url, i);
//                MyHelperClass urlComboBox = new MyHelperClass();
                urlComboBox.setSelectedItem(url);
            }
            boolean image = false;
            MyHelperClass imageExtensions = new MyHelperClass();
            for (final String element :(String[])(Object) (Object[])(Object)imageExtensions) {
                if (url.endsWith(element)) {
                    image = true;
                }
            }
            try {
                if (image) {
                    final String html = "<html><img src=\"" + url + "\"></html>";
                } else {
                    final String furl = url;
                    Runnable loadPage = new Runnable() {

                        public void run() {
                            try {
                                System.out.println("Setting page on Cobra");
                                MyHelperClass htmlPanel = new MyHelperClass();
                                SimpleHtmlRendererContext rendererContext = new SimpleHtmlRendererContext(htmlPanel, new SimpleUserAgentContext());
                                int nodeBaseEnd = furl.indexOf("/", 10);
                                if (nodeBaseEnd == -1) nodeBaseEnd = furl.length();
                                String nodeBase = furl.substring(0, nodeBaseEnd);
                                InputStream pageStream =(InputStream)(Object) (new URL(furl).openStream());
                                BufferedReader pageStreamReader = new BufferedReader(new InputStreamReader(pageStream));
                                String pageContent = "";
                                String line;
                                while ((line =(String)(Object) pageStreamReader.readLine()) != null) pageContent += line;
                                pageContent =(String)(Object) borderImages(pageContent, nodeBase);
//                                MyHelperClass htmlPanel = new MyHelperClass();
                                htmlPanel.setHtml(pageContent, furl, rendererContext);
                            } catch (Exception e) {
                                System.out.println("Error loading page " + furl + " : " + e);
                            }
                        }
                    };
                    new Thread(loadPage).start();
                }
            } catch (final Throwable exception) {
                System.out.println("Error in Browser.setPage(): " + exception);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSelectedItem(String o0){ return null; }
	public MyHelperClass insertItemAt(String o0, int o1){ return null; }
	public MyHelperClass getItemAt(int o0){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass getItemCount(){ return null; }
	public MyHelperClass setHtml(String o0, String o1, SimpleHtmlRendererContext o2){ return null; }}

class SimpleHtmlRendererContext {

SimpleHtmlRendererContext(){}
	SimpleHtmlRendererContext(MyHelperClass o0, SimpleUserAgentContext o1){}}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class SimpleUserAgentContext {

}
