


class c17558353 {

//    @Override
    public void run() {
        try {
            URL urlhome = new URL("http://www.verussolutions.biz/NGLDashBoard.xml");
            URLConnection uc =(URLConnection)(Object) urlhome.openConnection();
            InputStreamReader input = new InputStreamReader(uc.getInputStream());
            BufferedReader in = new BufferedReader(input);
            String inputLine;
            String xmlData = "";
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                xmlData += inputLine;
            }
            in.close();
            PrintWriter fw = new PrintWriter(new FileWriter(System.getProperty("user.home") + "/NGLDashBoard.xml"));
            fw.println(xmlData);
            fw.flush();
            fw.close();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        try {
            Document doc =(Document)(Object) (new SAXBuilder().build(new File(System.getProperty("user.home") + "/NGLDashBoard.xml")));
            String onlinsuppcdat =(String)(Object) doc.getRootElement().getChild("OnlineSupportInformation").getText();
            CDATA cdata = new CDATA(onlinsuppcdat);
            MyHelperClass host = new MyHelperClass();
            host.setOnlineInformationHTML(cdata.getText());
            onlinsuppcdat =(String)(Object) doc.getRootElement().getChild("News").getText();
            cdata = new CDATA(onlinsuppcdat);
//            MyHelperClass host = new MyHelperClass();
            host.setNewsHTML(cdata.getText());
//            MyHelperClass host = new MyHelperClass();
            host.fillData();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fillData(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass setOnlineInformationHTML(MyHelperClass o0){ return null; }
	public MyHelperClass getChild(String o0){ return null; }
	public MyHelperClass setNewsHTML(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class PrintWriter {

PrintWriter(FileWriter o0){}
	PrintWriter(){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class File {

File(String o0){}
	File(){}}

class SAXBuilder {

public MyHelperClass build(File o0){ return null; }}

class CDATA {

CDATA(String o0){}
	CDATA(){}
	public MyHelperClass getText(){ return null; }}
