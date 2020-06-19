import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20056462 {
public MyHelperClass readConfig(BufferedReader o0, String o1, ArrayList<String o2){ return null; }
	public MyHelperClass readConfig(BufferedReader o0, String o1, Object o2){ return null; }

    public static ArrayList<AnalyzeDefinition> read(ArrayList<String> supportedCommands, File analyzeCommands, String programAnalyzeCommands) throws Throwable, ErrorMessage {
        if (analyzeCommands != null) {
            try {
                Reader fileReader = new FileReader(analyzeCommands);
                BufferedReader reader = new BufferedReader(fileReader);
                return readConfig(reader, analyzeCommands.getName(), null);
            } catch (FileNotFoundException e) {
                throw new ErrorMessage("File \"" + analyzeCommands + "\" not found");
            }
        } else if (programAnalyzeCommands != null) {
            Reader stringReader = new StringReader(programAnalyzeCommands);
            BufferedReader reader = new BufferedReader(stringReader);
            return readConfig(reader, "program response to gogui-analyze_commands", null);
        } else {
            String resource = "net/sf/gogui/gui/analyze-commands";
            URL url = ClassLoader.getSystemClassLoader().getResource(resource);
            if (url == null) return new ArrayList<AnalyzeDefinition>();
            try {
                InputStream inputStream = url.openStream();
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader);
                return readConfig(reader, "builtin default commands", supportedCommands);
            } catch (IOException e) {
                throw new ErrorMessage(e.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class AnalyzeDefinition {

}

class ErrorMessage {

}
