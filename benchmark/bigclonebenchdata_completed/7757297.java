


class c7757297 {
public MyHelperClass setDescription(MyHelperClass o0){ return null; }
	public MyHelperClass addCreator(MyHelperClass o0){ return null; }
public MyHelperClass writeName(PrintWriter o0){ return null; }
	public MyHelperClass writeCreators(PrintWriter o0){ return null; }
	public MyHelperClass doSubmit(URLConnection o0, MyHelperClass o1){ return null; }
	public MyHelperClass writeDate(PrintWriter o0){ return null; }
	public MyHelperClass writeCategories(PrintWriter o0){ return null; }
	public MyHelperClass writeDescription(PrintWriter o0){ return null; }
public MyHelperClass lastUser;
	public MyHelperClass URLEncoder;
	public MyHelperClass mUser;
	public MyHelperClass rdfpayload;
	public MyHelperClass JOptionPane;
	public MyHelperClass mDescription;
	public MyHelperClass getUserInfo(){ return null; }

    public boolean submit(String uri) throws java.io.IOException, Exception {
        if ((boolean)(Object)getUserInfo()) {
            String encodedrdf =(String)(Object) URLEncoder.encode(rdfpayload, "UTF-8");
            URL url = new URL(uri);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            setDescription(mDescription.getText());
            addCreator(mUser.getText());
            lastUser = mUser.getText();
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.println("rdfblob=" + encodedrdf);
            writeCreators(out);
            writeCategories(out);
            writeName(out);
            writeDescription(out);
            writeDate(out);
            out.println("&inputtype=1");
            out.println("&op=Submit");
            out.close();
            return(boolean)(Object) doSubmit(connection, rdfpayload);
        } else {
            JOptionPane.showMessageDialog(null, "Submit cannot be completed without user information, please try again.", "User Info Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class PrintWriter {

PrintWriter(MyHelperClass o0){}
	PrintWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}
