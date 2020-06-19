
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6793553 {

    @SuppressWarnings("unchecked")
    public void handle(Map data, String urlPath) {
        try {
            URL url = new URL(urlPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
            String line = null;
            CMGroup currentGroup = null;
            MyHelperClass CMConstants = new MyHelperClass();
            List groups = (List)(List)(Object) data.get(CMConstants.GROUP);
//            MyHelperClass CMConstants = new MyHelperClass();
            List tags = (List)(List)(Object) data.get(CMConstants.TAG);
//            MyHelperClass CMConstants = new MyHelperClass();
            List tagGroups = (List)(List)(Object) data.get(CMConstants.TAG_GROUP);
            while ((line =(String)(Object) reader.readLine()) != null) {
                CMGroup group = null;
                try {
                    MyHelperClass FetchUtil = new MyHelperClass();
                    group =(CMGroup)(Object) FetchUtil.getCMGroup(line);
                } catch (Exception e) {
                    MyHelperClass CMLog = new MyHelperClass();
                    CMLog.getLogger(this).severe("getCMGroup error:" + line);
                }
                if (group != null) {
                    if (currentGroup != null) {
                        groups.add(currentGroup);
                    }
                    currentGroup = group;
                }
                CMTag tag = null;
                try {
                    MyHelperClass FetchUtil = new MyHelperClass();
                    tag =(CMTag)(Object) FetchUtil.getCMTag(line);
                } catch (Exception e) {
                    MyHelperClass CMLog = new MyHelperClass();
                    CMLog.getLogger(this).severe("getCMTag error:" + line);
                }
                if (tag != null) {
                    CMTagGroup tagGroup = new CMTagGroup();
                    tagGroup.setGroupName(currentGroup.getName());
                    tagGroup.setTagName(tag.getName());
                    tags.add(tag);
                    tagGroups.add(tagGroup);
                }
            }
            groups.add(currentGroup);
            reader.close();
        } catch (UncheckedIOException e) {
            MyHelperClass CMLog = new MyHelperClass();
            CMLog.getLogger(this).severe("GTagHandler error:" + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            MyHelperClass CMLog = new MyHelperClass();
            CMLog.getLogger(this).severe("GTagHandler error:" + e.getMessage());
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GROUP;
	public MyHelperClass TAG;
	public MyHelperClass TAG_GROUP;
public MyHelperClass getCMTag(String o0){ return null; }
	public MyHelperClass getCMGroup(String o0){ return null; }
	public MyHelperClass getLogger(c6793553 o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class Map {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class CMGroup {

public MyHelperClass getName(){ return null; }}

class List {

public MyHelperClass add(CMTagGroup o0){ return null; }
	public MyHelperClass add(CMTag o0){ return null; }
	public MyHelperClass add(CMGroup o0){ return null; }}

class CMTag {

public MyHelperClass getName(){ return null; }}

class CMTagGroup {

public MyHelperClass setGroupName(MyHelperClass o0){ return null; }
	public MyHelperClass setTagName(MyHelperClass o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
