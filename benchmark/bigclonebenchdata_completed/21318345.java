


class c21318345 {

    public static void loadMemcachedConfigFromURL(URL url, XMLInputFactory factory, List memcachedClientconfigs, List memcachedClientSocketPoolConfigs, List memcachedClientClusterConfig) {
        MemcachedClientConfig node = null;
        MemcachedClientSocketPoolConfig socketnode = null;
        MemcachedClientClusterConfig clusternode = null;
        InputStream in = null;
        XMLEventReader r = null;
        try {
            in =(InputStream)(Object) url.openStream();
            r =(XMLEventReader)(Object) factory.createXMLEventReader(in);
            String servers = null;
            String weights = null;
            while ((boolean)(Object)r.hasNext()) {
                XMLEvent event =(XMLEvent)(Object) r.nextEvent();
                if ((boolean)(Object)event.isStartElement()) {
                    StartElement start =(StartElement)(Object) event.asStartElement();
                    String tag =(String)(Object) start.getName().getLocalPart();
                    if (tag.equalsIgnoreCase("client")) {
                        node = new MemcachedClientConfig();
                        if (start.getAttributeByName(new QName("", "name")) != null) node.setName(start.getAttributeByName(new QName("", "name")).getValue()); else throw new RuntimeException("memcached client name can't not be null!");
                        if (start.getAttributeByName(new QName("", "socketpool")) != null) node.setSocketPool(start.getAttributeByName(new QName("", "socketpool")).getValue()); else throw new RuntimeException("memcached client socketpool can't not be null!");
                        if (start.getAttributeByName(new QName("", "compressEnable")) != null) node.setCompressEnable(Boolean.parseBoolean((String)(Object)start.getAttributeByName(new QName("", "compressEnable")).getValue())); else node.setCompressEnable(true);
                        if (start.getAttributeByName(new QName("", "defaultEncoding")) != null) node.setDefaultEncoding((String)(Object)start.getAttributeByName(new QName("", "defaultEncoding")).getValue()); else node.setDefaultEncoding("UTF-8");
                        continue;
                    }
                    if (tag.equalsIgnoreCase("errorHandler") && node != null) {
                        event =(XMLEvent)(Object) r.peek();
                        if ((boolean)(Object)event.isCharacters()) {
                            node.setErrorHandler(event.asCharacters().getData());
                            r.nextEvent();
                        }
                        continue;
                    }
                    if (tag.equalsIgnoreCase("socketpool")) {
                        socketnode = new MemcachedClientSocketPoolConfig();
                        servers = null;
                        weights = null;
                        if (start.getAttributeByName(new QName("", "name")) != null) socketnode.setName(start.getAttributeByName(new QName("", "name")).getValue()); else throw new RuntimeException("memcached client socketpool name can't not be null!");
                        if (start.getAttributeByName(new QName("", "failover")) != null) socketnode.setFailover(Boolean.parseBoolean((String)(Object)start.getAttributeByName(new QName("", "failover")).getValue()));
                        if (start.getAttributeByName(new QName("", "initConn")) != null) socketnode.setInitConn(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "initConn")).getValue()));
                        if (start.getAttributeByName(new QName("", "minConn")) != null) socketnode.setMinConn(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "minConn")).getValue()));
                        if (start.getAttributeByName(new QName("", "maxConn")) != null) socketnode.setMaxConn(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "maxConn")).getValue()));
                        if (start.getAttributeByName(new QName("", "maintSleep")) != null) socketnode.setMaintSleep(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "maintSleep")).getValue()));
                        if (start.getAttributeByName(new QName("", "nagle")) != null) socketnode.setNagle(Boolean.parseBoolean((String)(Object)start.getAttributeByName(new QName("", "nagle")).getValue()));
                        if (start.getAttributeByName(new QName("", "socketTO")) != null) socketnode.setSocketTo(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "socketTO")).getValue()));
                        if (start.getAttributeByName(new QName("", "maxIdle")) != null) socketnode.setMaxIdle(Integer.parseInt((String)(Object)start.getAttributeByName(new QName("", "maxIdle")).getValue()));
                        if (start.getAttributeByName(new QName("", "aliveCheck")) != null) socketnode.setAliveCheck(Boolean.parseBoolean((String)(Object)start.getAttributeByName(new QName("", "aliveCheck")).getValue()));
                        continue;
                    }
                    if (tag.equalsIgnoreCase("servers") && socketnode != null) {
                        event =(XMLEvent)(Object) r.peek();
                        if ((boolean)(Object)event.isCharacters()) {
                            servers =(String)(Object) event.asCharacters().getData();
                            socketnode.setServers(servers);
                            r.nextEvent();
                        }
                        continue;
                    }
                    if (tag.equalsIgnoreCase("weights") && socketnode != null) {
                        event =(XMLEvent)(Object) r.peek();
                        if ((boolean)(Object)event.isCharacters()) {
                            weights =(String)(Object) event.asCharacters().getData();
                            socketnode.setWeights(weights);
                            r.nextEvent();
                        }
                        continue;
                    }
                    if (tag.equalsIgnoreCase("cluster")) {
                        clusternode = new MemcachedClientClusterConfig();
                        if (start.getAttributeByName(new QName("", "name")) != null) clusternode.setName(start.getAttributeByName(new QName("", "name")).getValue()); else throw new RuntimeException("memcached cluster name can't not be null!");
                        if (start.getAttributeByName(new QName("", "mode")) != null) clusternode.setMode(start.getAttributeByName(new QName("", "mode")).getValue());
                        continue;
                    }
                    if (tag.equalsIgnoreCase("memCachedClients") && clusternode != null) {
                        event =(XMLEvent)(Object) r.peek();
                        if ((boolean)(Object)event.isCharacters()) {
                            String clients =(String)(Object) event.asCharacters().getData();
                            if (clients != null && !clients.equals("")) {
                                clusternode.setMemCachedClients(clients.split(","));
                            }
                            r.nextEvent();
                        }
                        continue;
                    }
                }
                if ((boolean)(Object)event.isEndElement()) {
                    EndElement end =(EndElement)(Object) event.asEndElement();
                    if (node != null && (boolean)(Object)end.getName().getLocalPart().equalsIgnoreCase("client")) {
                        memcachedClientconfigs.add(node);
                        MyHelperClass Logger = new MyHelperClass();
                        Logger.info(new StringBuilder().append(" add memcachedClient config :").append(node.getName()));
                        continue;
                    }
                    if (socketnode != null && (boolean)(Object)end.getName().getLocalPart().equalsIgnoreCase("socketpool")) {
                        memcachedClientSocketPoolConfigs.add(socketnode);
                        MyHelperClass Logger = new MyHelperClass();
                        Logger.info(new StringBuilder().append(" add socketpool config :").append(socketnode.getName()));
                        continue;
                    }
                    if (clusternode != null && (boolean)(Object)end.getName().getLocalPart().equalsIgnoreCase("cluster")) {
                        memcachedClientClusterConfig.add(clusternode);
                        MyHelperClass Logger = new MyHelperClass();
                        Logger.info(new StringBuilder().append(" add cluster config :").append(clusternode.getName()));
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.error(new StringBuilder("MemcachedManager loadConfig error !").append(" config url :").append(url.getFile()).toString());
            node = null;
        } finally {
            try {
                if (r != null) r.close();
                if (in != null) in.close();
                r = null;
                in = null;
            } catch (Exception ex) {
                throw new RuntimeException("processConfigURL error !", ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(StringBuilder o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getLocalPart(){ return null; }
	public MyHelperClass getData(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class XMLInputFactory {

public MyHelperClass createXMLEventReader(InputStream o0){ return null; }}

class List {

public MyHelperClass add(MemcachedClientSocketPoolConfig o0){ return null; }
	public MyHelperClass add(MemcachedClientClusterConfig o0){ return null; }
	public MyHelperClass add(MemcachedClientConfig o0){ return null; }}

class MemcachedClientConfig {

public MyHelperClass setDefaultEncoding(String o0){ return null; }
	public MyHelperClass setErrorHandler(MyHelperClass o0){ return null; }
	public MyHelperClass setCompressEnable(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setSocketPool(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class MemcachedClientSocketPoolConfig {

public MyHelperClass setServers(String o0){ return null; }
	public MyHelperClass setMaintSleep(int o0){ return null; }
	public MyHelperClass setMinConn(int o0){ return null; }
	public MyHelperClass setSocketTo(int o0){ return null; }
	public MyHelperClass setMaxConn(int o0){ return null; }
	public MyHelperClass setWeights(String o0){ return null; }
	public MyHelperClass setNagle(boolean o0){ return null; }
	public MyHelperClass setFailover(boolean o0){ return null; }
	public MyHelperClass setAliveCheck(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setMaxIdle(int o0){ return null; }
	public MyHelperClass setInitConn(int o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class MemcachedClientClusterConfig {

public MyHelperClass setMemCachedClients(String[] o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setMode(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class XMLEventReader {

public MyHelperClass nextEvent(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass peek(){ return null; }}

class XMLEvent {

public MyHelperClass isStartElement(){ return null; }
	public MyHelperClass asCharacters(){ return null; }
	public MyHelperClass asEndElement(){ return null; }
	public MyHelperClass isCharacters(){ return null; }
	public MyHelperClass asStartElement(){ return null; }
	public MyHelperClass isEndElement(){ return null; }}

class StartElement {

public MyHelperClass getAttributeByName(QName o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class QName {

QName(String o0, String o1){}
	QName(){}}

class EndElement {

public MyHelperClass getName(){ return null; }}
