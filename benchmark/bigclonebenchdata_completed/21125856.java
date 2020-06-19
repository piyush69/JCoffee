import java.io.*;
import java.lang.*;
import java.util.*;



class c21125856 {
public MyHelperClass NULL;
public MyHelperClass download;
	public MyHelperClass Messages;
	public MyHelperClass downloadMessage;
	public MyHelperClass ObjectStore;

    public File createWindow(String pdfUrl) {
        URL url;
        InputStream is;
        try {
            int fileLength = 0;
            String str;
            if (pdfUrl.startsWith("jar:/")) {
                str = "file.pdf";
                is = this.getClass().getResourceAsStream(pdfUrl.substring(4));
            } else {
                url = new URL(pdfUrl);
                is =(InputStream)(Object) url.openStream();
                str =(String)(Object) url.getPath().substring((int)(Object)url.getPath().lastIndexOf('/') + 1);
                fileLength =(int)(Object) url.openConnection().getContentLength();
            }
            final String filename = str;
            File tempURLFile =(File)(Object) NULL; //new File();
            tempURLFile = File.createTempFile(filename.substring(0, filename.lastIndexOf('.')), filename.substring(filename.lastIndexOf('.')), new File((String)(Object)ObjectStore.temp_dir));
//            MyHelperClass tempURLFile = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream((String)(Object)tempURLFile);
            MyHelperClass visible = new MyHelperClass();
            if ((boolean)(Object)visible) {
                MyHelperClass coords = new MyHelperClass();
                download.setLocation(((int)(Object)coords.x - ((int)(Object)download.getWidth() / 2)), ((int)(Object)coords.y - ((int)(Object)download.getHeight() / 2)));
                MyHelperClass download = new MyHelperClass();
                download.setVisible(true);
            }
//            MyHelperClass visible = new MyHelperClass();
            if ((boolean)(Object)visible) {
                MyHelperClass pb = new MyHelperClass();
                pb.setMinimum(0);
//                MyHelperClass pb = new MyHelperClass();
                pb.setMaximum(fileLength);
                MyHelperClass Messages = new MyHelperClass();
                String message =(String)(Object) Messages.getMessage("PageLayoutViewMenu.DownloadWindowMessage");
                message = message.replaceAll("FILENAME", filename);
                MyHelperClass downloadFile = new MyHelperClass();
                downloadFile.setText(message);
                MyHelperClass turnOff = new MyHelperClass();
                Font f =(Font)(Object) turnOff.getFont();
//                MyHelperClass turnOff = new MyHelperClass();
                turnOff.setFont(new Font(f.getName(), f.getStyle(), 8));
                MyHelperClass JLabel = new MyHelperClass();
                turnOff.setAlignmentY(JLabel.RIGHT_ALIGNMENT);
//                MyHelperClass Messages = new MyHelperClass();
                turnOff.setText((String)(Object)Messages.getMessage("PageLayoutViewMenu.DownloadWindowTurnOff"));
            }
            byte[] buffer = new byte[4096];
            int read;
            int current = 0;
            String rate = "kb";
            int mod = 1000;
            if (fileLength > 1000000) {
                rate = "mb";
                mod = 1000000;
            }
//            MyHelperClass visible = new MyHelperClass();
            if ((boolean)(Object)visible) {
                MyHelperClass progress = new MyHelperClass();
                progress = Messages.getMessage("PageLayoutViewMenu.DownloadWindowProgress");
//                MyHelperClass progress = new MyHelperClass();
                if (fileLength < 1000000) progress = progress.replaceAll("DVALUE", (fileLength / mod) + " " + rate); else {
                    String fraction = String.valueOf(((fileLength % mod) / 10000));
                    if (((fileLength % mod) / 10000) < 10) fraction = "0" + fraction;
//                    MyHelperClass progress = new MyHelperClass();
                    progress = progress.replaceAll("DVALUE", (fileLength / mod) + "." + fraction + " " + rate);
                }
            }
            while ((read = is.read(buffer)) != -1) {
                current = current + read;
                int downloadCount =(int)(Object) NULL; //new int();
                downloadCount =(int)(Object) downloadCount + read;
//                MyHelperClass visible = new MyHelperClass();
                if ((boolean)(Object)visible) {
                    MyHelperClass progress = new MyHelperClass();
                    if (fileLength < 1000000) downloadMessage.setText((String)(Object)progress.replaceAll("DSOME", (current / mod) + " " + rate)); else {
                        String fraction = String.valueOf(((current % mod) / 10000));
                        if (((current % mod) / 10000) < 10) fraction = "0" + fraction;
//                        MyHelperClass progress = new MyHelperClass();
                        downloadMessage.setText((String)(Object)progress.replaceAll("DSOME", (current / mod) + "." + fraction + " " + rate));
                    }
                    MyHelperClass pb = new MyHelperClass();
                    pb.setValue(current);
                    MyHelperClass download = new MyHelperClass();
                    download.repaint();
                }
                fos.write(buffer, 0, read);
            }
            fos.flush();
            is.close();
            fos.close();
//            MyHelperClass visible = new MyHelperClass();
            if ((boolean)(Object)visible) downloadMessage.setText("Download of " + filename + " is complete.");
        } catch (Exception e) {
            MyHelperClass LogWriter = new MyHelperClass();
            LogWriter.writeLog("[PDF] Exception " + e + " opening URL " + pdfUrl);
            e.printStackTrace();
        }
        MyHelperClass visible = new MyHelperClass();
        if ((boolean)(Object)visible) download.setVisible(false);
        MyHelperClass tempURLFile = new MyHelperClass();
        return (File)(Object)tempURLFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass x;
	public MyHelperClass temp_dir;
	public MyHelperClass y;
	public MyHelperClass RIGHT_ALIGNMENT;
public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setMinimum(int o0){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass setLocation(int o0, int o1){ return null; }
	public MyHelperClass writeLog(String o0){ return null; }
	public MyHelperClass lastIndexOf(char o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setAlignmentY(MyHelperClass o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass getFont(){ return null; }
	public MyHelperClass setMaximum(int o0){ return null; }
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass setFont(Font o0){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class Font {

Font(){}
	Font(MyHelperClass o0, MyHelperClass o1, int o2){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getStyle(){ return null; }}
