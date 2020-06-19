


class c15709410 {
public MyHelperClass transfer(InputStream o0, FileOutputStream o1){ return null; }
public MyHelperClass SyncType;

    void loadImage(final int runnumber, final String surl, final StatusCallback status) {
        Runnable run = new Runnable() {

            public void run() {
                try {
                    MyHelperClass sync = new MyHelperClass();
                    MyHelperClass SyncType = new MyHelperClass();
                    if (sync == SyncType.SyncSpaced || sync == SyncType.Spaced) {
                        MyHelperClass spaceMillis = new MyHelperClass();
                        Thread.sleep((long)(Object)spaceMillis);
                    }
                    URL url = new URL(surl + "&requestId=" + runnumber);
                    long t0 = System.currentTimeMillis();
                    InputStream in =(InputStream)(Object) url.openStream();
                    MyHelperClass outputFolder = new MyHelperClass();
                    transfer(in, new FileOutputStream(new File(outputFolder, "" + runnumber + ".png")));
//                    MyHelperClass outputFolder = new MyHelperClass();
                    MyHelperClass ImageIO = new MyHelperClass();
                    BufferedImage image =(BufferedImage)(Object) ImageIO.read(new File(outputFolder, "" + runnumber + ".png"));
                    status.score(runnumber, System.currentTimeMillis() - t0);
//                    MyHelperClass outputFolder = new MyHelperClass();
//                    MyHelperClass ImageIO = new MyHelperClass();
                    ImageIO.write(image, "png", new FileOutputStream(new File(outputFolder, "" + runnumber + ".png")));
                    if (false) {
                        int whiteCount = 0;
                        for (int i = 0; i < (int)(Object)image.getWidth(); i++) {
                            for (int j = 0; j < (int)(Object)image.getHeight(); j++) {
                                whiteCount +=(int)(Object) image.getRGB(i, j) == -1 ? 1 : 0;
                            }
                        }
                        System.err.println("##" + runnumber + "#: " + whiteCount);
                        if (whiteCount < 227564) {
                            System.err.println("whiteCount fails!!!!");
                            System.err.println("whiteCount fails!!!!");
                            System.exit(0);
                        }
                    }
                } catch (Exception ex) {
                    System.err.println("##" + runnumber + "#: Exception!!! ###");
                    ex.printStackTrace();
                    status.score(runnumber, -999);
                }
            }
        };
        MyHelperClass sync = new MyHelperClass();
        if (sync == SyncType.SyncSpaced || sync == SyncType.Sync) {
            run.run();
        } else {
            new Thread(run).start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Spaced;
	public MyHelperClass SyncSpaced;
	public MyHelperClass Sync;
public MyHelperClass write(BufferedImage o0, String o1, FileOutputStream o2){ return null; }
	public MyHelperClass read(File o0){ return null; }}

class StatusCallback {

public MyHelperClass score(int o0, long o1){ return null; }
	public MyHelperClass score(int o0, int o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class BufferedImage {

public MyHelperClass getRGB(int o0, int o1){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}
