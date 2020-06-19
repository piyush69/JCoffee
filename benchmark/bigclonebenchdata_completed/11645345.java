


class c11645345 {

    private List createProjectInfoFile() throws SocketException, IOException {
        FTPClient client = new FTPClient();
        Set projects =(Set)(Object) new HashSet();
        client.connect("ftp.drupal.org");
        System.out.println("Connected to ftp.drupal.org");
        System.out.println(client.getReplyString());
        boolean loggedIn =(boolean)(Object) client.login("anonymous", "info@regilo.org");
        if (loggedIn) {
            FTPFile[] files =(FTPFile[])(Object) client.listFiles("pub/drupal/files/projects");
            for (FTPFile file : files) {
                String name =(String)(Object) file.getName();
                MyHelperClass Pattern = new MyHelperClass();
                Pattern p =(Pattern)(Object) Pattern.compile("([a-zAZ_]*)-(\\d.x)-(.*)");
                Matcher m =(Matcher)(Object) p.matcher(name);
                if ((boolean)(Object)m.matches()) {
                    String projectName =(String)(Object) m.group(1);
                    String version =(String)(Object) m.group(2);
                    if (version.equals("6.x")) {
                        projects.add(projectName);
                    }
                }
            }
        }
        List projectList =(List)(Object) new ArrayList();
        for (String project :(String[])(Object) (Object[])(Object)projects) {
            projectList.add(project);
        }
        MyHelperClass Collections = new MyHelperClass();
        Collections.sort(projectList);
        return projectList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass sort(List o0){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class Set {

public MyHelperClass add(String o0){ return null; }}

class HashSet {

}

class FTPFile {

public MyHelperClass getName(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}

class ArrayList {

}
