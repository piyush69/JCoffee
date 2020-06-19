


class c22418839 {
public MyHelperClass addToSendQueue(Packet1Login o0){ return null; }
public MyHelperClass session;

    public void handleHandshake(Packet2Handshake par1Packet2Handshake) {
        boolean flag = true;
        String s =(String)(Object) par1Packet2Handshake.username;
        if (s == null || s.trim().length() == 0) {
            flag = false;
        } else if (!s.equals("-")) {
            try {
                Long.parseLong(s, 16);
            } catch (NumberFormatException numberformatexception) {
                flag = false;
            }
        }
        if (!flag) {
            MyHelperClass netManager = new MyHelperClass();
            netManager.networkShutdown("disconnect.genericReason", new Object[] { "The server responded with an invalid server key" });
        } else if (par1Packet2Handshake.username.equals("-")) {
            addToSendQueue(new Packet1Login(session.username, 29));
        } else {
            try {
                URL url = new URL((new StringBuilder()).append("http://session.minecraft.net/game/joinserver.jsp?user=").append(session.username).append("&sessionId=").append(session.sessionId).append("&serverId=").append(par1Packet2Handshake.username).toString());
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream()));
                String s1 =(String)(Object) bufferedreader.readLine();
                bufferedreader.close();
                if (s1.equalsIgnoreCase("ok")) {
                    addToSendQueue(new Packet1Login(session.username, 29));
                } else {
                    MyHelperClass netManager = new MyHelperClass();
                    netManager.networkShutdown("disconnect.loginFailedInfo", new Object[] { s1 });
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                MyHelperClass netManager = new MyHelperClass();
                netManager.networkShutdown("disconnect.genericReason", new Object[] { (new StringBuilder()).append("Internal client error: ").append(exception.toString()).toString() });
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass username;
	public MyHelperClass sessionId;
public MyHelperClass networkShutdown(String o0, Object[] o1){ return null; }}

class Packet2Handshake {
public MyHelperClass username;
}

class Packet1Login {

Packet1Login(MyHelperClass o0, int o1){}
	Packet1Login(){}}

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
