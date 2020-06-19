import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23094550 {
public MyHelperClass deleteDir(File o0){ return null; }
public MyHelperClass FileAccess;
public MyHelperClass TagInspector;
	public MyHelperClass Encoder;
	public MyHelperClass Debug;

    public StringBuffer render(RenderEngine c)  throws Throwable {
        String logTime = null;
        if (c.getWorkerContext() != null) {
            logTime =(String)(Object) c.getWorkerContext().getWorkerStart();
        }
        if ((boolean)(Object)c.isBreakState() || !(Boolean)(Object)c.canRender("u")) {
            return new StringBuffer();
        }
        StringBuffer buffer = new StringBuffer();
        MyHelperClass varname = new MyHelperClass();
        varname = TagInspector.processElement(varname, c);
        MyHelperClass action = new MyHelperClass();
        action = TagInspector.processElement(action, c);
        MyHelperClass filemode = new MyHelperClass();
        filemode = TagInspector.processElement(filemode, c);
        MyHelperClass xmlparse = new MyHelperClass();
        xmlparse = TagInspector.processElement(xmlparse, c);
        MyHelperClass encoding = new MyHelperClass();
        encoding = TagInspector.processElement(encoding, c);
        MyHelperClass decoding = new MyHelperClass();
        decoding = TagInspector.processElement(decoding, c);
        MyHelperClass filter = new MyHelperClass();
        filter = TagInspector.processElement(filter, c);
        MyHelperClass sort = new MyHelperClass();
        sort = TagInspector.processElement(sort, c);
        MyHelperClass useDocroot = new MyHelperClass();
        useDocroot = TagInspector.processElement(useDocroot, c);
        MyHelperClass useFilename = new MyHelperClass();
        useFilename = TagInspector.processElement(useFilename, c);
        MyHelperClass useDest = new MyHelperClass();
        useDest = TagInspector.processElement(useDest, c);
        MyHelperClass xmlOutput = new MyHelperClass();
        xmlOutput = TagInspector.processElement(xmlOutput, c);
        MyHelperClass renderOutput = new MyHelperClass();
        renderOutput = TagInspector.processElement(renderOutput, c);
        MyHelperClass callProc = new MyHelperClass();
        callProc = TagInspector.processElement(callProc, c);
        MyHelperClass vartype = new MyHelperClass();
        vartype = TagInspector.processElement(vartype, c);
//        MyHelperClass sort = new MyHelperClass();
        if (sort == null || sort.equals("")) {
//            MyHelperClass sort = new MyHelperClass();
            sort =(MyHelperClass)(Object) "asc";
        }
//        MyHelperClass useFilename = new MyHelperClass();
        if (useFilename.equals("") && !(Boolean)(Object)action.equalsIgnoreCase("listing")) {
            return new StringBuffer();
        }
        boolean isRooted = true;
//        MyHelperClass useDocroot = new MyHelperClass();
        if ((boolean)(Object)useDocroot.equalsIgnoreCase("true")) {
            if ((boolean)(Object)c.getVendContext().getVend().getIgnorableDocroot(c.getClientContext().getMatchedHost())) {
                isRooted = false;
            }
        }
//        MyHelperClass useFilename = new MyHelperClass();
        if (isRooted && ((int)(Object)useFilename.indexOf("/") == -1 || (boolean)(Object)useFilename.startsWith("./"))) {
//            MyHelperClass useFilename = new MyHelperClass();
            if (c.getWorkerContext() != null && (boolean)(Object)useFilename.startsWith("./")) {
//                MyHelperClass useFilename = new MyHelperClass();
                useFilename =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) c.getWorkerContext().getClientContext().getPostVariable("current_path") + (int)(Object)useFilename.substring(2);
//                MyHelperClass useFilename = new MyHelperClass();
                Debug.inform("CWD path specified in filename, rewritten to '" + useFilename + "'");
//            MyHelperClass useFilename = new MyHelperClass();
            } else if (c.getWorkerContext() != null &&(int)(Object) useFilename.indexOf("/") == -1) {
//                MyHelperClass useFilename = new MyHelperClass();
                useFilename =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) c.getWorkerContext().getClientContext().getPostVariable("current_path") + (int)(Object)useFilename;
//                MyHelperClass useFilename = new MyHelperClass();
                Debug.inform("No path specified in filename, rewritten to '" + useFilename + "'");
            } else {
                MyHelperClass Debug = new MyHelperClass();
                Debug.inform("No path specified in filename, no worker context, not rewriting filename.");
            }
        }
        StringBuffer filenameData = null;
        StringBuffer contentsData = null;
        StringBuffer fileDestData = null;
        MyHelperClass TagInspector = new MyHelperClass();
        contentsData =(StringBuffer)(Object) TagInspector.processBody(this, c);
//        MyHelperClass useFilename = new MyHelperClass();
        filenameData = new StringBuffer((int)(Object)useFilename);
//        MyHelperClass useDest = new MyHelperClass();
        fileDestData = new StringBuffer((int)(Object)useDest);
        String currentDocroot = null;
        if (c.getWorkerContext() == null) {
            if (c.getRenderContext().getCurrentDocroot() == null) {
                currentDocroot = ".";
            } else {
                currentDocroot =(String)(Object) c.getRenderContext().getCurrentDocroot();
            }
        } else {
            currentDocroot =(String)(Object) c.getWorkerContext().getDocRoot();
        }
        if (!isRooted) {
            currentDocroot = "";
        }
//        MyHelperClass useDocroot = new MyHelperClass();
        if ((boolean)(Object)useDocroot.equalsIgnoreCase("true")) {
            if ((boolean)(Object)c.getVendContext().getVend().getIgnorableDocroot(c.getClientContext().getMatchedHost())) {
                isRooted = false;
                currentDocroot = "";
            }
        }
        if (!currentDocroot.endsWith("/")) {
            if (!currentDocroot.equals("") && currentDocroot.length() > 0) {
                currentDocroot += "/";
            }
        }
        if (filenameData != null) {
            filenameData = new StringBuffer(filenameData.toString().replaceAll("\\.\\.", ""));
        }
        if (fileDestData != null) {
            fileDestData = new StringBuffer(fileDestData.toString().replaceAll("\\.\\.", ""));
        }
//        MyHelperClass action = new MyHelperClass();
        if ((boolean)(Object)action.equalsIgnoreCase("read")) {
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            FileInputStream is = null;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte data[] = null;
            boolean vfsLoaded = false;
            try {
                data =(byte[])(Object) c.getVendContext().getFileAccess().getFile(c.getWorkerContext(), filenameData.toString().replaceAll("\\.\\.", ""), c.getClientContext().getMatchedHost(), c.getVendContext().getVend().getRenderExtension(c.getClientContext().getMatchedHost()), null);
                bos.write(data, 0, data.length);
                vfsLoaded = true;
            } catch (Exception e) {
                MyHelperClass Debug = new MyHelperClass();
                Debug.user(logTime, "Included file attempt with VFS of file '" + filenameData + "' failed: " + e);
            }
            if (data == null) {
                try {
                    is = new FileInputStream(file);
                } catch (Exception e) {
                    MyHelperClass Debug = new MyHelperClass();
                    Debug.user(logTime, "Unable to render: Filename '" + currentDocroot + filenameData + "' does not exist.");
                    return new StringBuffer();
                }
            }
//            MyHelperClass xmlparse = new MyHelperClass();
            if (xmlparse == null || xmlparse.equals("")) {
                if (data == null) {
//                    MyHelperClass varname = new MyHelperClass();
                    Debug.user(logTime, "Opening filename '" + currentDocroot + filenameData + "' for reading into buffer '" + varname + "'");
                    data = new byte[32768];
                    int totalBytesRead = 0;
                    while (true) {
                        int bytesRead;
                        try {
                            bytesRead = is.read(data);
                            bos.write(data, 0, bytesRead);
                        } catch (Exception e) {
                            break;
                        }
                        if (bytesRead <= 0) {
                            break;
                        }
                        totalBytesRead += bytesRead;
                    }
                }
                byte docOutput[] = bos.toByteArray();
//                MyHelperClass renderOutput = new MyHelperClass();
                if (renderOutput != null && (boolean)(Object)renderOutput.equalsIgnoreCase("ssp")) {
                    MyHelperClass FileAccess = new MyHelperClass();
                    String outputData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n\n" + new String((String)(Object)FileAccess.getDefault().processServerPageData(c.getWorkerContext(), docOutput));
                    docOutput = outputData.getBytes();
                }
                MyHelperClass Debug = new MyHelperClass();
                Debug.user(logTime, "File read complete: " + docOutput.length + " byte(s)");
                if (is != null) {
                    try {
                        is.close();
                    } catch (Exception e) {
                    }
                }
                is = null;
//                MyHelperClass encoding = new MyHelperClass();
                if (encoding != null && (boolean)(Object)encoding.equalsIgnoreCase("url")) {
//                    MyHelperClass varname = new MyHelperClass();
                    if (!varname.equals("")) {
//                        MyHelperClass varname = new MyHelperClass();
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
//                            MyHelperClass varname = new MyHelperClass();
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
//                        MyHelperClass varname = new MyHelperClass();
                        c.getVariableContainer().setVariable(varname, Encoder.URLEncode(new String(docOutput)));
                    } else {
//                        MyHelperClass callProc = new MyHelperClass();
                        if (callProc != null && !callProc.equals("")) {
                            Call call = new Call();
//                            MyHelperClass callProc = new MyHelperClass();
                            call.callProcedure(c, null, null, callProc, null);
                        }
                        MyHelperClass Encoder = new MyHelperClass();
                        return new StringBuffer((int)(Object)Encoder.URLEncode(new String(docOutput)));
                    }
//                MyHelperClass encoding = new MyHelperClass();
                } else if (encoding != null && (boolean)(Object)encoding.equalsIgnoreCase("xml")) {
//                    MyHelperClass varname = new MyHelperClass();
                    if (!varname.equals("")) {
//                        MyHelperClass varname = new MyHelperClass();
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
//                            MyHelperClass varname = new MyHelperClass();
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
//                        MyHelperClass varname = new MyHelperClass();
                        c.getVariableContainer().setVariable(varname, Encoder.XMLEncode(new String(docOutput)));
                    } else {
                        if (callProc != null && !callProc.equals("")) {
                            Call call = new Call();
                            call.callProcedure(c, null, null, callProc, null);
                        }
                        return new StringBuffer((int)(Object)Encoder.XMLEncode(new String(docOutput)));
                    }
                } else if (encoding != null && (boolean)(Object)encoding.equalsIgnoreCase("base64")) {
                    if (!varname.equals("")) {
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
                        c.getVariableContainer().setVariable(varname, Base64.encode(docOutput));
                    } else {
                        if (callProc != null && !callProc.equals("")) {
                            Call call = new Call();
                            call.callProcedure(c, null, null, callProc, null);
                        }
                        return new StringBuffer((int)(Object)Base64.encode(docOutput));
                    }
                } else if (encoding != null && ((Boolean)(Object)encoding.equalsIgnoreCase("javascript") || (Boolean)(Object)encoding.equalsIgnoreCase("js"))) {
                    if (!varname.equals("")) {
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
                        c.getVariableContainer().setVariable(varname, Encoder.JavascriptEncode(new String(docOutput)));
                    } else {
                        if (callProc != null && !callProc.equals("")) {
                            Call call = new Call();
                            call.callProcedure(c, null, null, callProc, null);
                        }
                        return new StringBuffer((int)(Object)Encoder.JavascriptEncode(new String(docOutput)));
                    }
                } else {
                    if (!varname.equals("")) {
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
                        c.getVariableContainer().setVariable(varname, new String(docOutput));
                    } else {
                        if (callProc != null && !callProc.equals("")) {
                            Call call = new Call();
                            call.callProcedure(c, null, null, callProc, null);
                        }
                        return new StringBuffer(new String(docOutput));
                    }
                }
            } else {
                RenderEngine engine = new RenderEngine(null);
                DocumentEngine docEngine = null;
                try {
                    if (vfsLoaded) {
                        ByteArrayInputStream bais = new ByteArrayInputStream(data);
                        docEngine = new DocumentEngine(bais);
                    } else {
                        docEngine = new DocumentEngine(is);
                    }
                } catch (Exception e) {
                    c.setExceptionState(true, "XML parse of data read from file failed: " + e.getMessage());
                }
                engine.setDocumentEngine(docEngine);
                c.addNodeSet(varname, docEngine.rootTag.thisNode);
            }
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                }
            }
            is = null;
            if (callProc != null && !callProc.equals("")) {
                Call call = new Call();
                call.callProcedure(c, null, null, callProc, null);
            }
            return new StringBuffer();
        } else if ((boolean)(Object)action.equalsIgnoreCase("write")) {
            try {
                String rootDir = filenameData.toString();
                if (rootDir.lastIndexOf("/") != -1 && rootDir.lastIndexOf("/") != 0) {
                    rootDir = rootDir.substring(0, rootDir.lastIndexOf("/"));
                    java.io.File mkdirFile = new java.io.File(currentDocroot + rootDir);
                    if (!mkdirFile.mkdirs()) {
                        Debug.inform("Unable to create directory '" + currentDocroot + rootDir + "'");
                    } else {
                        Debug.inform("Created directory '" + currentDocroot + rootDir + "'");
                    }
                }
                java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
                FileOutputStream fos = null;
                if (file == null) {
                    c.setExceptionState(true, "Unable to write to file '" + filenameData + "': Cannot write to location specified");
                    return new StringBuffer();
                } else if (file.isDirectory()) {
                    c.setExceptionState(true, "Unable to write to file '" + filenameData + "': Is a directory.");
                    return new StringBuffer();
                }
                if ((boolean)(Object)filemode.equalsIgnoreCase("append")) {
                    fos = new FileOutputStream(file, true);
                } else {
                    fos = new FileOutputStream(file, false);
                }
                if (decoding != null && !decoding.equals("")) {
                    if ((boolean)(Object)decoding.equalsIgnoreCase("base64")) {
                        try {
                            byte contentsDecoded[] =(byte[])(Object) Base64.decode(contentsData.toString().getBytes());
                            fos.write(contentsDecoded);
                        } catch (Exception e) {
                            c.setExceptionState(true, "Encoded data in &lt;content&gt; element does not contain valid Base64-" + "encoded data.");
                        }
                    } else {
                        fos.write(contentsData.toString().getBytes());
                    }
                } else {
                    fos.write(contentsData.toString().getBytes());
                }
                try {
                    fos.flush();
                } catch (IOException e) {
                    Debug.inform("Unable to flush output data: " + e.getMessage());
                }
                fos.close();
                Debug.user(logTime, "Wrote contents to filename '" + currentDocroot + filenameData + "' (length=" + contentsData.length() + ")");
            } catch (IOException e) {
                c.setExceptionState(true, "Unable to write to filename '" + filenameData + "': " + e.getMessage());
            } catch (Exception e) {
                c.setExceptionState(true, "Unable to write to filename '" + filenameData + "': " + e.getMessage());
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("listing")) {
            String filenameDataString = filenameData.toString();
            if (filenameDataString.equals("")) {
                filenameDataString =(String)(Object) c.getClientContext().getPostVariable("current_path");
            }
            if (filenameDataString == null) {
                c.setExceptionState(true, "Filename cannot be blank when listing.");
                return new StringBuffer();
            }
            while (filenameDataString.endsWith("/")) {
                filenameDataString = filenameDataString.substring(0, filenameDataString.length() - 1);
            }
            Vector fileList = new Vector();
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            String curDirname = filenameData.toString();
            String parentDirectory = null;
            String[] dirEntries = curDirname.split("/");
            int numSlashes = 0;
            for (int i = 0; i < curDirname.length(); i++) {
                if (curDirname.toString().charAt(i) == '/') {
                    numSlashes++;
                }
            }
            parentDirectory = "/";
            if (numSlashes > 1) {
                for (int i = 0; i < (dirEntries.length - 1); i++) {
                    if (dirEntries[i] != null && !dirEntries[i].equals("")) {
                        parentDirectory += dirEntries[i] + "/";
                    }
                }
            }
            if (parentDirectory.length() > 1 && parentDirectory.endsWith("/")) {
                parentDirectory = parentDirectory.substring(0, parentDirectory.length() - 1);
            }
            if (c.getVendContext() != null && c.getVendContext().getFileAccess() != null && c.getVendContext().getFileAccess().getVFSType(filenameData.toString(), c.getClientContext().getMatchedHost()) == FileAccess.TYPE_JAR) {
                Vector listFiles =(Vector)(Object) c.getVendContext().getFileAccess().listFiles(filenameData.toString(), c.getClientContext().getMatchedHost());
                Object[] list = listFiles.toArray();
                int depth = 0;
                for (int i = 0; i < filenameData.toString().length(); i++) {
                    if (filenameData.toString().charAt(i) == '/') {
                        depth++;
                    }
                }
                buffer = new StringBuffer();
                buffer.append("<listing filter=\"");
                buffer.append(filter);
                buffer.append("\" path=\"");
                buffer.append(filenameData);
                if (parentDirectory != null) {
                    buffer.append("\" parent=\"");
                    buffer.append(parentDirectory);
                }
                buffer.append("\">\n");
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(filter)", false, filter);
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(path)", false, filenameData);
                if (parentDirectory != null) {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, parentDirectory);
                } else {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, "/");
                }
                if ((boolean)(Object)sort.equalsIgnoreCase("asc")) {
                    Arrays.sort(list, new ZipSorterAscending());
                } else {
                    Arrays.sort(list, new ZipSorterDescending());
                }
                for (int i = 0; i < list.length; i++) {
                    ZipEntry zEntry = (ZipEntry) list[i];
                    String zipFile = filenameData.toString() + "/" + zEntry.getName();
                    String displayFilename = zipFile.replaceFirst(filenameData.toString(), "");
                    int curDepth = 0;
                    if (zipFile.equalsIgnoreCase(".acl") || zipFile.equalsIgnoreCase("access.list") || zipFile.equalsIgnoreCase("application.inc") || zipFile.equalsIgnoreCase("global.inc") || zipFile.indexOf("/.proc") != -1 || zipFile.indexOf("/procedures") != -1) {
                        continue;
                    }
                    for (int x = 0; x < displayFilename.length(); x++) {
                        if (displayFilename.charAt(x) == '/') {
                            curDepth++;
                        }
                    }
                    if (zipFile.startsWith(filenameData.toString())) {
                        String fileLength = "" + zEntry.getSize();
                        String fileType = "file";
                        if (curDepth == depth) {
                            if ((boolean)(Object)zEntry.isDirectory()) {
                                fileType = "directory";
                            } else {
                                fileType = "file";
                            }
                            String fileMode = "read-only";
                            String fileTime = Long.toString((long)(Object)zEntry.getTime());
                            buffer.append("    <file name=\"");
                            buffer.append(displayFilename);
                            buffer.append("\" length=\"");
                            buffer.append(fileLength);
                            buffer.append("\" type=\"");
                            buffer.append(fileType);
                            buffer.append("\" mode=\"");
                            buffer.append(fileMode);
                            buffer.append("\" modtime=\"");
                            buffer.append(fileTime);
                            buffer.append("\"/>\n");
                            c.getVariableContainer().setVariable(c, varname + "(" + displayFilename + ")(length)", false, "" + fileLength);
                            c.getVariableContainer().setVariable(c, varname + "(" + displayFilename + ")(type)", false, fileType);
                            c.getVariableContainer().setVariable(c, varname + "(" + displayFilename + ")(mode)", false, fileMode);
                            c.getVariableContainer().setVariable(c, varname + "(" + displayFilename + ")(time)", false, fileTime);
                        }
                    } else {
                        if (curDepth == depth) {
                            fileList.add(zipFile);
                        }
                    }
                }
                buffer.append("</listing>");
                if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                    if ((boolean)(Object)c.isProtectedVariable(varname)) {
                        c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                        return new StringBuffer();
                    }
                    c.getVariableContainer().setVariable(varname, buffer.toString());
                    return new StringBuffer();
                }
                c.getVariableContainer().setVector(varname, fileList);
            } else if (c.getVendContext() != null && c.getVendContext().getFileAccess() != null && c.getVendContext().getFileAccess().getVFSType(filenameData.toString(), c.getClientContext().getMatchedHost()) == FileAccess.TYPE_FS) {
                Vector listFiles =(Vector)(Object) c.getVendContext().getFileAccess().listFiles(filenameData.toString(), c.getClientContext().getMatchedHost());
                Object[] list = listFiles.toArray();
                java.io.File[] filesorted = new java.io.File[list.length];
                for (int i = 0; i < list.length; i++) {
                    filesorted[i] = (java.io.File) list[i];
                }
                if ((boolean)(Object)sort.equalsIgnoreCase("asc")) {
                    Arrays.sort(filesorted, new FileSorterAscending());
                } else {
                    Arrays.sort(filesorted,(FileSorterAscending)(Object) new FileSorterDescending());
                }
                buffer = new StringBuffer();
                buffer.append("<listing filter=\"");
                buffer.append(filter);
                buffer.append("\" path=\"");
                buffer.append(filenameData);
                if (parentDirectory != null) {
                    buffer.append("\" parent=\"");
                    buffer.append(parentDirectory);
                }
                buffer.append("\">\n");
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(filter)", false, filter);
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(path)", false, filenameData);
                if (parentDirectory != null) {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, parentDirectory);
                } else {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, "/");
                }
                for (int i = 0; i < filesorted.length; i++) {
                    java.io.File zEntry = filesorted[i];
                    String filename = filenameData.toString() + "/" + zEntry.getName();
                    if (filename.equalsIgnoreCase(".acl") || filename.equalsIgnoreCase("access.list") || filename.equalsIgnoreCase("application.inc") || filename.equalsIgnoreCase("global.inc") || filename.indexOf("/.proc") != -1 || filename.indexOf("/procedures") != -1) {
                        continue;
                    }
                    String displayFilename = filename.replaceFirst(filenameData.toString(), "");
                    String fileLength = "" + zEntry.length();
                    String fileType = "file";
                    if (zEntry.isDirectory()) {
                        fileType = "directory";
                    } else if (zEntry.isFile()) {
                        fileType = "file";
                    } else if (zEntry.isHidden()) {
                        fileType = "hidden";
                    } else if (zEntry.isAbsolute()) {
                        fileType = "absolute";
                    }
                    String fileMode = "read-only";
                    if (zEntry.canRead() && !zEntry.canWrite()) {
                        fileMode = "read-only";
                    } else if (!zEntry.canRead() && zEntry.canWrite()) {
                        fileMode = "write-only";
                    } else if (zEntry.canRead() && zEntry.canWrite()) {
                        fileMode = "read/write";
                    }
                    String fileTime = Long.toString(zEntry.lastModified());
                    if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                        buffer.append("    <file name=\"");
                        buffer.append(filename);
                        buffer.append("\" length=\"");
                        buffer.append(fileLength);
                        buffer.append("\" type=\"");
                        buffer.append(fileType);
                        buffer.append("\" mode=\"");
                        buffer.append(fileMode);
                        buffer.append("\" modtime=\"");
                        buffer.append(fileTime);
                        buffer.append("\"/>\n");
                    } else {
                        fileList.add(zEntry);
                    }
                    c.getVariableContainer().setVariable(c, varname + "(" + filename + ")(length)", false, "" + fileLength);
                    c.getVariableContainer().setVariable(c, varname + "(" + filename + ")(type)", false, fileType);
                    c.getVariableContainer().setVariable(c, varname + "(" + filename + ")(mode)", false, fileMode);
                    c.getVariableContainer().setVariable(c, varname + "(" + filename + ")(time)", false, fileTime);
                }
                buffer.append("</listing>");
                if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                    if ((boolean)(Object)c.isProtectedVariable(varname)) {
                        c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                        return new StringBuffer();
                    }
                    c.getVariableContainer().setVariable(varname, buffer.toString());
                    return new StringBuffer();
                }
                c.getVariableContainer().setVector(varname, fileList);
            } else {
                String[] fileStringList = null;
                if (!filter.equals("")) {
                    fileStringList = file.list((FilenameFilter)(Object)new ListFilter(filter));
                } else {
                    fileStringList = file.list();
                }
                if ((boolean)(Object)sort.equalsIgnoreCase("asc")) {
                    Arrays.sort((Object[])(Object)(File[])(Object)fileStringList,(ZipSorterDescending)(Object) new StringSorterAscending());
                } else {
                    Arrays.sort((Object[])(Object)(File[])(Object)fileStringList,(ZipSorterDescending)(Object) new StringSorterDescending());
                }
                if (fileStringList == null) {
                    buffer.append("<listing filter=\"");
                    buffer.append(filter);
                    buffer.append("\" path=\"");
                    buffer.append(filenameData);
                    if (parentDirectory != null) {
                        buffer.append("\" parent=\"");
                        buffer.append(parentDirectory);
                    }
                    buffer.append("\"/>\n");
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(filter)", false, filter);
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(path)", false, filenameData);
                    if (parentDirectory != null) {
                        c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, parentDirectory);
                    } else {
                        c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, "/");
                    }
                    if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                        if ((boolean)(Object)c.isProtectedVariable(varname)) {
                            c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                            return new StringBuffer();
                        }
                        c.getVariableContainer().setVariable(varname, buffer.toString());
                    } else {
                        c.getVariableContainer().setVector(varname, fileList);
                    }
                    return new StringBuffer();
                } else {
                    Debug.user(logTime, "Directory '" + currentDocroot + filenameData + "' returns " + fileStringList.length + " entry(ies)");
                }
                buffer = new StringBuffer();
                buffer.append("<listing filter=\"");
                buffer.append(filter);
                buffer.append("\" path=\"");
                buffer.append(filenameData);
                if (parentDirectory != null) {
                    buffer.append("\" parent=\"");
                    buffer.append(parentDirectory);
                }
                buffer.append("\">\n");
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(filter)", false, filter);
                c.getVariableContainer().setVariable(c, varname + "(fileinfo)(path)", false, filenameData);
                if (parentDirectory != null) {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, parentDirectory);
                } else {
                    c.getVariableContainer().setVariable(c, varname + "(fileinfo)(parent)", false, "/");
                }
                for (int i = 0; i < fileStringList.length; i++) {
                    file = new java.io.File(currentDocroot + filenameData.toString() + "/" + fileStringList[i]);
                    String fileLength = Long.toString(file.length());
                    String fileType = "file";
                    if (file.isDirectory()) {
                        fileType = "directory";
                    } else if (file.isFile()) {
                        fileType = "file";
                    } else if (file.isHidden()) {
                        fileType = "hidden";
                    } else if (file.isAbsolute()) {
                        fileType = "absolute";
                    }
                    String fileMode = "read-only";
                    if (file.canRead() && !file.canWrite()) {
                        fileMode = "read-only";
                    } else if (!file.canRead() && file.canWrite()) {
                        fileMode = "write-only";
                    } else if (file.canRead() && file.canWrite()) {
                        fileMode = "read/write";
                    }
                    String fileTime = Long.toString(file.lastModified());
                    if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                        buffer.append("    <file name=\"");
                        buffer.append(fileStringList[i]);
                        buffer.append("\" length=\"");
                        buffer.append(fileLength);
                        buffer.append("\" type=\"");
                        buffer.append(fileType);
                        buffer.append("\" mode=\"");
                        buffer.append(fileMode);
                        buffer.append("\" modtime=\"");
                        buffer.append(fileTime);
                        buffer.append("\"/>\n");
                    } else {
                        fileList.add(fileStringList[i]);
                    }
                    c.getVariableContainer().setVariable(c, varname + "(" + fileStringList[i] + ")(length)", false, "" + fileLength);
                    c.getVariableContainer().setVariable(c, varname + "(" + fileStringList[i] + ")(type)", false, fileType);
                    c.getVariableContainer().setVariable(c, varname + "(" + fileStringList[i] + ")(mode)", false, fileMode);
                    c.getVariableContainer().setVariable(c, varname + "(" + fileStringList[i] + ")(time)", false, fileTime);
                }
                buffer.append("</listing>");
                if ((boolean)(Object)xmlOutput.equalsIgnoreCase("true")) {
                    if ((boolean)(Object)c.isProtectedVariable(varname)) {
                        c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                        return new StringBuffer();
                    }
                    c.getVariableContainer().setVariable(varname, buffer.toString());
                    return new StringBuffer();
                }
                c.getVariableContainer().setVector(varname, fileList);
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("delete")) {
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            if (file.isDirectory()) {
                boolean success =(boolean)(Object) deleteDir(new java.io.File(currentDocroot + filenameData.toString()));
                if (!success) {
                    c.setExceptionState(true, "Unable to delete '" + currentDocroot + filenameData + "'");
                }
            } else {
                String filenamePattern = null;
                if (filenameData.toString().indexOf("/") != -1) {
                    filenamePattern = filenameData.toString().substring(filenameData.toString().lastIndexOf("/") + 1);
                }
                String filenameDirectory = currentDocroot;
                if (filenameData.toString().indexOf("/") != -1) {
                    filenameDirectory += filenameData.substring(0, filenameData.toString().lastIndexOf("/"));
                }
                String[] fileStringList = null;
                file = new java.io.File(filenameDirectory);
                fileStringList = file.list((FilenameFilter)(Object)new ListFilter(filenamePattern));
                for (int i = 0; i < fileStringList.length; i++) {
                    (new java.io.File(filenameDirectory + "/" + fileStringList[i])).delete();
                }
            }
        } else if ((Boolean)(Object)action.equalsIgnoreCase("rename") || (Boolean)(Object)action.equalsIgnoreCase("move")) {
            if (fileDestData.equals("")) {
                c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + "-result", filenameData + ": File operation failed: No destination filename given.");
                return new StringBuffer();
            }
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            boolean success = file.renameTo(new java.io.File(currentDocroot + fileDestData.toString(), file.getName()));
            if (!success) {
                c.setExceptionState(true, "Unable to rename '" + currentDocroot + filenameData + "' to '" + currentDocroot + fileDestData + "'");
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("copy")) {
            if (fileDestData.equals("")) {
                c.setExceptionState(true, "File copy operation failed for file '" + filenameData + "': No destination file specified.");
                return new StringBuffer();
            }
            FileChannel srcChannel;
            FileChannel destChannel;
            String filename = null;
            filename = currentDocroot + filenameData.toString();
            if (vartype != null && (boolean)(Object)vartype.equalsIgnoreCase("file")) {
                if ((int)(Object)useFilename.indexOf("/") != -1) {
                    useFilename = useFilename.substring((int)(Object)useFilename.lastIndexOf("/") + 1);
                }
                filename =(String)(Object) c.getVariableContainer().getFileVariable(useFilename);
            }
            try {
                Debug.debug("Copying from file '" + filename + "' to '" + fileDestData.toString() + "'");
                srcChannel = (FileChannel)(Object)new FileInputStream(filename).getChannel();
            } catch (IOException e) {
                c.setExceptionState(true, "Filecopy from '" + filenameData + "' failed to read: " + e.getMessage());
                return new StringBuffer();
            }
            try {
                destChannel = (FileChannel)(Object)new FileOutputStream(currentDocroot + fileDestData.toString()).getChannel();
            } catch (IOException e) {
                c.setExceptionState(true, "Filecopy to '" + fileDestData + "' failed to write: " + e.getMessage());
                return new StringBuffer();
            }
            try {
                destChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                destChannel.close();
                if (varname != null) {
                    c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + "-result", filenameData + " copy to " + fileDestData + ": File copy succeeded.");
                } else {
                    return new StringBuffer("true");
                }
            } catch (IOException e) {
                c.setExceptionState(true, "Filecopy from '" + filenameData + "' to '" + fileDestData + "' failed: " + e.getMessage());
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("exists")) {
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            if (file.exists()) {
                if (varname != null) {
                    if ((boolean)(Object)c.isProtectedVariable(varname)) {
                        c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                        return new StringBuffer();
                    }
                    c.getVariableContainer().setVariable(varname, "true");
                } else {
                    return new StringBuffer("true");
                }
            } else {
                if (varname != null) {
                    if ((boolean)(Object)c.isProtectedVariable(varname)) {
                        c.setExceptionState(true, "Attempted to modify a read-only variable '" + varname + "'");
                        return new StringBuffer();
                    }
                    c.getVariableContainer().setVariable(varname, "false");
                } else {
                    return new StringBuffer("false");
                }
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("mkdir")) {
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            if (file.mkdirs()) {
                if (varname != null) {
                    c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + "-result", "created");
                } else {
                    return new StringBuffer("true");
                }
            } else {
                c.setExceptionState(true, "Unable to create directory '" + filenameData + "'");
            }
        } else if ((boolean)(Object)action.equalsIgnoreCase("info")) {
            java.io.File file = new java.io.File(currentDocroot + filenameData.toString());
            String fileLength = Long.toString(file.length());
            String fileType = "file";
            if (file.isAbsolute()) {
                fileType = "absolute";
            } else if (file.isDirectory()) {
                fileType = "directory";
            } else if (file.isFile()) {
                fileType = "file";
            } else if (file.isHidden()) {
                fileType = "hidden";
            }
            String fileMode = "read-only";
            if (file.canRead() && !file.canWrite()) {
                fileMode = "read-only";
            } else if (!file.canRead() && file.canWrite()) {
                fileMode = "write-only";
            } else if (file.canRead() && file.canWrite()) {
                fileMode = "read/write";
            }
            String fileTime = Long.toString(file.lastModified());
            if (varname != null && !varname.equals("")) {
                c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + ".length", fileLength);
                c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + ".type", fileType);
                c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + ".mode", fileMode);
                c.getVariableContainer().setVariable((MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)varname + ".modtime", fileTime);
            } else {
                buffer = new StringBuffer();
                buffer.append("<file name=\"");
                buffer.append(filenameData);
                buffer.append("\" length=\"");
                buffer.append(fileLength);
                buffer.append("\" type=\"");
                buffer.append(fileType);
                buffer.append("\" mode=\"");
                buffer.append(fileMode);
                buffer.append("\" modtime=\"");
                buffer.append(fileTime);
                buffer.append("\"/>\n");
                return buffer;
            }
        }
        if (callProc != null && !callProc.equals("")) {
            Call call = new Call();
            call.callProcedure(c, null, null, callProc, null);
        }
        return new StringBuffer();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_FS;
	public MyHelperClass thisNode;
	public MyHelperClass TYPE_JAR;
public MyHelperClass getCurrentDocroot(){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass getVend(){ return null; }
	public MyHelperClass getClientContext(){ return null; }
	public MyHelperClass getWorkerStart(){ return null; }
	public MyHelperClass setVariable(RenderEngine o0, String o1, boolean o2, MyHelperClass o3){ return null; }
	public MyHelperClass getMatchedHost(){ return null; }
	public MyHelperClass setVariable(RenderEngine o0, String o1, boolean o2, String o3){ return null; }
	public MyHelperClass getPostVariable(String o0){ return null; }
	public MyHelperClass getFileVariable(MyHelperClass o0){ return null; }
	public MyHelperClass processServerPageData(MyHelperClass o0, byte[] o1){ return null; }
	public MyHelperClass setVariable(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getVFSType(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDocRoot(){ return null; }
	public MyHelperClass getIgnorableDocroot(MyHelperClass o0){ return null; }
	public MyHelperClass processBody(c23094550 o0, RenderEngine o1){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass JavascriptEncode(String o0){ return null; }
	public MyHelperClass URLEncode(String o0){ return null; }
	public MyHelperClass getRenderExtension(MyHelperClass o0){ return null; }
	public MyHelperClass listFiles(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getFileAccess(){ return null; }
	public MyHelperClass getFile(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3, Object o4){ return null; }
	public MyHelperClass setVariable(RenderEngine o0, String o1, boolean o2, StringBuffer o3){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass user(String o0, String o1){ return null; }
	public MyHelperClass setVariable(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass processElement(MyHelperClass o0, RenderEngine o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass XMLEncode(String o0){ return null; }
	public MyHelperClass setVector(MyHelperClass o0, Vector o1){ return null; }
	public MyHelperClass inform(String o0){ return null; }}

class RenderEngine {

RenderEngine(){}
	RenderEngine(Object o0){}
	public MyHelperClass canRender(String o0){ return null; }
	public MyHelperClass isProtectedVariable(MyHelperClass o0){ return null; }
	public MyHelperClass setDocumentEngine(DocumentEngine o0){ return null; }
	public MyHelperClass getVariableContainer(){ return null; }
	public MyHelperClass addNodeSet(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getWorkerContext(){ return null; }
	public MyHelperClass getVendContext(){ return null; }
	public MyHelperClass isBreakState(){ return null; }
	public MyHelperClass getClientContext(){ return null; }
	public MyHelperClass getRenderContext(){ return null; }
	public MyHelperClass setExceptionState(boolean o0, String o1){ return null; }}

class Call {

public MyHelperClass callProcedure(RenderEngine o0, Object o1, Object o2, MyHelperClass o3, Object o4){ return null; }}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }
	public static MyHelperClass decode(byte[] o0){ return null; }}

class DocumentEngine {
public MyHelperClass rootTag;
DocumentEngine(){}
	DocumentEngine(FileInputStream o0){}
	DocumentEngine(ByteArrayInputStream o0){}}

class ZipSorterAscending {

}

class ZipSorterDescending {

}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class FileSorterAscending {

}

class Arrays {

public static MyHelperClass sort(Object[] o0, ZipSorterDescending o1){ return null; }
	public static MyHelperClass sort(File[] o0, FileSorterAscending o1){ return null; }
	public static MyHelperClass sort(Object[] o0, ZipSorterAscending o1){ return null; }}

class FileSorterDescending {

}

class ListFilter {

ListFilter(MyHelperClass o0){}
	ListFilter(String o0){}
	ListFilter(){}}

class StringSorterAscending {

}

class StringSorterDescending {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}
