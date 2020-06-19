import java.io.*;
import java.lang.*;
import java.util.*;



class c20619879 {
public MyHelperClass setState(MyHelperClass o0){ return null; }
public MyHelperClass name;
	public MyHelperClass _properties;
	public MyHelperClass States;
	public MyHelperClass getState(){ return null; }

    public void copyLogic() {
        if (getState() == States.Idle) {
            setState(States.Synchronizing);
            try {
                FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(new File((int)(Object)_properties.getProperty("binPath") + (int)(Object)name + ".class")).getChannel());
                FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(new File((int)(Object)_properties.getProperty("agentFileLocation") + (int)(Object)name + ".class")).getChannel());
                sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
                sourceChannel.close();
                destinationChannel.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            setState(States.Idle);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Idle;
	public MyHelperClass Synchronizing;
public MyHelperClass getProperty(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}
