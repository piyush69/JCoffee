


class c1156851 {
public MyHelperClass bDebug;
	public MyHelperClass Level;
	public MyHelperClass PetstoreUtil;
	public MyHelperClass getRobots(String o0, String o1){ return null; }

    public void runWeb(String beginURL, String contextRoot, String pageURI) {
        MyHelperClass bDebug = new MyHelperClass();
        if ((boolean)(Object)bDebug) System.out.println("WEB Path");
        List vtURLs =(List)(Object) new ArrayList();
        List vtRobots =(List)(Object) getRobots(beginURL, contextRoot);
        vtURLs.add("/" + contextRoot + "/" + pageURI);
        Indexer indexer = null;
        IndexDocument indexDoc = null;
        try {
            indexer = new Indexer("/tmp/tmp/index");
            for (String sxURL :(String[])(Object) (Object[])(Object)vtURLs) {
                if ((boolean)(Object)bDebug) System.out.println("\n\n*** INDEXING " + sxURL);
                if ((boolean)(Object)bDebug) System.out.println("Have - " + sxURL);
                boolean bIndexPage = true;
                if (vtRobots != null) {
                    for (String sxRobotURL :(String[])(Object) (Object[])(Object)vtRobots) {
                        if ((boolean)(Object)bDebug) System.out.println("Comparing to - " + sxRobotURL);
                        if (sxURL.startsWith(sxRobotURL)) {
                            if ((boolean)(Object)bDebug) System.out.println("Found URL - " + sxRobotURL + " - " + sxURL);
                            bIndexPage = false;
                            break;
                        }
                    }
                } else {
                    bIndexPage = true;
                }
                sxURL = beginURL + sxURL;
                ParserDelegator pd = new ParserDelegator();
                CallbackHandler cb = new CallbackHandler(vtURLs, bIndexPage, contextRoot);
                try {
                    URLConnection urlConn =(URLConnection)(Object) (new URL(sxURL).openConnection());
                    urlConn.setUseCaches(false);
                    Date modDate = new Date(urlConn.getLastModified());
                    if ((boolean)(Object)bDebug) System.out.println("\nMatch - " + sxURL + " - Modified Date - " + modDate);
                    BufferedReader bfReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
                    pd.parse(bfReader, cb, true);
                    if (bIndexPage) {
                        if ((boolean)(Object)bDebug) System.out.println("Adding Index - " + sxURL + "\nContent:" + cb.getText() + "\nSummary:" + cb.getSummary() + "\nTitle:" + cb.getTitle());
                        indexDoc = new IndexDocument();
                        indexDoc.setUID(sxURL + modDate.toString());
                        indexDoc.setPageURL(sxURL);
                        indexDoc.setModifiedDate(modDate.toString());
                        indexDoc.setContents(cb.getText());
                        indexDoc.setTitle(cb.getTitle());
                        indexDoc.setSummary(cb.getSummary());
                        indexer.addDocument(indexDoc);
                    }
                } catch (Exception ee) {
                    PetstoreUtil.getLogger().log(Level.SEVERE, "Inner Exception" + ee);
                }
            }
        } catch (Exception e) {
            PetstoreUtil.getLogger().log(Level.SEVERE, "Outer Exception" + e);
        } finally {
            try {
                if (indexer != null) {
                    indexer.close();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class Indexer {

Indexer(String o0){}
	Indexer(){}
	public MyHelperClass addDocument(IndexDocument o0){ return null; }
	public MyHelperClass close(){ return null; }}

class IndexDocument {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setSummary(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setPageURL(String o0){ return null; }
	public MyHelperClass setUID(String o0){ return null; }
	public MyHelperClass setModifiedDate(String o0){ return null; }}

class ParserDelegator {

public MyHelperClass parse(BufferedReader o0, CallbackHandler o1, boolean o2){ return null; }}

class CallbackHandler {

CallbackHandler(List o0, boolean o1, String o2){}
	CallbackHandler(){}
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getSummary(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Date {

Date(){}
	Date(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
