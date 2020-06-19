


class c13039812 {

    public String getImageURL(String text) {
        String imgURL = "";
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            URL url = new URL("http://images.search.yahoo.com/search/images?p=" + URLEncoder.encode(text));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            DataInputStream in = new DataInputStream(connection.getInputStream());
            String line;
            MyHelperClass Pattern = new MyHelperClass();
            Pattern imgPattern =(Pattern)(Object) Pattern.compile("isrc=\"([^\"]*)\"");
            while ((line =(String)(Object) in.readLine()) != null) {
                Matcher match =(Matcher)(Object) imgPattern.matcher(line);
                if ((boolean)(Object)match.find()) {
                    imgURL =(String)(Object) match.group(1);
                    break;
                }
            }
            in.close();
        } catch (Exception e) {
        }
        return imgURL;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass encode(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
