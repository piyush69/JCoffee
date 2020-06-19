


class c7427547 {

    public List tree(String cat, int branch) {
        MyHelperClass Pattern = new MyHelperClass();
        Pattern p =(Pattern)(Object) Pattern.compile("<a href=\"javascript:checkBranch\\(([0-9]+), 'true'\\)\">([^<]*)</a>");
        Matcher m;
        List res =(List)(Object) new ArrayList();
        URL url;
        HttpURLConnection conn;
        System.out.println();
        try {
            url = new URL("http://cri-srv-ade.insa-toulouse.fr:8080/ade/standard/gui/tree.jsp?category=trainee&expand=false&forceLoad=false&reload=false&scroll=0");
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            MyHelperClass sessionId = new MyHelperClass();
            conn.setRequestProperty("Cookie", sessionId);
            BufferedReader i = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) i.readLine()) != null) {
                m =(Matcher)(Object) p.matcher(line);
                if ((boolean)(Object)m.find()) {
                    MyHelperClass trainee = new MyHelperClass();
                    trainee.add(new Node(Integer.parseInt((String)(Object)m.group(1)), m.group(2)));
                    System.out.println(m.group(1) + " - " + m.group(2));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass add(Node o0){ return null; }}

class List {

}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Node {

Node(int o0, MyHelperClass o1){}
	Node(){}}
