import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16165021 {
public MyHelperClass SpellActivator;
	public MyHelperClass PreferenceConstants;
	public MyHelperClass VariablesPlugin;
	public MyHelperClass fUserDictionary;
	public MyHelperClass fChecker;

    private synchronized void resetUserDictionary() {
        if (this.fChecker == null) return;
        if (this.fUserDictionary != null) {
            this.fChecker.removeDictionary(this.fUserDictionary);
            this.fUserDictionary.unload();
            this.fUserDictionary = null;
        }
        IPreferenceStore store =(IPreferenceStore)(Object) SpellActivator.getDefault().getPreferenceStore();
        String filePath =(String)(Object) store.getString(PreferenceConstants.SPELLING_USER_DICTIONARY);
        IStringVariableManager variableManager =(IStringVariableManager)(Object) VariablesPlugin.getDefault().getStringVariableManager();
        try {
            filePath =(String)(Object) variableManager.performStringSubstitution(filePath);
        } catch (UncheckedIOException e) {
            SpellActivator.log((CoreException)(Object)e);
            return;
        }
        if (filePath.length() > 0) {
            try {
                File file = new File(filePath);
                if (!file.exists() && !file.createNewFile()) return;
                final URL url = new URL("file", null, filePath);
                InputStream stream = url.openStream();
                if (stream != null) {
                    try {
                        this.fUserDictionary =(MyHelperClass)(Object) new PersistentSpellDictionary(url);
                        this.fChecker.addDictionary(this.fUserDictionary);
                    } finally {
                        stream.close();
                    }
                }
            } catch (MalformedURLException exception) {
            } catch (IOException exception) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SPELLING_USER_DICTIONARY;
public MyHelperClass removeDictionary(MyHelperClass o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getPreferenceStore(){ return null; }
	public MyHelperClass log(CoreException o0){ return null; }
	public MyHelperClass addDictionary(MyHelperClass o0){ return null; }
	public MyHelperClass getStringVariableManager(){ return null; }
	public MyHelperClass unload(){ return null; }}

class IPreferenceStore {

public MyHelperClass getString(MyHelperClass o0){ return null; }}

class IStringVariableManager {

public MyHelperClass performStringSubstitution(String o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class PersistentSpellDictionary {

PersistentSpellDictionary(URL o0){}
	PersistentSpellDictionary(){}}
