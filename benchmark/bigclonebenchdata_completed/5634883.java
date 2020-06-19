


class c5634883 {
public MyHelperClass KeyboardHero;
	public MyHelperClass Util;
	public MyHelperClass USER_AGENT;
	public MyHelperClass getProxy(){ return null; }
	public MyHelperClass hexdecode(String o0){ return null; }

            public void run() {
                try {
                    MyHelperClass URL_STR = new MyHelperClass();
                    URL url = new URL(URL_STR + "?req=list");
                    URLConnection connection =(URLConnection)(Object) url.openConnection(getProxy());
                    connection.setRequestProperty("User-Agent", USER_AGENT);
                    BufferedReader bufferedRdr = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line = null;
                    int foundCount = 0;
                    ArrayList names = new ArrayList();
                    ArrayList songs = new ArrayList();
                    ArrayList scores = new ArrayList();
                    ArrayList factors = new ArrayList();
                    String[] subparts;
                    String[] ssubparts;
                    int tlscore;
                    float tlfactor;
                    while ((line =(String)(Object) bufferedRdr.readLine()) != null) {
                        if (line.length() > 2) {
                            try {
                                subparts = line.split(" ", 3);
                                if (subparts.length != 3) {
                                    Util.debug(28, "Not enough subentry in online toplist file: ." + KeyboardHero.APP_NAME + ".tls!");
                                    continue;
                                }
                                tlscore = Integer.parseInt(subparts[1]);
                                tlfactor = Float.parseFloat(subparts[0]);
                                scores.add(tlscore);
                                factors.add(tlfactor);
                                ssubparts =(String[])(Object) hexdecode(subparts[2]).split("¦", 2);
                                if (ssubparts.length != 2) {
                                    Util.debug(26, "Not enough subsubentry in online toplist file: ." + KeyboardHero.APP_NAME + ".tls!");
                                    continue;
                                }
                                songs.add(ssubparts[0]);
                                names.add(ssubparts[1]);
                                foundCount++;
                            } catch (NumberFormatException e) {
                                Util.debug(24, "Corrupted toplist score and/or level number in the online toplist!");
                            } catch (ArrayIndexOutOfBoundsException e) {
                                Util.debug(25, "Corrupted toplist entry in the online toplist!");
                            }
                        }
                    }
                    bufferedRdr.close();
                    ((DialogToplist)(DialogToplist)(Object) KeyboardHero.getDialogs().get("toplist")).setContent(names.toArray(new String[0]), scores.toArray(new Integer[0]), songs.toArray(new String[0]), factors.toArray(new Float[0]), foundCount, -1);
                } catch (Exception e) {
                    ((DialogToplist)(DialogToplist)(Object) KeyboardHero.getDialogs().get("toplist")).setStatusText(Util.getMsg("CannotToplist") + "!\n\n" + e.toString(), false);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APP_NAME;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass split(String o0, int o1){ return null; }
	public MyHelperClass getDialogs(){ return null; }
	public MyHelperClass getMsg(String o0){ return null; }
	public MyHelperClass debug(int o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ArrayList {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass toArray(Integer[] o0){ return null; }
	public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(float o0){ return null; }
	public MyHelperClass toArray(Float[] o0){ return null; }
	public MyHelperClass add(int o0){ return null; }}

class DialogToplist {

public MyHelperClass setContent(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, int o4, int o5){ return null; }
	public MyHelperClass setStatusText(String o0, boolean o1){ return null; }}
