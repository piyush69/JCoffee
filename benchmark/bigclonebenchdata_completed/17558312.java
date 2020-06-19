


class c17558312 {
public MyHelperClass panel;
	public MyHelperClass getVerusSubscriptionIdHTML(){ return null; }
	public MyHelperClass getLoginId(){ return null; }
	public MyHelperClass getLoginName(){ return null; }
	public MyHelperClass getFrequentlyUsedScreensHTMLCode(){ return null; }
	public MyHelperClass getOpenCatalogHTMLCode(){ return null; }
	public MyHelperClass getNewsHTML(){ return null; }
	public MyHelperClass getLibName(){ return null; }
	public MyHelperClass getOnlineInformationHTML(){ return null; }
	public MyHelperClass getPendingJobsHTMLCode(){ return null; }

    public void fillData() {
        try {
            URL urlhome =(URL)(Object) OpenerIF.class.getResource("Home.html");
            URLConnection uc =(URLConnection)(Object) urlhome.openConnection();
            InputStreamReader input = new InputStreamReader(uc.getInputStream());
            BufferedReader in = new BufferedReader(input);
            String inputLine;
            String htmlData = "";
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                htmlData += inputLine;
            }
            in.close();
            String[] str = new String[9];
            str[0] =(String)(Object) getLibName();
            str[1] =(String)(Object) getLoginId();
            str[2] =(String)(Object) getLoginName();
            str[3] =(String)(Object) getVerusSubscriptionIdHTML();
            str[4] =(String)(Object) getPendingJobsHTMLCode();
            str[5] =(String)(Object) getFrequentlyUsedScreensHTMLCode();
            str[6] =(String)(Object) getOpenCatalogHTMLCode();
            str[7] =(String)(Object) getNewsHTML();
            str[8] =(String)(Object) getOnlineInformationHTML();
            MessageFormat mf = new MessageFormat(htmlData);
            String htmlContent =(String)(Object) mf.format(htmlData, str);
            PrintWriter fw = new PrintWriter(System.getProperty("user.home") + "/homeNGL.html");
            fw.println(htmlContent);
            fw.flush();
            fw.close();
            new LocalHtmlRendererContext(panel, new SimpleUserAgentContext(), this).navigate("file:" + System.getProperty("user.home") + "/homeNGL.html");
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class OpenerIF {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class MessageFormat {

MessageFormat(String o0){}
	MessageFormat(){}
	public MyHelperClass format(String o0, String[] o1){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(String o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class LocalHtmlRendererContext {

LocalHtmlRendererContext(){}
	LocalHtmlRendererContext(MyHelperClass o0, SimpleUserAgentContext o1, c17558312 o2){}
	public MyHelperClass navigate(String o0){ return null; }}

class SimpleUserAgentContext {

}
