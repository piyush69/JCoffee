


class c7327832 {
public MyHelperClass mLocker;
	public MyHelperClass isCancelled(){ return null; }
	public MyHelperClass publishProgress(int o0){ return null; }

//        @Override
        protected File doInBackground(String... params) {
            try {
                String urlString = params[0];
                final String fileName = params[1];
                if (!urlString.endsWith("/")) {
                    urlString += "/";
                }
                urlString += "apk/" + fileName;
                URL url = new URL(urlString);
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                connection.connect();
                MyHelperClass Environment = new MyHelperClass();
                File dir = new File((File)(Object)Environment.getExternalStorageDirectory(), "imogenemarket");
                dir.mkdirs();
                File file = new File(dir, fileName);
                if ((boolean)(Object)file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                InputStream input =(InputStream)(Object) new BufferedInputStream(url.openStream());
                OutputStream output =(OutputStream)(Object) new FileOutputStream(file);
                byte data[] = new byte[1024];
                int count;
                int bigCount = 0;
                while ((count =(int)(Object) input.read(data)) != -1) {
                    if ((boolean)(Object)isCancelled()) {
                        break;
                    }
                    bigCount += count;
                    if (!(Boolean)(Object)mLocker.isLocked()) {
                        publishProgress(bigCount);
                        bigCount = 0;
                        mLocker.lock();
                    }
                    output.write(data, 0, count);
                }
                mLocker.cancel();
                publishProgress(bigCount);
                output.flush();
                output.close();
                input.close();
                if ((boolean)(Object)isCancelled()) {
                    file.delete();
                    return null;
                }
                return file;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass cancel(){ return null; }
	public MyHelperClass getExternalStorageDirectory(){ return null; }
	public MyHelperClass isLocked(){ return null; }
	public MyHelperClass lock(){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
