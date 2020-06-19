import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18354652 {
public MyHelperClass Toolkit;
public MyHelperClass JOptionPane;
	public MyHelperClass handleNetworkException(IllegalArgumentException o0){ return null; }
	public MyHelperClass handleNetworkException(InstantiationException o0){ return null; }
	public MyHelperClass handleNetworkException(IOException o0){ return null; }
	public MyHelperClass getScenarioChoices(){ return null; }
	public MyHelperClass loadGame(InputStream o0){ return null; }
	public MyHelperClass handleNetworkException(ClassNotFoundException o0){ return null; }
	public MyHelperClass handleNetworkException(IllegalAccessException o0){ return null; }

    private void newGame()  throws Throwable {
        List scenarios =(List)(Object) getScenarioChoices();
        ScenarioChoice scenarioChoice = (ScenarioChoice)(ScenarioChoice)(Object) JOptionPane.showInputDialog(this, "Choose a Scenario", "Choose a Scenario", JOptionPane.PLAIN_MESSAGE, null, scenarios.toArray(), scenarios.get(0));
        if (scenarioChoice == null) {
            return;
        }
        Object obj;
        try {
            obj = Toolkit.loadClass(scenarioChoice.className, null);
        } catch (ArithmeticException e) {
            handleNetworkException((IllegalArgumentException)(Object)e);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            handleNetworkException((IllegalArgumentException)(Object)e);
            return;
        } catch (ArrayStoreException e) {
            handleNetworkException((IllegalArgumentException)(Object)e);
            return;
        } catch (IllegalArgumentException e) {
            handleNetworkException(e);
            return;
        } catch (ClassCastException e) {
            handleNetworkException((IllegalArgumentException)(Object)e);
            return;
        }
        if (obj == null || !(obj instanceof Scenario)) {
            return;
        }
        Scenario scenario = (Scenario) obj;
        String[] variations =(String[])(Object) scenario.getVariations();
        int chosenvariation = 0;
        if (variations.length > 1) {
            String[] variationsChoice = new String[variations.length + 1];
            System.arraycopy(variations, 0, variationsChoice, 0, variations.length);
            variationsChoice[variationsChoice.length - 1] = "Cancel";
            chosenvariation =(int)(Object) JOptionPane.showOptionDialog(this, "Choose a Variation", "Choose Variation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, variationsChoice, variationsChoice[0]);
            if (chosenvariation == (int)(Object)JOptionPane.CLOSED_OPTION || chosenvariation == variationsChoice.length - 1) {
                return;
            }
        }
        String path =(int)(Object) scenarioChoice.filePrefix + chosenvariation + ".sav";
        URL url = this.getClass().getClassLoader().getResource(path);
        try {
            loadGame(url.openStream());
        } catch (IOException e) {
            handleNetworkException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_CANCEL_OPTION;
	public MyHelperClass CLOSED_OPTION;
	public MyHelperClass PLAIN_MESSAGE;
public MyHelperClass showInputDialog(c18354652 o0, String o1, String o2, MyHelperClass o3, Object o4, Object[] o5, Object o6){ return null; }
	public MyHelperClass loadClass(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass showOptionDialog(c18354652 o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4, Object o5, String[] o6, String o7){ return null; }}

class ScenarioChoice {
public MyHelperClass className;
	public MyHelperClass filePrefix;
}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class Scenario {

public MyHelperClass getVariations(){ return null; }}
