


class c11095249 {
public MyHelperClass password;
	public MyHelperClass EventMemory;
	public MyHelperClass sync_panel;
	public MyHelperClass Settings;

    public void run() {
        InputStreamReader in = null;
        OutputStreamWriter out = null;
        URL url = null;
        File net_file = null;
        long in_length = 0;
        MyHelperClass progress_bar = new MyHelperClass();
        progress_bar.setValue(0);
//        MyHelperClass progress_bar = new MyHelperClass();
        progress_bar.setString("connecting!");
//        MyHelperClass progress_bar = new MyHelperClass();
        progress_bar.setStringPainted(true);
        MyHelperClass sync_host_path_name = new MyHelperClass();
        if ((int)(Object)sync_host_path_name.length() > 0) {
            try {
                try {
                    MyHelperClass protocol = new MyHelperClass();
                    if (protocol == Settings.protFTP) {
                        MyHelperClass user_name = new MyHelperClass();
                        url = new URL("ftp://" + user_name + ":" + password + "@" + sync_host_path_name);
                        URLConnection connection =(URLConnection)(Object) url.openConnection();
                        in = new InputStreamReader(connection.getInputStream());
                        in_length =(long)(Object) connection.getContentLength();
                    } else {
//                        MyHelperClass sync_host_path_name = new MyHelperClass();
                        net_file = new File(sync_host_path_name);
                        in = new InputStreamReader(new FileInputStream(net_file), "US-ASCII");
                        in_length =(long)(Object) net_file.length();
                    }
//                    MyHelperClass progress_bar = new MyHelperClass();
                    progress_bar.setString("synchronising!");
//                    MyHelperClass progress_bar = new MyHelperClass();
                    EventMemory.get_instance(null).import_vCalendar(in, Math.max(in_length, 1), true, progress_bar);
                    in.close();
                } catch (Exception x) {
//                    MyHelperClass progress_bar = new MyHelperClass();
                    progress_bar.setString(x.getMessage());
                }
//                MyHelperClass progress_bar = new MyHelperClass();
                progress_bar.setValue(0);
//                MyHelperClass progress_bar = new MyHelperClass();
                progress_bar.setString("connecting!");
                MyHelperClass protocol = new MyHelperClass();
                if (protocol == Settings.protFTP) {
                    URLConnection connection =(URLConnection)(Object) url.openConnection();
                    connection.setDoOutput(true);
                    out = new OutputStreamWriter(connection.getOutputStream(), "US-ASCII");
//                MyHelperClass protocol = new MyHelperClass();
                } else if (protocol == Settings.protFile) {
                    out = new OutputStreamWriter(new FileOutputStream(net_file), "US-ASCII");
                }
//                MyHelperClass progress_bar = new MyHelperClass();
                progress_bar.setString("writing!");
                MyHelperClass EventMemory = new MyHelperClass();
                int[] i = new int[(int)(Object)EventMemory.get_instance(null).get_size()];
                for (int k = 0; k < i.length; k++) {
                    i[k] = k;
                }
//                MyHelperClass progress_bar = new MyHelperClass();
                progress_bar.setStringPainted(true);
//                MyHelperClass progress_bar = new MyHelperClass();
                EventMemory.get_instance(null).export_vCalendar(out, i, true, progress_bar, true);
                out.close();
                sync_panel.unlock_input();
                MyHelperClass sync_dialog = new MyHelperClass();
                sync_dialog.dispose();
            } catch (Exception e) {
//                MyHelperClass progress_bar = new MyHelperClass();
                progress_bar.setString(e.getMessage());
                sync_panel.unlock_input();
            }
        } else {
//            MyHelperClass progress_bar = new MyHelperClass();
            progress_bar.setString("enter a valid URL!");
            sync_panel.unlock_input();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass protFile;
	public MyHelperClass protFTP;
public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass unlock_input(){ return null; }
	public MyHelperClass export_vCalendar(OutputStreamWriter o0, int[] o1, boolean o2, MyHelperClass o3, boolean o4){ return null; }
	public MyHelperClass get_instance(Object o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass setString(String o0){ return null; }
	public MyHelperClass get_size(){ return null; }
	public MyHelperClass setStringPainted(boolean o0){ return null; }
	public MyHelperClass import_vCalendar(InputStreamReader o0, long o1, boolean o2, MyHelperClass o3){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0, String o1){}
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
