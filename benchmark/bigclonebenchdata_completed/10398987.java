


class c10398987 {
public MyHelperClass getFiles(FTPClient o0, FTPFile o1, String o2){ return null; }

    public void getDataFiles(String server, String username, String password, String folder, String destinationFolder) {
        try {
            FTPClient ftp = new FTPClient();
            ftp.connect(server);
            ftp.login(username, password);
            System.out.println("Connected to " + server + ".");
            System.out.print(ftp.getReplyString());
            ftp.enterLocalActiveMode();
            ftp.changeWorkingDirectory(folder);
            System.out.println("Changed to " + folder);
            FTPFile[] files =(FTPFile[])(Object) ftp.listFiles();
            System.out.println("Number of files in dir: " + files.length);
            for (int i = 0; i < files.length; i++) {
                getFiles(ftp, files[i], destinationFolder);
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
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class FTPFile {

}
