import java.io.*;
import java.lang.*;
import java.util.*;



class c13237415 {
public static MyHelperClass url;
//public MyHelperClass url;

    public static List<ServerInfo> getStartedServers() {
        List<ServerInfo> infos = new ArrayList<ServerInfo>();
        try {
            StringBuilder request = new StringBuilder();
            MyHelperClass displayServlet = new MyHelperClass();
            request.append(url).append("/").append(displayServlet);
            request.append("?ingame=1");
            URL objUrl = new URL(request.toString());
            URLConnection urlConnect =(URLConnection)(Object) objUrl.openConnection();
            InputStream in =(InputStream)(Object) urlConnect.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while (reader.ready()) {
                String name = reader.readLine();
                String ip = reader.readLine();
                int port = Integer.valueOf(reader.readLine());
                ServerInfo server = new ServerInfo(name, ip, port);
                server.nbPlayers =(MyHelperClass)(Object) Integer.valueOf(reader.readLine());
                infos.add(server);
            }
            in.close();
            return infos;
        } catch (Exception e) {
            return infos;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServerInfo {
public MyHelperClass nbPlayers;
ServerInfo(){}
	ServerInfo(String o0, String o1, int o2){}}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}
