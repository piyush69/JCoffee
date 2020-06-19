


class c18347504 {
public MyHelperClass htmlPanel;
	public MyHelperClass furl;
	public MyHelperClass borderImages(String o0, String o1){ return null; }

                        public void run() {
                            try {
                                System.out.println("Setting page on Cobra");
                                MyHelperClass htmlPanel = new MyHelperClass();
                                SimpleHtmlRendererContext rendererContext = new SimpleHtmlRendererContext(htmlPanel, new SimpleUserAgentContext());
                                MyHelperClass furl = new MyHelperClass();
                                int nodeBaseEnd =(int)(Object) furl.indexOf("/", 10);
//                                MyHelperClass furl = new MyHelperClass();
                                if (nodeBaseEnd == -1) nodeBaseEnd =(int)(Object) furl.length();
//                                MyHelperClass furl = new MyHelperClass();
                                String nodeBase =(String)(Object) furl.substring(0, nodeBaseEnd);
//                                MyHelperClass furl = new MyHelperClass();
                                InputStream pageStream =(InputStream)(Object) (new URL(furl).openStream());
                                BufferedReader pageStreamReader = new BufferedReader(new InputStreamReader(pageStream));
                                String pageContent = "";
                                String line;
                                while ((line =(String)(Object) pageStreamReader.readLine()) != null) pageContent += line;
                                pageContent =(String)(Object) borderImages(pageContent, nodeBase);
                                htmlPanel.setHtml(pageContent, furl, rendererContext);
                            } catch (Exception e) {
                                System.out.println("Error loading page " + furl + " : " + e);
                            }
                        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setHtml(String o0, MyHelperClass o1, SimpleHtmlRendererContext o2){ return null; }
	public MyHelperClass indexOf(String o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }}

class SimpleHtmlRendererContext {

SimpleHtmlRendererContext(){}
	SimpleHtmlRendererContext(MyHelperClass o0, SimpleUserAgentContext o1){}}

class InputStream {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
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
