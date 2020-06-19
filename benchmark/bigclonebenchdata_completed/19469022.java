
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19469022 {

    public List addLine(String username, String URL, int page) {
        List rss =(List)(Object) new ArrayList();
        try {
            URL url = new URL(URL + page);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            System.out.println(reader.readLine());
            while ((line =(String)(Object) reader.readLine()) != null) {
                String string = "<text>";
                String string1 = "</text>";
                if (line.contains(string) && !line.contains("@") && !line.contains("http")) {
                    String tweet = line.replace(string, "").replace(string1, "").replace("'", "").trim();
                    final Tweets tweets = new Tweets(username, tweet, page, false);
                    int save =(int)(Object) tweets.save();
                    tweets.setId((long) save);
                    Thread thread = new Thread(new Runnable() {

//                        @Override
                        public void run() {
                            MyHelperClass Main = new MyHelperClass();
                            Main.addRow(tweets);
                        }
                    });
                    thread.start();
                    System.out.println(tweet);
                }
            }
            reader.close();
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.put(e.toString());
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.put(e.toString());
            System.out.println(e.toString());
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.put(e.toString());
            System.out.println(e.toString());
        }
        return rss;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0){ return null; }
	public MyHelperClass addRow(Tweets o0){ return null; }}

class List {

}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Tweets {

Tweets(){}
	Tweets(String o0, String o1, int o2, boolean o3){}
	public MyHelperClass setId(long o0){ return null; }
	public MyHelperClass save(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
