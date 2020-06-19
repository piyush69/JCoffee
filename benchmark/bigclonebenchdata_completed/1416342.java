


class c1416342 {

    public void run() {
        MyHelperClass iClNumberOfCycles = new MyHelperClass();
        for (int i = 0; i < (int)(Object)iClNumberOfCycles; i++) {
            try {
                long lStartTime = System.currentTimeMillis();
                MyHelperClass urlClDestinationURL = new MyHelperClass();
                InputStream in =(InputStream)(Object) urlClDestinationURL.openStream();
                byte buf[] = new byte[1024];
                int num;
                while ((num =(int)(Object) in.read(buf)) > 0) ;
                in.close();
                long lStopTime = System.currentTimeMillis();
                MyHelperClass Node = new MyHelperClass();
                Node.getLogger().write((lStopTime - lStartTime) + " ms");
                MyHelperClass avgCalls = new MyHelperClass();
                avgCalls.update(lStopTime - lStartTime);
                System.out.print("*");
                System.out.flush();
                MyHelperClass calls = new MyHelperClass();
                calls.update();
            } catch (Exception e) {
                MyHelperClass cntErrors = new MyHelperClass();
                cntErrors.update();
                System.out.print("X");
                System.out.flush();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass update(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass update(long o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
