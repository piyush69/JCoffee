import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13757855 {

    public void process(@NotNull Template tpl, @NotNull Document model, @NotNull String packageName, @NotNull String outFileName, Map<String, String> xsltParam, String artifact) throws Throwable, ModelGenerationException {
        System.out.print("Processing with " + tpl);
        String destinationPath;
        switch(tpl.destination) {
            MyHelperClass target = new MyHelperClass();
            case target:
                if (tpl.path == null) {
                    MyHelperClass where = new MyHelperClass();
                    destinationPath = where.buildDir + separatorChar + "generated-sources" + separatorChar + GENERATION_TARGET;
                } else {
                    MyHelperClass where = new MyHelperClass();
                    destinationPath = where.buildDir;
                }
                break;
            MyHelperClass source = new MyHelperClass();
            case source:
                if (tpl.path == null) {
                    MyHelperClass where = new MyHelperClass();
                    destinationPath = where.sourceDir;
                } else {
                    destinationPath = "src";
                }
                break;
            MyHelperClass redora = new MyHelperClass();
            case redora:
                MyHelperClass where = new MyHelperClass();
                destinationPath = where.redoraDir;
                break;
            default:
                throw new IllegalArgumentException("Unused destination " + tpl.destination);
        }
        if (tpl.path == null) {
            MyHelperClass Destination = new MyHelperClass();
            if (tpl.destination == Destination.redora) destinationPath += separator + artifact; else destinationPath += separator + packageName.replace('.', separatorChar);
        } else {
            MyHelperClass separator = new MyHelperClass();
            destinationPath += separator + tpl.path.replace('/', separatorChar).replace('\\', separatorChar);
        }
        System.out.println(" to " + destinationPath + "..." + outFileName);
        MyHelperClass Destination = new MyHelperClass();
        if (tpl.destination == Destination.source) {
            if (new File(destinationPath, outFileName).exists()) {
                System.out.println("Stub " + outFileName + " already exists.");
                return;
            }
        }
        new File(destinationPath).mkdirs();
        InputStream in = null;
        Writer out;
        try {
            out = new FileWriter(new File(destinationPath, outFileName));
        } catch (IOException e) {
            MyHelperClass separatorChar = new MyHelperClass();
            throw new ModelGenerationException("Can't find: " + destinationPath + separatorChar + outFileName, e);
        }
        switch(tpl.type) {
            MyHelperClass freemarker = new MyHelperClass();
            case freemarker:
                Map<String, NodeModel> root = new HashMap<String, NodeModel>();
                MyHelperClass NodeModel = new MyHelperClass();
                root.put("doc", NodeModel.wrap(model));
                try {
                    Template template = freemarkerConf.getTemplate(tpl.getTemplateFileName());
                    template.process(root, out);
                } catch (ParseException e) {
                    throw new ModelGenerationException("There is an error in template: " + tpl + ". I found it when generating " + outFileName, e);
                } catch (IOException e) {
                    throw new ModelGenerationException("Can't find '" + tpl + "' when generating " + outFileName, e);
                } catch (TemplateException e) {
                    throw new ModelGenerationException("There is an error in template: " + tpl + ". I found it when generating " + outFileName, e);
                } catch (RuntimeException e) {
                    throw new ModelGenerationException("There is another error while trying this template: " + tpl + ". I found it when generating " + outFileName, e);
                }
                break;
            MyHelperClass xslt = new MyHelperClass();
            case xslt:
                try {
                    in = new FileInputStream(tpl.getAbsolutePath());
                    xsltTransform(model.getFirstChild(), in, out, xsltParam);
                } catch (FileNotFoundException e) {
                    throw new ModelGenerationException("Can't find " + tpl, e);
                } catch (TransformerException e) {
                    throw new ModelGenerationException("Sorry, i failed to use this template: " + tpl + ". It broke when generating " + outFileName, e);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
                }
                break;
            MyHelperClass copy = new MyHelperClass();
            case copy:
                try {
                    in = new FileInputStream(tpl.getAbsolutePath());
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                } catch (IOException e) {
                    throw new ModelGenerationException("File copy failed " + tpl.getTemplateFileName(), e);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
                }
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Template {

}

class Document {

}

class ModelGenerationException extends Exception{
	public ModelGenerationException(String errorMessage) { super(errorMessage); }
}

class NotNull {

}

class NodeModel {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class TemplateException extends Exception{
	public TemplateException(String errorMessage) { super(errorMessage); }
}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}
