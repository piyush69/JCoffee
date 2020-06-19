


class c23349376 {
public MyHelperClass version;
	public MyHelperClass DatasourceManager;
	public MyHelperClass GenotypeDataSearchAction;

    public TreeMap getStrainMap() {
        TreeMap strainMap = new TreeMap();
        String server = "";
        try {
            MyHelperClass alias = new MyHelperClass();
            Datasource[] ds =(Datasource[])(Object) DatasourceManager.getDatasouce(alias, version, DatasourceManager.ALL_CONTAINS_GROUP);
            for (int i = 0; i < ds.length; i++) {
                MyHelperClass MOUSE_DBSNP = new MyHelperClass();
                if ((boolean)(Object)ds[i].getDescription().startsWith(MOUSE_DBSNP)) {
                    if ((int)(Object)ds[i].getServer().length() == 0) {
                        Connection con =(Connection)(Object) ds[i].getConnection();
                        strainMap =(TreeMap)(Object) GenotypeDataSearchAction.getStrainMap(con);
                        break;
                    } else {
                        server =(String)(Object) ds[i].getServer();
                        MyHelperClass InitXml = new MyHelperClass();
                        HashMap serverUrlMap =(HashMap)(Object) InitXml.getInstance().getServerMap();
                        String serverUrl = (String)(String)(Object) serverUrlMap.get(server);
                        MyHelperClass servletName = new MyHelperClass();
                        URL url = new URL(serverUrl + servletName);
                        URLConnection uc =(URLConnection)(Object) url.openConnection();
                        uc.setDoOutput(true);
                        OutputStream os =(OutputStream)(Object) uc.getOutputStream();
                        StringBuffer buf = new StringBuffer();
                        buf.append("viewType=getstrains");
                        MyHelperClass hHead = new MyHelperClass();
                        buf.append("&hHead=" + hHead);
                        MyHelperClass version = new MyHelperClass();
                        buf.append("&hCheck=" + version);
                        PrintStream ps = new PrintStream(os);
                        ps.print(buf.toString());
                        ps.close();
                        ObjectInputStream ois = new ObjectInputStream(uc.getInputStream());
                        strainMap = (TreeMap)(TreeMap)(Object) ois.readObject();
                        ois.close();
                    }
                }
            }
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("strain map", e);
        }
        return strainMap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ALL_CONTAINS_GROUP;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass getServerMap(){ return null; }
	public MyHelperClass getDatasouce(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getStrainMap(Connection o0){ return null; }}

class TreeMap {

}

class Datasource {

public MyHelperClass getServer(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

}

class HashMap {

public MyHelperClass get(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

}

class PrintStream {

PrintStream(OutputStream o0){}
	PrintStream(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
