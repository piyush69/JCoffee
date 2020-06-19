


class c10107377 {
public static MyHelperClass decodeHTML(MyHelperClass o0){ return null; }
public static MyHelperClass URLEncoder;
//	public MyHelperClass decodeHTML(MyHelperClass o0){ return null; }
//public MyHelperClass URLEncoder;

//    @Deprecated
    public static Collection searchKey(String iText, String iKeyServer) throws Exception {
        List outVec =(List)(Object) new ArrayList();
        MyHelperClass UTF8 = new MyHelperClass();
        String uri = iKeyServer + "/pks/lookup?search=" + URLEncoder.encode(iText, UTF8);
        URL url = new URL(uri);
        BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
        MyHelperClass Pattern = new MyHelperClass();
        Pattern regex =(Pattern)(Object) Pattern.compile("pub.*?<a\\s+href\\s*=\"(.*?)\".*?>\\s*(\\w+)\\s*</a>.*?(\\d+-\\d+-\\d+).*?<a\\s+href\\s*=\".*?\".*?>\\s*(.+?)\\s*</a>", Pattern.CANON_EQ);
        String line;
        while ((line =(String)(Object) input.readLine()) != null) {
            Matcher regexMatcher =(Matcher)(Object) regex.matcher(line);
            while ((boolean)(Object)regexMatcher.find()) {
                String id =(String)(Object) regexMatcher.group(2);
                String downUrl = iKeyServer + regexMatcher.group(1);
                String downDate =(String)(Object) regexMatcher.group(3);
                String name =(String)(Object) decodeHTML(regexMatcher.group(4));
                outVec.add(new SearchKeyResult(id, name, downDate, downUrl));
            }
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(input);
        return (Collection)(Object)outVec;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CANON_EQ;
public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeQuietly(BufferedReader o0){ return null; }
	public MyHelperClass compile(String o0, MyHelperClass o1){ return null; }}

class Collection {

}

class SearchKeyResult {

SearchKeyResult(String o0, String o1, String o2, String o3){}
	SearchKeyResult(){}}

class List {

public MyHelperClass add(SearchKeyResult o0){ return null; }}

class ArrayList {

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

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
