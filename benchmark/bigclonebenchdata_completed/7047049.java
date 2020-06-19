


class c7047049 {
public MyHelperClass jCheckBox3;
	public MyHelperClass jCheckBox2;
public MyHelperClass println(String o0){ return null; }

    public URL grabCover(String artist, String title) {
        if ((boolean)(Object)jCheckBox3.isSelected()) {
            println("Searching cover for: " + artist);
            artist = artist.trim();
            URL url = null;
            int searchnumber = 0;
            try {
                URL yahoo = new URL("http://www.gracenote.com/search/?query=" + artist.toLowerCase().replaceAll(" ", "+") + "&search_type=artist");
                BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
                println("" + yahoo);
                String inputLine;
                String line = "";
                while ((inputLine =(String)(Object) in.readLine()) != null) line += inputLine;
                boolean notfound = true;
                String cut = line;
                while (notfound) {
                    String search = "<div class=\"album-name large\"><strong>Album:</strong> <a href=\"";
                    if (line.indexOf(search) <= 0) {
                        println("Artist was not found!");
                        in.close();
                        return null;
                    }
                    cut = cut.substring(cut.indexOf(search) + search.length());
                    String test = cut.substring(0, cut.indexOf("\""));
                    URL secondurl = new URL("http://www.gracenote.com" + test);
                    println("" + secondurl);
                    BufferedReader secin = new BufferedReader(new InputStreamReader(secondurl.openStream()));
                    String secinputLine;
                    String secline = "";
                    while ((secinputLine =(String)(Object) secin.readLine()) != null) secline += secinputLine;
                    if (!(secline.toUpperCase().indexOf(title.toUpperCase()) < 0 && (boolean)(Object)jCheckBox2.isSelected())) {
                        String secsearch = "<div class=\"album-image\"><img src=\"";
                        String seccut = secline.substring(secline.indexOf(secsearch) + secsearch.length());
                        seccut = seccut.substring(0, seccut.indexOf("\""));
                        url = new URL("http://www.gracenote.com" + seccut);
                        if (url.toString().indexOf("covers/default") <= 0 && url.toString().indexOf("covers/") > 0) {
                            notfound = false;
                        }
                    }
                    secin.close();
                }
                in.close();
                println(url.toString());
            } catch (Exception e) {
                println("error " + e + "\n");
                e.printStackTrace();
            }
            return url;
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isSelected(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
