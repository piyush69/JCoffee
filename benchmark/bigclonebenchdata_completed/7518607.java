


class c7518607 {

    private ArrayList getFiles(String date) {
        ArrayList files = new ArrayList();
        String info = "";
        try {
            MyHelperClass obtainServerFilesView = new MyHelperClass();
            obtainServerFilesView.setLblProcessText(java.util.ResourceBundle.getBundle("bgpanalyzer/resources/Bundle").getString("ObtainServerFilesView.Label.Progress.Obtaining_Data"));
            MyHelperClass URL_ROUTE_VIEWS = new MyHelperClass();
            URL url = new URL(URL_ROUTE_VIEWS + date + "/");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(false);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                if (!line.equals("")) info += line + "%";
            }
//            MyHelperClass obtainServerFilesView = new MyHelperClass();
            obtainServerFilesView.setLblProcessText(java.util.ResourceBundle.getBundle("bgpanalyzer/resources/Bundle").getString("ObtainServerFilesView.Label.Progress.Processing_Data"));
            MyHelperClass Patterns = new MyHelperClass();
            info =(String)(Object) Patterns.removeTags(info);
            StringTokenizer st = new StringTokenizer(info, "%");
            info = "";
            boolean alternador = false;
            int index = 1;
            while ((boolean)(Object)st.hasMoreTokens()) {
                String token =(String)(Object) st.nextToken();
                if (!token.trim().equals("")) {
                    int pos = token.indexOf(".bz2");
                    if (pos != -1) {
                        token = token.substring(1, pos + 4);
                        files.add(token);
                    }
                }
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return files;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setLblProcessText(String o0){ return null; }
	public MyHelperClass removeTags(String o0){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}
