


class c14414546 {
public MyHelperClass htmlHeader(PrintWriter o0, String o1, String o2){ return null; }
	public MyHelperClass htmlFooter(PrintWriter o0){ return null; }

    private void deleteProject(String uid, String home, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String project =(String)(Object) request.getParameter("project");
        String line;
        response.setContentType("text/html");
        PrintWriter out =(PrintWriter)(Object) response.getWriter();
        htmlHeader(out, "Project Status", "");
        try {
            synchronized (Class.forName("com.sun.gep.SunTCP")) {
                Vector list = new Vector();
                String directory = home;
                Runtime.getRuntime().exec("/usr/bin/rm -rf " + directory + project);
                MyHelperClass SUNTCP_LIST = new MyHelperClass();
                FilePermission perm = new FilePermission(directory + SUNTCP_LIST, "read,write,execute");
//                MyHelperClass SUNTCP_LIST = new MyHelperClass();
                File listfile = new File(directory + SUNTCP_LIST);
                BufferedReader read = new BufferedReader(new FileReader(listfile));
                while ((line =(String)(Object) read.readLine()) != null) {
                    if (!((new StringTokenizer(line, "\t")).nextToken().equals(project))) {
                        list.addElement(line);
                    }
                }
                read.close();
                if ((int)(Object)list.size() > 0) {
                    PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(listfile)));
                    for (int i = 0; i < (int)(Object)list.size(); i++) {
                        write.println((String)(String)(Object) list.get(i));
                    }
                    write.close();
                } else {
                    listfile.delete();
                }
                out.println("The project was successfully deleted.");
            }
        } catch (Exception e) {
            out.println("Error accessing this project.");
        }
        out.println("<center><form><input type=button value=Continue onClick=\"opener.location.reload(); window.close()\"></form></center>");
        htmlFooter(out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(BufferedWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class Vector {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }}

class FilePermission {

FilePermission(String o0, String o1){}
	FilePermission(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
