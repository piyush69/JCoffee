import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5189131 {
public MyHelperClass writeSearchResults(SearchQuery o0, String o1, List<SearchResult o2, PrintStream o3){ return null; }
public MyHelperClass Algorithm;
	public MyHelperClass getStoredProcProject(File o0, File o1){ return null; }
public MyHelperClass searchEngine;
	public MyHelperClass persister;
	public MyHelperClass Scheme;
	public MyHelperClass FindJavaSources;
	public MyHelperClass LineStripper;
	public MyHelperClass LONGEST_FIRST;
	public MyHelperClass config;
	public MyHelperClass Subversion;
	public MyHelperClass writeSearchBox(PrintStream o0, String o1, Object o2, Object o3, Object o4){ return null; }
	public MyHelperClass getStoredProcIndexFile(File o0, String o1){ return null; }
	public MyHelperClass getJavaScript(String o0){ return null; }
	public MyHelperClass writeSearchBox(PrintStream o0, String o1, String o2, String o3, Object o4){ return null; }
	public MyHelperClass format(String o0){ return null; }
	public MyHelperClass escapeHtml(String o0){ return null; }
	public MyHelperClass writeSearchBox(PrintStream o0, String o1, Object o2, Object o3, String o4){ return null; }
	public MyHelperClass getJavaIndexFile(File o0, String o1){ return null; }
	public MyHelperClass getRelativeURL(File o0, File o1){ return null; }

    public void service(Request req, Response resp)  throws Throwable {
        PrintStream out = null;
        try {
            out =(PrintStream)(Object) resp.getPrintStream(8192);
            String env =(String)(Object) req.getParameter("env");
            String regex =(String)(Object) req.getParameter("regex");
            String deep =(String)(Object) req.getParameter("deep");
            String term =(String)(Object) req.getParameter("term");
            String index =(String)(Object) req.getParameter("index");
            String refresh =(String)(Object) req.getParameter("refresh");
            String searcher =(String)(Object) req.getParameter("searcher");
            String grep =(String)(Object) req.getParameter("grep");
            String fiServerDetails =(String)(Object) req.getParameter("fi_server_details");
            String serverDetails =(String)(Object) req.getParameter("server_details");
            String hostDetails =(String)(Object) req.getParameter("host_details");
            String name =(String)(Object) req.getParameter("name");
            String show =(String)(Object) req.getParameter("show");
            String path = req.getPath().getPath();
            int page = req.getForm().getInteger("page");
            if (path.startsWith("/fs")) {
                String fsPath = path.replaceAll("^/fs", "");
                File realPath = new File("C:\\", fsPath.replace('/', File.separatorChar));
                if (realPath.isDirectory()) {
                    MyHelperClass FileSystemDirectory = new MyHelperClass();
                    out.write((int)(Object)FileSystemDirectory.getContents(new File("c:\\"), fsPath, "/fs"));
                } else {
                    resp.set("Cache", "no-cache");
                    FileInputStream fin = new FileInputStream(realPath);
                    FileChannel channel =(FileChannel)(Object) fin.getChannel();
                    WritableByteChannel channelOut =(WritableByteChannel)(Object) resp.getByteChannel();
                    channel.transferTo(0, realPath.length(), channelOut);
                    channel.close();
                    fin.close();
                    System.err.println("Serving " + path + " as " + realPath.getCanonicalPath());
                }
            } else if (path.startsWith("/files/")) {
                String[] segments = req.getPath().getSegments();
                boolean done = false;
                if (segments.length > 1) {
                    String realPath = req.getPath().getPath(1);
                    MyHelperClass context = new MyHelperClass();
                    File file =(File)(Object) context.getFile(realPath);
                    if (file.isFile()) {
//                        MyHelperClass context = new MyHelperClass();
                        resp.set("Content-Type",(String)(Object) context.getContentType(realPath));
                        FileInputStream fin = new FileInputStream(file);
                        FileChannel channel =(FileChannel)(Object) fin.getChannel();
                        WritableByteChannel channelOut =(WritableByteChannel)(Object) resp.getByteChannel();
                        long start = System.currentTimeMillis();
                        channel.transferTo(0, realPath.length(), channelOut);
                        channel.close();
                        fin.close();
                        System.err.println("Time take to write [" + realPath + "] was [" + (System.currentTimeMillis() - start) + "] of size [" + file.length() + "]");
                        done = true;
                    }
                }
                if (!done) {
                    resp.set("Content-Type", "text/plain");
                    out.println("Can not serve directory: path");
                }
            } else if (path.startsWith("/upload")) {
                FileItemFactory factory =(FileItemFactory)(Object) new DiskFileItemFactory();
                FileUpload upload = new FileUpload(factory);
                RequestAdapter adapter = new RequestAdapter(req);
                List<FileItem> list =(List<FileItem>)(Object) upload.parseRequest(adapter);
                Map<String, FileItem> map = new HashMap<String, FileItem>();
                for (FileItem entry : list) {
                    String fileName =(String)(Object) entry.getFieldName();
                    map.put(fileName, entry);
                }
                resp.set("Content-Type", "text/html");
                out.println("<html>");
                out.println("<body>");
                for (int i = 0; i < 10; i++) {
                    Part file =(Part)(Object) req.getPart("datafile" + (i + 1));
                    if (file != null && (boolean)(Object)file.isFile()) {
                        String partName =(String)(Object) file.getName();
                        String partFileName =(String)(Object) file.getFileName();
                        File partFile = new File(partFileName);
                        FileItem item = map.get(partName);
                        InputStream in =(InputStream)(Object) file.getInputStream();
                        String fileName = file.getFileName().replaceAll("\\\\", "_").replaceAll(":", "_");
                        File filePath = new File(fileName);
                        OutputStream fileOut = new FileOutputStream(filePath);
                        byte[] chunk = new byte[8192];
                        int count = 0;
                        while ((count = in.read(chunk)) != -1) {
                            fileOut.write(chunk, 0, count);
                        }
                        fileOut.close();
                        in.close();
                        out.println("<table border='1'>");
                        out.println("<tr><td><b>File</b></td><td>");
                        out.println(filePath.getCanonicalPath());
                        out.println("</tr></td>");
                        out.println("<tr><td><b>Size</b></td><td>");
                        out.println(filePath.length());
                        out.println("</tr></td>");
                        out.println("<tr><td><b>MD5</b></td><td>");
                        out.println(getSignature(Algorithm.MD5, file.getInputStream()));
                        out.println("<br>");
                        out.println(getSignature(Algorithm.MD5, item.getInputStream()));
                        if (partFile.exists()) {
                            out.println("<br>");
                            out.println(getSignature(Algorithm.MD5, new FileInputStream(partFile)));
                        }
                        out.println("</tr></td>");
                        out.println("<tr><td><b>SHA1</b></td><td>");
                        out.println(getSignature(Algorithm.SHA1, file.getInputStream()));
                        out.println("<br>");
                        out.println(getSignature(Algorithm.SHA1, item.getInputStream()));
                        if (partFile.exists()) {
                            out.println("<br>");
                            out.println(getSignature(Algorithm.SHA1, new FileInputStream(partFile)));
                        }
                        out.println("</tr></td>");
                        out.println("<tr><td><b>Header</b></td><td><pre>");
                        out.println(file.toString().trim());
                        out.println("</pre></tr></td>");
                        if (partFileName.toLowerCase().endsWith(".xml")) {
                            String xml =(String)(Object) file.getContent();
                            String formatted =(String)(Object) format(xml);
                            String fileFormatName = fileName + ".formatted";
                            File fileFormatOut = new File(fileFormatName);
                            FileOutputStream formatOut = new FileOutputStream(fileFormatOut);
                            formatOut.write(formatted.getBytes("UTF-8"));
                            out.println("<tr><td><b>Formatted XML</b></td><td><pre>");
                            out.println("<a href='/" + (fileFormatName) + "'>" + partFileName + "</a>");
                            out.println("</pre></tr></td>");
                            formatOut.close();
                        }
                        out.println("<table>");
                    }
                }
                out.println("</body>");
                out.println("</html>");
            } else if (path.startsWith("/sql/") && index != null && searcher != null) {
                String file = req.getPath().getPath(1);
                File root = searchEngine.index(searcher).getRoot();
                SearchEngine engine =(SearchEngine)(Object) searchEngine.index(searcher);
                File indexFile = getStoredProcIndexFile((File)(Object)engine.getRoot(), index);
                File search = new File(root, "cpsql");
                File source = new File(root, file.replace('/', File.separatorChar));
                StoredProcProject storedProcProj =(StoredProcProject)(Object) getStoredProcProject(search, indexFile);
                StoredProc proc = storedProcProj.getStoredProc(source.getName());
                resp.set("Content-Type", "text/html");
                out.println("<html>");
                out.println("<body><pre>");
                for (String procName : proc.getReferences()) {
                    StoredProc theProc = storedProcProj.getStoredProc(procName);
                    if (theProc != null) {
                        String url = getRelativeURL(root, theProc.getFile());
                        out.println("<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'><b>" + theProc.getName() + "</b>");
                    }
                }
                out.println("</pre></body>");
                out.println("</html>");
            } else if (show != null && index != null && searcher != null) {
                String authentication =(String)(Object) req.getValue("Authorization");
                if (authentication == null) {
                    resp.setCode(401);
                    resp.setText("Authorization Required");
                    resp.set("Content-Type", "text/html");
                    resp.set("WWW-Authenticate", "Basic realm=\"DTS Subversion Repository\"");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("401 Authorization Required");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>401 Authorization Required</h1>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    resp.set("Content-Type", "text/html");
                    Principal principal =(Principal)(Object) new PrincipalParser(authentication);
                    String file = show;
                    SearchEngine engine =(SearchEngine)(Object) searchEngine.index(searcher);
                    File root =(File)(Object) engine.getRoot();
                    File javaIndexFile =(File)(Object) getJavaIndexFile(root, index);
                    File storedProcIndexFile =(File)(Object) getStoredProcIndexFile(root, index);
                    File sql = new File(root, "cpsql");
                    File source = new File(root, file.replace('/', File.separatorChar));
                    File javaSource = new File(root, file.replace('/', File.separatorChar));
                    File canonical = source.getCanonicalFile();
                    Repository repository = Subversion.login(Scheme.HTTP, principal.getName(), principal.getPassword());
                    Info info = null;
                    try {
                        info =(Info)(Object) repository.info(canonical);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    List<Change> logMessages = new ArrayList<Change>();
                    try {
                        logMessages =(List<Change>)(Object) repository.log(canonical);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    FileInputStream in = new FileInputStream(canonical);
                    List<String> lines =(List<String>)(Object) LineStripper.stripLines(in);
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<!-- username='" + principal.getName() + "' password='" + principal.getPassword() + "' -->");
                    out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
                    out.println("<script src='highlight.js'></script>");
                    out.println("</head>");
                    out.println("<body onload=\"sh_highlightDocument('lang/', '.js')\">");
                    if (info != null) {
                        out.println("<table border='1'>");
                        out.printf("<tr><td bgcolor=\"#C4C4C4\"><tt>Author</tt></td><td><tt>" + info.author + "</tt></td></tr>");
                        out.printf("<tr><td bgcolor=\"#C4C4C4\"><tt>Version</tt></td><td><tt>" + info.version + "</tt></td></tr>");
                        out.printf("<tr><td bgcolor=\"#C4C4C4\"><tt>URL</tt></td><td><tt>" + info.location + "</tt></td></tr>");
                        out.printf("<tr><td bgcolor=\"#C4C4C4\"><tt>Path</tt></td><td><tt>" + canonical + "</tt></td></tr>");
                        out.println("</table>");
                    }
                    out.println("<table border='1''>");
                    out.println("<tr>");
                    out.println("<td valign='top' bgcolor=\"#C4C4C4\"><pre>");
                    StoredProcProject storedProcProj =(StoredProcProject)(Object) getStoredProcProject(sql, storedProcIndexFile);
                    StoredProc storedProc = null;
                    JavaProject project = null;
                    JavaClass javaClass = null;
                    List<JavaClass> importList = null;
                    if (file.endsWith(".sql")) {
                        storedProc = storedProcProj.getStoredProc(canonical.getName());
                    } else if (file.endsWith(".java")) {
                        project =(JavaProject)(Object) FindJavaSources.getProject(root, javaIndexFile);
                        javaClass = project.getClass(source);
                        importList = project.getImports(javaSource);
                    }
                    for (int i = 0; i < lines.size(); i++) {
                        out.println(i);
                    }
                    out.println("</pre></td>");
                    out.print("<td valign='top'><pre");
                    out.print(getJavaScript(file));
                    out.println(">");
                    for (int i = 0; i < lines.size(); i++) {
                        String line = lines.get(i);
                        String escaped =(String)(Object) escapeHtml(line);
                        if (project != null) {
                            for (JavaClass entry : importList) {
                                String className = entry.getClassName();
                                String fullyQualifiedName = entry.getFullyQualifiedName();
                                if (line.startsWith("import") && line.indexOf(fullyQualifiedName) > -1) {
                                    File classFile = entry.getSourceFile();
                                    String url =(String)(Object) getRelativeURL(root, classFile);
                                    escaped = escaped.replaceAll(fullyQualifiedName + ";", "<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + fullyQualifiedName + "</a>;");
                                } else if (line.indexOf(className) > -1) {
                                    File classFile = entry.getSourceFile();
                                    String url =(String)(Object) getRelativeURL(root, classFile);
                                    escaped = escaped.replaceAll("\\s" + className + ",", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>,");
                                    escaped = escaped.replaceAll("\\s" + className + "\\{", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>{");
                                    escaped = escaped.replaceAll("," + className + ",", ",<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>,");
                                    escaped = escaped.replaceAll("," + className + "\\{", ",<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>{");
                                    escaped = escaped.replaceAll("\\s" + className + "\\s", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a> ");
                                    escaped = escaped.replaceAll("\\(" + className + "\\s", "(<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a> ");
                                    escaped = escaped.replaceAll("\\s" + className + "\\.", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>.");
                                    escaped = escaped.replaceAll("\\(" + className + "\\.", "(<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>.");
                                    escaped = escaped.replaceAll("\\s" + className + "\\(", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>(");
                                    escaped = escaped.replaceAll("\\(" + className + "\\(", "(<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>(");
                                    escaped = escaped.replaceAll("&gt;" + className + ",", "&gt;<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>,");
                                    escaped = escaped.replaceAll("&gt;" + className + "\\s", "&gt;<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a> ");
                                    escaped = escaped.replaceAll("&gt;" + className + "&lt;", "&gt;<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>&lt;");
                                    escaped = escaped.replaceAll("\\(" + className + "\\);", "(<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + className + "</a>)");
                                }
                            }
                        } else if (storedProc != null) {
                            Set<String> procSet = storedProc.getTopReferences();
                            List<String> sortedProcs = new ArrayList(procSet);
                            Collections.sort(sortedProcs, LONGEST_FIRST);
                            for (String procFound : sortedProcs) {
                                if (escaped.indexOf(procFound) != -1) {
                                    File nameFile = storedProcProj.getLocation(procFound);
                                    if (nameFile != null) {
                                        String url =(String)(Object) getRelativeURL(root, nameFile);
                                        escaped = escaped.replaceAll("\\s" + procFound + "\\s", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a> ");
                                        escaped = escaped.replaceAll("\\s" + procFound + ",", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>,");
                                        escaped = escaped.replaceAll("\\s" + procFound + ";", " <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>;");
                                        escaped = escaped.replaceAll("," + procFound + "\\s", ",<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a> ");
                                        escaped = escaped.replaceAll("," + procFound + ",", ",<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>,");
                                        escaped = escaped.replaceAll("," + procFound + ";", ",<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>;");
                                        escaped = escaped.replaceAll("=" + procFound + "\\s", "=<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a> ");
                                        escaped = escaped.replaceAll("=" + procFound + ",", "=<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>,");
                                        escaped = escaped.replaceAll("=" + procFound + ";", "=<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>;");
                                        escaped = escaped.replaceAll("." + procFound + "\\s", ".<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a> ");
                                        escaped = escaped.replaceAll("." + procFound + ",", ".<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>,");
                                        escaped = escaped.replaceAll("." + procFound + ";", ".<a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + procFound + "</a>;");
                                    } else {
                                        System.err.println("NOT FOUND: " + procFound);
                                    }
                                }
                            }
                        }
                        out.println(escaped);
                    }
                    out.println("</pre></td>");
                    out.println("</tr>");
                    out.println("</table>");
                    out.println("<table border='1'>");
                    out.printf("<tr><td bgcolor=\"#C4C4C4\"><tt>Revision</tt></td><td bgcolor=\"#C4C4C4\"><tt>Date</tt></td><td bgcolor=\"#C4C4C4\"><tt>Author</tt></td><td bgcolor=\"#C4C4C4\"><tt>Comment</tt></td></tr>");
                    DateFormat format =(DateFormat)(Object) new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    for (Change message : logMessages) {
                        out.printf("<tr><td><tt>%s</tt></td><td><tt>%s</tt></td><td><tt>%s</tt></td><td><tt>%s</tt></td></tr>%n", message.version, format.format(message.date).replaceAll("\\s", "&nbsp;"), message.author, message.message);
                    }
                    out.println("</table>");
                    if (project != null) {
                        out.println("<pre>");
                        for (JavaClass entry : importList) {
                            String url = getRelativeURL(root, entry.getSourceFile());
                            out.println("import <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + entry.getFullyQualifiedName() + "</a> as " + entry.getClassName());
                        }
                        out.println("</pre>");
                    }
                    if (storedProc != null) {
                        out.println("<pre>");
                        for (String procName : storedProc.getReferences()) {
                            StoredProc proc = storedProcProj.getStoredProc(procName);
                            if (proc != null) {
                                String url = getRelativeURL(root, proc.getFile());
                                out.println("using <a href='/?show=" + url + "&index=" + index + "&searcher=" + searcher + "'>" + proc.getName() + "</a>");
                            }
                        }
                        out.println("</pre>");
                    }
                    out.println("</form>");
                    out.println("</body>");
                    out.println("</html>");
                }
            } else if (path.endsWith(".js") || path.endsWith(".css") || path.endsWith(".formatted")) {
                path = path.replace('/', File.separatorChar);
                if (path.endsWith(".formatted")) {
                    resp.set("Content-Type", "text/plain");
                } else if (path.endsWith(".js")) {
                    resp.set("Content-Type", "application/javascript");
                } else {
                    resp.set("Content-Type", "text/css");
                }
                resp.set("Cache", "no-cache");
                WritableByteChannel channelOut =(WritableByteChannel)(Object) resp.getByteChannel();
                File file = new File(".", path).getCanonicalFile();
                System.err.println("Serving " + path + " as " + file.getCanonicalPath());
                FileChannel sourceChannel = (FileChannel)(Object)new FileInputStream(file).getChannel();
                sourceChannel.transferTo(0, file.length(), channelOut);
                sourceChannel.close();
                channelOut.close();
            } else if (env != null && regex != null) {
                ServerDetails details = config.getEnvironment(env).load(persister, serverDetails != null, fiServerDetails != null, hostDetails != null);
                List<String> tokens = new ArrayList<String>();
                List<Searchable> list = details.search(regex, deep != null, tokens);
                Collections.sort(tokens, LONGEST_FIRST);
                for (String token : tokens) {
                    System.out.println("TOKEN: " + token);
                }
                resp.set("Content-Type", "text/html");
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
                out.println("<script src='highlight.js'></script>");
                out.println("</head>");
                out.println("<body onload=\"sh_highlightDocument('lang/', '.js')\">");
                writeSearchBox(out, searcher, null, null, regex);
                out.println("<br>Found " + list.size() + " hits for <b>" + regex + "</b>");
                out.println("<table border='1''>");
                int countIndex = 1;
                for (Searchable value : list) {
                    out.println("    <tr><td>" + countIndex++ + "&nbsp;<a href='" + value.getSource() + "'><b>" + value.getSource() + "</b></a></td></tr>");
                    out.println("    <tr><td><pre class='sh_xml'>");
                    StringWriter buffer = new StringWriter();
                    persister.write(value, buffer);
                    String text = buffer.toString();
                    text =(String)(Object) escapeHtml(text);
                    for (String token : tokens) {
                        text = text.replaceAll(token, "<font style='BACKGROUND-COLOR: yellow'>" + token + "</font>");
                    }
                    out.println(text);
                    out.println("    </pre></td></tr>");
                }
                out.println("</table>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            } else if (index != null && term != null && term.length() > 0) {
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
                out.println("<script src='highlight.js'></script>");
                out.println("</head>");
                out.println("<body onload=\"sh_highlightDocument('lang/', '.js')\">");
                writeSearchBox(out, searcher, term, index, null);
                if (searcher == null) {
                    searcher = searchEngine.getDefaultSearcher();
                }
                if (refresh != null) {
                    SearchEngine engine =(SearchEngine)(Object) searchEngine.index(searcher);
                    File root =(File)(Object) engine.getRoot();
                    File searchIndex =(File)(Object) getJavaIndexFile(root, index);
                    FindJavaSources.deleteProject(root, searchIndex);
                }
                boolean isRefresh = refresh != null;
                boolean isGrep = grep != null;
                boolean isSearchNames = name != null;
                SearchQuery query = new SearchQuery(index, term, page, isRefresh, isGrep, isSearchNames);
                List<SearchResult> results = searchEngine.index(searcher).search(query);
                writeSearchResults(query, searcher, results, out);
                out.println("</body>");
                out.println("</html>");
            } else {
                out.println("<html>");
                out.println("<body>");
                writeSearchBox(out, searcher, null, null, null);
                out.println("</body>");
                out.println("</html>");
            }
            out.close();
        } catch (Exception e) {
            try {
                e.printStackTrace();
                resp.reset();
                resp.setCode(500);
                resp.setText("Internal Server Error");
                resp.set("Content-Type", "text/html");
                out.println("<html>");
                out.println("<body><h1>Internal Server Error</h1><pre>");
                e.printStackTrace(out);
                out.println("</pre></body>");
                out.println("</html>");
                out.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHA1;
	public MyHelperClass HTTP;
	public MyHelperClass MD5;
public MyHelperClass write(Searchable o0, StringWriter o1){ return null; }
	public MyHelperClass getDefaultSearcher(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass index(String o0){ return null; }
	public MyHelperClass search(SearchQuery o0){ return null; }
	public MyHelperClass deleteProject(File o0, File o1){ return null; }
	public MyHelperClass getInteger(String o0){ return null; }
	public MyHelperClass getProject(File o0, File o1){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass stripLines(FileInputStream o0){ return null; }
	public MyHelperClass getEnvironment(String o0){ return null; }
	public MyHelperClass getPath(int o0){ return null; }
	public MyHelperClass getContentType(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass getContents(File o0, String o1, String o2){ return null; }
	public MyHelperClass getSegments(){ return null; }}

class Request {

public MyHelperClass getPart(String o0){ return null; }
	public MyHelperClass getForm(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class Response {

public MyHelperClass getByteChannel(){ return null; }
	public MyHelperClass set(String o0, String o1){ return null; }
	public MyHelperClass setCode(int o0){ return null; }
	public MyHelperClass getPrintStream(int o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class FileChannel {

public MyHelperClass transferTo(int o0, int o1, WritableByteChannel o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, long o1, WritableByteChannel o2){ return null; }}

class WritableByteChannel {

public MyHelperClass close(){ return null; }}

class FileItemFactory {

}

class DiskFileItemFactory {

}

class FileUpload {

FileUpload(FileItemFactory o0){}
	FileUpload(){}
	public MyHelperClass parseRequest(RequestAdapter o0){ return null; }}

class RequestAdapter {

RequestAdapter(Request o0){}
	RequestAdapter(){}}

class FileItem {

public MyHelperClass getFieldName(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Part {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class SearchEngine {

public MyHelperClass getRoot(){ return null; }}

class PrincipalParser {

PrincipalParser(String o0){}
	PrincipalParser(){}}

class Repository {

public MyHelperClass log(File o0){ return null; }
	public MyHelperClass info(File o0){ return null; }}

class Principal {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Info {
public MyHelperClass location;
	public MyHelperClass version;
	public MyHelperClass author;
}

class Change {
public MyHelperClass message;
	public MyHelperClass version;
	public MyHelperClass date;
	public MyHelperClass author;
}

class DateFormat {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class ServerDetails {

public MyHelperClass search(String o0, boolean o1, List<String o2){ return null; }}

class Searchable {

public MyHelperClass getSource(){ return null; }}

class SearchQuery {

SearchQuery(){}
	SearchQuery(String o0, String o1, int o2, boolean o3, boolean o4, boolean o5){}}

class SearchResult {

}

class StoredProcProject {

public MyHelperClass getLocation(String o0){ return null; }
	public MyHelperClass getStoredProc(String o0){ return null; }}

class StoredProc {

public MyHelperClass getTopReferences(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getReferences(){ return null; }}

class JavaProject {

public MyHelperClass getImports(File o0){ return null; }}

class JavaClass {

public MyHelperClass getFullyQualifiedName(){ return null; }
	public MyHelperClass getClassName(){ return null; }
	public MyHelperClass getSourceFile(){ return null; }}

class Collections {

public static MyHelperClass sort(List<String> o0, MyHelperClass o1){ return null; }}

class Object {

public MyHelperClass getClass(File o0){ return null; }}
