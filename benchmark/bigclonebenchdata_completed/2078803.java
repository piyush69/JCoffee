


class c2078803 {
public MyHelperClass blockSize;
public MyHelperClass test;
	public MyHelperClass logErrorMessage(String o0){ return null; }

        public void run() {
            long id = 0;
            try {
                MyHelperClass httpRequest = new MyHelperClass();
                URL url = new URL((int)(Object)httpRequest + (int)(Object)blockSize);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                try {
                    String str =(String)(Object) in.readLine();
                    if (str == null) {
                        throw new IllegalStateException("Parsing error");
                    }
                    if (str.matches(".*SUCCESS.*")) {
                        str =(String)(Object) in.readLine();
                        if (str.matches(".*Start:.*")) {
                            str =(String)(Object) in.readLine();
                            id = Long.parseLong(str);
                        } else {
                            MyHelperClass blockSize = new MyHelperClass();
                            throw new IllegalStateException("Invalid response for blocksize(" + blockSize + "):" + str);
                        }
                    } else {
                        MyHelperClass blockSize = new MyHelperClass();
                        throw new IllegalStateException("Invalid response for blocksize(" + blockSize + "):" + str);
                    }
                } finally {
                    in.close();
                }
                if (id <= 0) throw new IllegalStateException("Invalid GUID start value " + id);
                MyHelperClass ids = new MyHelperClass();
                synchronized (ids) {
//                    MyHelperClass ids = new MyHelperClass();
                    boolean absent =(boolean)(Object) ids.add(new Long(id));
                    if (!absent) {
                        logErrorMessage(id + " already exists for thread " + Thread.currentThread().getName());
                    }
                }
            } catch (Exception e) {
                logErrorMessage("Unexpected IdGenerator thread failure" + e.getMessage());
                e.printStackTrace();
            } finally {
                synchronized (test) {
                    test.liveThreads--;
                    test.notify();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int liveThreads;
public MyHelperClass add(Long o0){ return null; }}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
