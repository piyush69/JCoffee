


class c10398988 {
public MyHelperClass putFiles(FTPClient o0, File o1){ return null; }

    public void putDataFiles(String server, String username, String password, String folder, String destinationFolder) {
        try {
            FTPClient ftp = new FTPClient();
            ftp.connect(server);
            System.out.println("Connected");
            ftp.login(username, password);
            System.out.println("Logged in to " + server + ".");
            System.out.print(ftp.getReplyString());
            ftp.changeWorkingDirectory(destinationFolder);
            System.out.println("Changed to directory " + destinationFolder);
            File localRoot = new File(folder);
            File[] files =(File[])(Object) localRoot.listFiles();
            System.out.println("Number of files in dir: " + files.length);
            for (int i = 0; i < files.length; i++) {
                putFiles(ftp, files[i]);
            }
            ftp.logout();
            ftp.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass listFiles(){ return null; }}
