


class c6379125 {
public MyHelperClass processaString(MyHelperClass o0){ return null; }
public MyHelperClass retornaExtensaoMidia(MyHelperClass o0){ return null; }
public MyHelperClass getMidias(){ return null; }

    public void copiarMidias(final File vidDir, final File imgDir) {
        for (int i = 0; i < (int)(Object)getMidias().size(); i++) {
            try {
                FileChannel src =(FileChannel)(Object) (new FileInputStream(getMidias().get(i).getUrl().trim()).getChannel());
                FileChannel dest;
                if (getMidias().get(i).getTipo().equals("video")) {
                    FileChannel vidDest =(FileChannel)(Object) (new FileOutputStream(vidDir + "/" + processaString(getMidias().get(i).getTitulo()) + "." + retornaExtensaoMidia(getMidias().get(i))).getChannel());
                    dest = vidDest;
                } else {
                    FileChannel midDest =(FileChannel)(Object) (new FileOutputStream(imgDir + "/" + processaString(getMidias().get(i).getTitulo()) + "." + retornaExtensaoMidia(getMidias().get(i))).getChannel());
                    dest = midDest;
                }
                dest.transferFrom(src, 0, src.size());
                src.close();
                dest.close();
            } catch (Exception e) {
                System.err.print(e.getMessage());
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getTitulo(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getTipo(){ return null; }}

class File {

}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
