


class c21139380 {

//    @Test
    public void GetBingSearchResult() throws UnsupportedEncodingException {
        String query = "Scanner Java example";
        MyHelperClass URLEncoder = new MyHelperClass();
        String request = "http://api.bing.net/xml.aspx?AppId=731DD1E61BE6DE4601A3008DC7A0EB379149EC29" + "&Version=2.2&Market=en-US&Query=" + URLEncoder.encode(query, "UTF-8") + "&Sources=web+spell&Web.Count=50";
        try {
            URL url = new URL(request);
            System.out.println("Host : " + url.getHost());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            String finalContents = "";
            while ((inputLine =(String)(Object) reader.readLine()) != null) {
                finalContents += "\n" + inputLine;
            }
            MyHelperClass Jsoup = new MyHelperClass();
            Document doc =(Document)(Object) Jsoup.parse(finalContents);
            Elements eles =(Elements)(Object) doc.getElementsByTag("web:Url");
            for (Element ele :(Element[])(Object) (Object[])(Object)eles) {
                System.out.println(ele.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass parse(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Document {

public MyHelperClass getElementsByTag(String o0){ return null; }}

class Elements {

}

class Element {

public MyHelperClass text(){ return null; }}
