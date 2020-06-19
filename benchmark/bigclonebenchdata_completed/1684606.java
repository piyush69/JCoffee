import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1684606 {
public MyHelperClass DEFAULT_INDENT;
	public MyHelperClass UriOrFile;
	public MyHelperClass DEFAULT_LINE_LENGTH;
	public MyHelperClass DEFAULT_OUTPUT_ENCODING;
	public MyHelperClass transformationIsValid(SchemaGenerationModel o0){ return null; }

    private void generateSchema()  throws Throwable {
        MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
        ConsoleOutputWindow console =(ConsoleOutputWindow)(Object) DefaultXPontusWindowImpl.getInstance().getConsole();
        MyHelperClass MessagesWindowDockable = new MyHelperClass();
        MessagesWindowDockable mconsole = (MessagesWindowDockable)(MessagesWindowDockable)(Object) console.getDockableById(MessagesWindowDockable.DOCKABLE_ID);
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
//        MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
        IDocumentContainer container = (IDocumentContainer)(IDocumentContainer)(Object) DefaultXPontusWindowImpl.getInstance().getDocumentTabContainer().getCurrentDockable();
        try {
            MyHelperClass view = new MyHelperClass();
            SchemaGenerationModel model =(SchemaGenerationModel)(Object) view.getModel();
            boolean isValid =(boolean)(Object) transformationIsValid(model);
            if (!isValid) {
                return;
            }
//            MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
            DefaultXPontusWindowImpl.getInstance().getStatusBar().setMessage("Generating schema...");
//            MyHelperClass view = new MyHelperClass();
            view.setVisible(false);
            InputFormat inFormat = null;
            OutputFormat of = null;
            if ((boolean)(Object)model.getInputType().equalsIgnoreCase("RELAX NG Grammar")) {
                inFormat =(InputFormat)(Object) new SAXParseInputFormat();
            } else if ((boolean)(Object)model.getInputType().equalsIgnoreCase("RELAX NG Compact Grammar")) {
                inFormat =(InputFormat)(Object) new CompactParseInputFormat();
            } else if ((boolean)(Object)model.getInputType().equalsIgnoreCase("DTD")) {
                inFormat =(InputFormat)(Object) new DtdInputFormat();
            } else if ((boolean)(Object)model.getInputType().equalsIgnoreCase("XML")) {
                inFormat =(InputFormat)(Object) new XmlInputFormat();
            }
            if ((boolean)(Object)model.getOutputType().equalsIgnoreCase("DTD")) {
                of =(OutputFormat)(Object) new DtdOutputFormat();
            } else if ((boolean)(Object)model.getOutputType().equalsIgnoreCase("Relax NG Grammar")) {
                of =(OutputFormat)(Object) new RngOutputFormat();
            } else if ((boolean)(Object)model.getOutputType().equalsIgnoreCase("XML Schema")) {
                of =(OutputFormat)(Object) new XsdOutputFormat();
            } else if ((boolean)(Object)model.getOutputType().equalsIgnoreCase("Relax NG Compact Grammar")) {
                of =(OutputFormat)(Object) new RncOutputFormat();
            }
            ErrorHandlerImpl eh = new ErrorHandlerImpl(bao);
            SchemaCollection sc = null;
//            MyHelperClass view = new MyHelperClass();
            if (!(Boolean)(Object)view.getModel().isUseExternalDocument()) {
//                MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
                JTextComponent jtc =(JTextComponent)(Object) DefaultXPontusWindowImpl.getInstance().getDocumentTabContainer().getCurrentEditor();
                if (jtc == null) {
                    MyHelperClass XPontusComponentsUtils = new MyHelperClass();
                    XPontusComponentsUtils.showErrorMessage("No document opened!!!");
//                    MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
                    DefaultXPontusWindowImpl.getInstance().getStatusBar().setMessage("Error generating schema, Please see the messages window!");
                    return;
                }
                String suffixe =(String)(Object) model.getOutputType().toLowerCase();
                File tmp = File.createTempFile("schemageneratorhandler", +System.currentTimeMillis() + "." + suffixe);
                OutputStream m_outputStream = new FileOutputStream(tmp);
                CharsetDetector detector = new CharsetDetector();
                detector.setText(jtc.getText().getBytes());
                Writer m_writer = new OutputStreamWriter(m_outputStream, "UTF-8");
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(detector.detect().getReader(), m_writer);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(m_writer);
                try {
                    MyHelperClass UriOrFile = new MyHelperClass();
                    sc =(SchemaCollection)(Object) inFormat.load(UriOrFile.toUri(tmp.getAbsolutePath()), new String[0], model.getOutputType().toLowerCase(), eh);
                } catch (Exception ife) {
                    ife.printStackTrace();
                    StrBuilder stb = new StrBuilder();
                    stb.append("\nError loading input document!\n");
                    stb.append("Maybe the input type is invalid?\n");
                    stb.append("Please check again the input type list or trying validating your document\n");
                    throw new Exception(stb.toString());
                }
                tmp.deleteOnExit();
            } else {
                try {
//                    MyHelperClass view = new MyHelperClass();
                    sc =(SchemaCollection)(Object) inFormat.load(UriOrFile.toUri((String)(Object)view.getModel().getInputURI()), new String[0], model.getOutputType().toLowerCase(), eh);
                } catch (Exception ife) {
                    StrBuilder stb = new StrBuilder();
                    stb.append("\nError loading input document!\n");
                    stb.append("Maybe the input type is invalid?\n");
                    stb.append("Please check again the input type list or trying validating your document\n");
                    throw new Exception(stb.toString());
                }
            }
//            MyHelperClass view = new MyHelperClass();
            OutputDirectory od =(OutputDirectory)(Object) new LocalOutputDirectory(sc.getMainUri(), new File((String)(Object)view.getModel().getOutputURI()), model.getOutputType().toLowerCase(), DEFAULT_OUTPUT_ENCODING, DEFAULT_LINE_LENGTH, DEFAULT_INDENT);
            of.output(sc, od, new String[0], model.getInputType().toLowerCase(), eh);
            mconsole.println("Schema generated sucessfully!");
//            MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
            DefaultXPontusWindowImpl.getInstance().getStatusBar().setMessage("Schema generated sucessfully!");
            if ((boolean)(Object)model.isOpenInEditor()) {
                MyHelperClass XPontusComponentsUtils = new MyHelperClass();
                XPontusComponentsUtils.showWarningMessage("The document will NOT be opened in the editor sorry for that!\n You need to open it yourself.");
            }
        } catch (Exception ex) {
//            MyHelperClass DefaultXPontusWindowImpl = new MyHelperClass();
            DefaultXPontusWindowImpl.getInstance().getStatusBar().setMessage("Error generating schema, Please see the messages window!");
            StringWriter sw = new StringWriter();
            PrintWriter ps = new PrintWriter(sw);
            ex.printStackTrace(ps);
            StrBuilder sb = new StrBuilder();
            sb.append("Error generating schema");
            sb.appendNewLine();
            sb.append(new String(bao.toByteArray()));
            sb.appendNewLine();
            if (ex instanceof SAXParseException) {
                SAXParseException spe = (SAXParseException) ex;
                sb.append("Error around line " + spe.getLineNumber());
                sb.append(", column " + spe.getColumnNumber());
                sb.appendNewLine();
            }
            sb.append(sw.toString());
            MyHelperClass OutputDockable = new MyHelperClass();
            mconsole.println(sb.toString(), OutputDockable.RED_STYLE);
            MyHelperClass logger = new MyHelperClass();
            logger.error(sb.toString());
            try {
                ps.flush();
                ps.close();
                sw.flush();
                sw.close();
            } catch (IOException ioe) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error(ioe.getMessage());
            }
        } finally {
//            MyHelperClass MessagesWindowDockable = new MyHelperClass();
            console.setFocus(MessagesWindowDockable.DOCKABLE_ID);
            MyHelperClass Toolkit = new MyHelperClass();
            Toolkit.getDefaultToolkit().beep();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DOCKABLE_ID;
	public MyHelperClass RED_STYLE;
public MyHelperClass getCurrentDockable(){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass beep(){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }
	public MyHelperClass getCurrentEditor(){ return null; }
	public MyHelperClass getReader(){ return null; }
	public MyHelperClass getOutputURI(){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }
	public MyHelperClass toUri(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getInputURI(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, Writer o1){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass showErrorMessage(String o0){ return null; }
	public MyHelperClass getConsole(){ return null; }
	public MyHelperClass showWarningMessage(String o0){ return null; }
	public MyHelperClass getDocumentTabContainer(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isUseExternalDocument(){ return null; }
	public MyHelperClass getStatusBar(){ return null; }}

class ConsoleOutputWindow {

public MyHelperClass setFocus(MyHelperClass o0){ return null; }
	public MyHelperClass getDockableById(MyHelperClass o0){ return null; }}

class MessagesWindowDockable {

public MyHelperClass println(String o0){ return null; }
	public MyHelperClass println(String o0, MyHelperClass o1){ return null; }}

class IDocumentContainer {

}

class SchemaGenerationModel {

public MyHelperClass getOutputType(){ return null; }
	public MyHelperClass getInputType(){ return null; }
	public MyHelperClass isOpenInEditor(){ return null; }}

class InputFormat {

public MyHelperClass load(MyHelperClass o0, String[] o1, MyHelperClass o2, ErrorHandlerImpl o3){ return null; }}

class OutputFormat {

public MyHelperClass output(SchemaCollection o0, OutputDirectory o1, String[] o2, MyHelperClass o3, ErrorHandlerImpl o4){ return null; }}

class SAXParseInputFormat {

}

class CompactParseInputFormat {

}

class DtdInputFormat {

}

class XmlInputFormat {

}

class DtdOutputFormat {

}

class RngOutputFormat {

}

class XsdOutputFormat {

}

class RncOutputFormat {

}

class ErrorHandlerImpl {

ErrorHandlerImpl(ByteArrayOutputStream o0){}
	ErrorHandlerImpl(){}}

class SchemaCollection {

public MyHelperClass getMainUri(){ return null; }}

class JTextComponent {

public MyHelperClass getText(){ return null; }}

class CharsetDetector {

public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass detect(){ return null; }}

class StrBuilder {

public MyHelperClass appendNewLine(){ return null; }
	public MyHelperClass append(String o0){ return null; }}

class OutputDirectory {

}

class LocalOutputDirectory {

LocalOutputDirectory(MyHelperClass o0, File o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5){}
	LocalOutputDirectory(){}}

class SAXParseException extends Exception{
	public SAXParseException(String errorMessage) { super(errorMessage); }
}
