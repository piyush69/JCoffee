import java.io.*;
import java.lang.*;
import java.util.*;



class c18790501 {
public MyHelperClass addMusic(MyHelperClass o0, MyHelperClass o1){ return null; }

    public void init(String file) {
        URL url =(URL)(Object) SoundFactory.class.getResource(file);
        try {
            MyHelperClass JAXBContext = new MyHelperClass();
            JAXBContext context =(JAXBContext)(Object) JAXBContext.newInstance("elf.xml.sounds");
            Unmarshaller unmarshaller =(Unmarshaller)(Object) context.createUnmarshaller();
            SoundsBaseType root = null;
            Object tmpobj = unmarshaller.unmarshal(url.openConnection().getInputStream());
            if (tmpobj instanceof JAXBElement) {
                if ((SoundsBaseType)(Object)((JAXBElement) tmpobj).getValue() instanceof SoundsBaseType) {
                    root = (SoundsBaseType)(SoundsBaseType)(Object) ((JAXBElement) tmpobj).getValue();
                    addMusic((MyHelperClass)(Object)"MENUSONG", root.getMenumusic().getMusicpath());
                    List<SoundsMusicType> musiclist =(List<SoundsMusicType>)(Object) root.getMusic();
                    Iterator<SoundsMusicType> it = musiclist.iterator();
                    while (it.hasNext()) {
                        SoundsMusicType smt = it.next();
                        addMusic(smt.getMusicname(), smt.getMusicpath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMusicpath(){ return null; }
	public MyHelperClass newInstance(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class SoundFactory {

}

class JAXBContext {

public MyHelperClass createUnmarshaller(){ return null; }}

class Unmarshaller {

public MyHelperClass unmarshal(MyHelperClass o0){ return null; }}

class SoundsBaseType {

public MyHelperClass getMenumusic(){ return null; }
	public MyHelperClass getMusic(){ return null; }}

class JAXBElement {

public MyHelperClass getValue(){ return null; }}

class SoundsMusicType {

public MyHelperClass getMusicname(){ return null; }
	public MyHelperClass getMusicpath(){ return null; }}
