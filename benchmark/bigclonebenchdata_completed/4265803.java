


class c4265803 {

    private static ArrayList BingSearch(String query) {
        ArrayList bingSearchResults = new ArrayList();
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String request = "http://api.bing.net/xml.aspx?AppId=731DD1E61BE6DE4601A3008DC7A0EB379149EC29" + "&Version=2.2&Market=en-US&Query=" + URLEncoder.encode("Java example for " + query, "UTF-8") + "&Sources=web+spell&Web.Count=30";
            URL url = new URL(request);
            System.out.println("Host : " + url.getHost());
            url.openConnection();
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
                String urlText =(String)(Object) ele.text();
                if (!urlText.endsWith(".pdf") && !urlText.endsWith(".doc") && !urlText.endsWith(".ppt") && !urlText.endsWith(".PDF") && !urlText.endsWith(".DOC") && !urlText.endsWith(".PPT")) bingSearchResults.add(ele.text());
                System.out.println("BingResult: " + ele.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bingSearchResults;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class ArrayList {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Document {

public MyHelperClass getElementsByTag(String o0){ return null; }}

class Elements {

}

class Element {

public MyHelperClass text(){ return null; }}
