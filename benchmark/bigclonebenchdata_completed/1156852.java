


class c1156852 {
public MyHelperClass PetstoreUtil;

    private List getRobots(String beginURL, String contextRoot) {
        List vtRobots =(List)(Object) new ArrayList();
        BufferedReader bfReader = null;
        try {
            URL urlx = new URL(beginURL + "/" + contextRoot + "/" + "robots.txt");
            URLConnection urlConn =(URLConnection)(Object) urlx.openConnection();
            urlConn.setUseCaches(false);
            bfReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String sxLine = "";
            while ((sxLine =(String)(Object) bfReader.readLine()) != null) {
                if (sxLine.startsWith("Disallow:")) {
                    vtRobots.add(sxLine.substring(10));
                }
            }
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            PetstoreUtil.getLogger().log(Level.SEVERE, "Exception" + e);
            vtRobots = null;
        } finally {
            try {
                if (bfReader != null) {
                    bfReader.close();
                }
            } catch (Exception ee) {
            }
        }
        return vtRobots;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getLogger(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
