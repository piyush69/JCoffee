


class c16830682 {
public MyHelperClass readKSon(MyHelperClass o0){ return null; }
public MyHelperClass createNode(Session o0, NodeCreation o1){ return null; }

    public void install(Session session) throws Exception {
        MyHelperClass ConfigurationFactory = new MyHelperClass();
        String cfgPath =(String)(Object) ConfigurationFactory.getConfigSonInstance().getConfigurationPath();
        File setupKson = new File(cfgPath, "setup.kson");
        InputStream is = null;
        if ((boolean)(Object)setupKson.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.debug("Reagind kson from " + setupKson.getAbsolutePath());
            is =(InputStream)(Object) new FileInputStream(setupKson);
        } else {
            String ksonCp = "/org/chon/cms/core/setup/setup.kson";
            is =(InputStream)(Object) Setup.class.getResourceAsStream(ksonCp);
            MyHelperClass log = new MyHelperClass();
            log.info("Creating initial setup.kson in " + setupKson.getAbsolutePath());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, new FileOutputStream(setupKson));
            is =(InputStream)(Object) new FileInputStream(setupKson);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        List lines =(List)(Object) new ArrayList();
        while (true) {
            String line =(String)(Object) br.readLine();
            if (line == null) break;
            lines.add(line);
        }
        List ncList =(List)(Object) readKSon(lines.toArray(new String[(int)(Object)lines.size()]));
        for (NodeCreation nc :(NodeCreation[])(Object) (Object[])(Object)ncList) {
            try {
                createNode(session, nc);
            } catch (Exception e) {
                System.err.println("error crating node " + nc.path + " -> " + e.getMessage());
            }
        }
        session.save();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getConfigSonInstance(){ return null; }
	public MyHelperClass getConfigurationPath(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Session {

public MyHelperClass save(){ return null; }}

class File {

File(String o0, String o1){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Setup {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class List {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class NodeCreation {
public MyHelperClass path;
}
