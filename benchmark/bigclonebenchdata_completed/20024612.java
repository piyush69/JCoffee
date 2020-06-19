


class c20024612 {

    private void parse() throws Exception {
        BufferedReader br = null;
        InputStream httpStream = null;
        MyHelperClass url = new MyHelperClass();
        URL fileURL = new URL(url);
        URLConnection urlConnection =(URLConnection)(Object) fileURL.openConnection();
        httpStream =(InputStream)(Object) urlConnection.getInputStream();
        br = new BufferedReader(new InputStreamReader(httpStream, "UTF-8"));
        String ligne;
        String post;
        String date;
        String titre;
        String resume;
        String url2DL;
        while ((ligne =(String)(Object) br.readLine()) != null) {
            if (ligne.indexOf("div class=\"post\" id=\"post") != -1) {
                post = null;
                date = null;
                titre = null;
                try {
                    post = ligne.substring(ligne.indexOf("post-") + 5, ligne.indexOf("\"", ligne.indexOf("post-")));
                    ligne =(String)(Object) br.readLine();
                    date = ligne.substring(ligne.indexOf("<div class=\"date\"><span>") + 24);
                    date = date.replaceAll("</span>", "").replaceAll("</div>", "").trim();
                    MyHelperClass log = new MyHelperClass();
                    log.info("Post   : " + post + " du " + date);
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    titre = ligne.substring(ligne.indexOf(">", ligne.indexOf("title")) + 1, ligne.indexOf("</a>"));
                    titre = titre.replaceAll("&#8217;", "'").replaceAll("&#8220;", "\"").replaceAll("&#8221;", "\"");
                    url2DL = ligne.substring(ligne.indexOf("<a href=\"") + 9, ligne.indexOf("/\"")).trim();
                    url2DL = url2DL.replace("mega-films.net", "mega-protect.com") + ".php";
//                    MyHelperClass log = new MyHelperClass();
                    log.info("Titre  : " + titre);
//                    MyHelperClass log = new MyHelperClass();
                    log.info("To DL  : " + url2DL);
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    ligne =(String)(Object) br.readLine();
                    resume = ligne.substring(ligne.indexOf("<em>") + 4, ligne.indexOf("</em>"));
                    resume = resume.replaceAll("&#8217;", "'").replaceAll("&#8220;", "\"").replaceAll("&#8221;", "\"");
//                    MyHelperClass log = new MyHelperClass();
                    log.info("Resume : " + resume);
                } catch (Exception e) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("ERREUR : Le film n'a pas pu etre parse...");
                }
                MyHelperClass log = new MyHelperClass();
                log.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStream {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
