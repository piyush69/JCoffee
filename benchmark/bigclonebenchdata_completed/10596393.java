


class c10596393 {
public static MyHelperClass Replace(String o0, String o1){ return null; }
//public MyHelperClass Replace(String o0, String o1){ return null; }

    public static String BaiKe(String unknown) {
        String encodeurl = "";
        long sTime = System.currentTimeMillis();
        long eTime;
        try {
            String regEx = "\\#(.+)\\#";
            String searchText = "";
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile(regEx);
            Matcher m =(Matcher)(Object) p.matcher(unknown);
            if ((boolean)(Object)m.find()) {
                searchText =(String)(Object) m.group(1);
            }
            System.out.println("searchText :  " + searchText);
            MyHelperClass URLEncoder = new MyHelperClass();
            encodeurl =(String)(Object) URLEncoder.encode(searchText, "UTF-8");
            String url = "http://www.hudong.com/wiki/" + encodeurl;
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
            conn.setConnectTimeout(10000);
            Parser parser = new Parser(conn);
            parser.setEncoding(parser.getEncoding());
            NodeFilter filtera =(NodeFilter)(Object) new TagNameFilter("DIV");
            NodeList nodes =(NodeList)(Object) parser.extractAllNodesThatMatch(filtera);
            String textInPage = "";
            if (nodes != null) {
                for (int i = 0; i < (int)(Object)nodes.size(); i++) {
                    Node textnode = (Node)(Node)(Object) nodes.elementAt(i);
                    if ("div class=\"summary\"".equals(textnode.getText())) {
                        String temp =(String)(Object) textnode.toPlainTextString();
                        textInPage += temp + "\n";
                    }
                }
            }
            String s =(String)(Object) Replace(textInPage, searchText);
            eTime = System.currentTimeMillis();
            String time = "搜索[" + searchText + "]用时:" + (eTime - sTime) / 1000.0 + "s";
            System.out.println(s);
            return time + "\r\n" + s;
        } catch (Exception e) {
            e.printStackTrace();
            return "大姨妈来了";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class HttpURLConnection {

public MyHelperClass setConnectTimeout(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Parser {

Parser(){}
	Parser(HttpURLConnection o0){}
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass setEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass extractAllNodesThatMatch(NodeFilter o0){ return null; }}

class NodeFilter {

}

class TagNameFilter {

TagNameFilter(String o0){}
	TagNameFilter(){}}

class NodeList {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class Node {

public MyHelperClass toPlainTextString(){ return null; }
	public MyHelperClass getText(){ return null; }}
