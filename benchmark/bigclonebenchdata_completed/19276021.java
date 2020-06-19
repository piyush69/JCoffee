import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19276021 {
public MyHelperClass targetRow;
	public MyHelperClass scientificNumber;
	public MyHelperClass targetValue;
	public MyHelperClass url2goto;
	public MyHelperClass rowcount;
	public MyHelperClass dryrun;
	public MyHelperClass ignorePreHeaderLines;
	public MyHelperClass headers;
	public MyHelperClass constructors;
	public MyHelperClass isURL;
	public MyHelperClass file;
	public MyHelperClass types;
	public MyHelperClass findingTargetValue;
	public MyHelperClass valueQueue;
	public MyHelperClass delimiter;

    public DataSet newparse() throws Throwable, SnifflibDatatypeException {
        MyHelperClass NumberFormat = new MyHelperClass();
        NumberFormat numformat = NumberFormat.getInstance();
        if (this.headers.size() != this.types.size()) {
            throw new SnifflibDatatypeException("Different number of headers (" + this.headers.size() + ") and types(" + this.types.size() + ").");
        }
        DataSet out = null;
        if (!(Boolean)(Object)this.dryrun) {
            out = new DataSet();
        }
        BufferedReader r = null;
        StreamTokenizer tokenizer = null;
        try {
            if ((boolean)(Object)this.isURL) {
                if (this.url2goto == null) {
                    return (null);
                }
                DataInputStream in = null;
                try {
                    in = new DataInputStream(this.url2goto.openStream());
                    System.out.println("READY TO READ FROM URL:" + url2goto);
                    r = new BufferedReader(new InputStreamReader(in));
                } catch (Exception err) {
                    throw new RuntimeException("Problem reading from URL " + this.url2goto + ".", err);
                }
            } else {
                if (this.file == null) {
                    throw new RuntimeException("Data file to be parsed can not be null.");
                }
                if (!this.file.exists()) {
                    throw new RuntimeException("The file " + this.file + " does not exist.");
                }
                r = new BufferedReader(new FileReader((String)(Object)this.file));
            }
            if ((int)(Object)this.ignorePreHeaderLines > 0) {
                String strLine;
                int k = 0;
                while ((k < (int)(Object)this.ignorePreHeaderLines) && ((strLine = r.readLine()) != null)) {
                    k++;
                }
            }
            tokenizer = new StreamTokenizer(r);
            tokenizer.resetSyntax();
            tokenizer.eolIsSignificant(true);
            boolean parseNumbers = false;
            for (int k = 0; k < this.types.size(); k++) {
                Class type = (Class) this.types.get(k);
                if (Number.class.isAssignableFrom(type)) {
                    parseNumbers = true;
                    break;
                }
            }
            if (parseNumbers) {
                tokenizer.parseNumbers();
            }
            tokenizer.eolIsSignificant(true);
            if (this.delimiter.equals("\\t")) {
                tokenizer.whitespaceChars('\t', '\t');
                tokenizer.quoteChar('"');
                tokenizer.whitespaceChars(' ', ' ');
            } else if (this.delimiter.equals(",")) {
                tokenizer.quoteChar('"');
                tokenizer.whitespaceChars(',', ',');
                tokenizer.whitespaceChars(' ', ' ');
            } else {
                if (this.delimiter.length() > 1) {
                    throw new RuntimeException("Delimiter must be a single character.  Multiple character delimiters are not allowed.");
                }
                if (this.delimiter.length() > 0) {
                    tokenizer.whitespaceChars(this.delimiter.charAt(0), this.delimiter.charAt(0));
                } else {
                    tokenizer.wordChars(Character.MIN_VALUE, Character.MAX_VALUE);
                    tokenizer.eolIsSignificant(true);
                    tokenizer.ordinaryChar('\n');
                }
            }
            boolean readingHeaders = true;
            boolean readingInitialValues = false;
            boolean readingData = false;
            boolean readingScientificNotation = false;
            if (this.headers.size() > 0) {
                readingHeaders = false;
                readingInitialValues = true;
            }
            if (this.types.size() > 0) {
                readingInitialValues = false;
                Class targetclass;
                for (int j = 0; j < this.types.size(); j++) {
                    targetclass = (Class) this.types.get(j);
                    try {
                        this.constructors.add(targetclass.getConstructor(String.class));
                    } catch (java.lang.NoSuchMethodException err) {
                        throw new SnifflibDatatypeException("Could not find appropriate constructor for " + targetclass + ". " + err.getMessage());
                    }
                }
                readingData = true;
            }
            int currentColumn = 0;
            int currentRow = 0;
            this.rowcount =(MyHelperClass)(Object) 0;
            boolean advanceField = true;
            while (true) {
                tokenizer.nextToken();
                switch(tokenizer.ttype) {
                    case StreamTokenizer.TT_WORD:
                        {
                            advanceField = true;
                            if (readingScientificNotation) {
                                throw new RuntimeException("Problem reading scientific notation at row " + currentRow + " column " + currentColumn + ".");
                            }
                            if (readingHeaders) {
                                this.headers.add(tokenizer.sval);
                            } else {
                                if (readingInitialValues) {
                                    this.types.add(String.class);
                                }
                                if (!(Boolean)(Object)this.dryrun) {
                                    if (out.getColumnCount() <= currentColumn) {
                                        out.addColumn((String) this.headers.get(currentColumn), (Class) this.types.get(currentColumn));
                                    }
                                }
                                try {
                                    Constructor construct;
                                    if (currentColumn < this.constructors.size()) {
                                        construct = (Constructor) this.constructors.get(currentColumn);
                                    } else {
                                        Class targetclass = (Class) this.types.get(currentColumn);
                                        construct =(Constructor)(Object) targetclass.getConstructor(String.class);
                                        this.constructors.add(construct);
                                    }
                                    try {
                                        try {
                                            try {
                                                if (!(Boolean)(Object)this.dryrun) {
                                                    out.setValueAt(construct.newInstance((String) tokenizer.sval), currentRow, currentColumn);
                                                } else if ((boolean)(Object)this.findingTargetValue) {
                                                    Object vvv = construct.newInstance((String) tokenizer.sval);
                                                    this.valueQueue.push(vvv);
                                                    if (((int)(Object)this.targetRow == currentRow) && (this.targetColumn == currentColumn)) {
                                                        this.targetValue =(MyHelperClass[])(Object) vvv;
                                                        r.close();
                                                        return (null);
                                                    }
                                                }
                                            } catch (java.lang.reflect.InvocationTargetException err) {
                                                throw new SnifflibDatatypeException("Problem constructing 1" + err.getMessage());
                                            }
                                        } catch (java.lang.IllegalAccessException err) {
                                            throw new SnifflibDatatypeException("Problem constructing 2" + err.getMessage());
                                        }
                                    } catch (java.lang.InstantiationException err) {
                                        throw new SnifflibDatatypeException("Problem constructing 3" + err.getMessage());
                                    }
                                } catch (java.lang.NoSuchMethodException err) {
                                    throw new SnifflibDatatypeException("Problem constructing 4" + err.getMessage());
                                }
                            }
                            break;
                        }
                    case StreamTokenizer.TT_NUMBER:
                        {
                            advanceField = true;
                            if (readingHeaders) {
                                throw new SnifflibDatatypeException("Expecting string header at row=" + currentRow + ", column=" + currentColumn + ".");
                            } else {
                                if (readingInitialValues) {
                                    this.types.add(Double.class);
                                }
                                if (!(Boolean)(Object)this.dryrun) {
                                    if (out.getColumnCount() <= currentColumn) {
                                        out.addColumn((String) this.headers.get(currentColumn), (Class) this.types.get(currentColumn));
                                    }
                                }
                                try {
                                    Constructor construct;
                                    if (currentColumn < this.constructors.size()) {
                                        construct = (Constructor) this.constructors.get(currentColumn);
                                    } else {
                                        Class targetclass = (Class) this.types.get(currentColumn);
                                        construct =(Constructor)(Object) targetclass.getConstructor(double.class);
                                        this.constructors.add(construct);
                                    }
                                    if (readingScientificNotation) {
                                        Double val =(Double)(Object) this.scientificNumber;
                                        if (!(Boolean)(Object)this.dryrun) {
                                            try {
                                                out.setValueAt(new Double(val.doubleValue() * tokenizer.nval), currentRow, currentColumn);
                                            } catch (Exception err) {
                                                throw new SnifflibDatatypeException("Problem constructing " + construct.getDeclaringClass() + "at row " + currentRow + " column " + currentColumn + ".", err);
                                            }
                                        } else if ((boolean)(Object)this.findingTargetValue) {
                                            Double NVAL = new Double(tokenizer.nval);
                                            Object vvv = null;
                                            try {
                                                vvv = Double.parseDouble(val + "E" + NVAL.intValue());
                                            } catch (Exception err) {
                                                throw new RuntimeException("Problem parsing scientific notation at row=" + currentRow + " col=" + currentColumn + ".", err);
                                            }
                                            tokenizer.nextToken();
                                            if (tokenizer.ttype != 'e') {
                                                this.valueQueue.push(vvv);
                                                if (((int)(Object)this.targetRow == currentRow) && (this.targetColumn == currentColumn)) {
                                                    this.targetValue =(MyHelperClass[])(Object) vvv;
                                                    r.close();
                                                    return (null);
                                                }
                                                currentColumn++;
                                            } else {
                                                tokenizer.pushBack();
                                            }
                                        }
                                        readingScientificNotation = false;
                                    } else {
                                        try {
                                            this.scientificNumber =(MyHelperClass)(Object) new Double(tokenizer.nval);
                                            if (!(Boolean)(Object)this.dryrun) {
                                                out.setValueAt(this.scientificNumber, currentRow, currentColumn);
                                            } else if ((boolean)(Object)this.findingTargetValue) {
                                                this.valueQueue.push(this.scientificNumber);
                                                if (((int)(Object)this.targetRow == currentRow) && (this.targetColumn == currentColumn)) {
                                                    this.targetValue = this.scientificNumber;
                                                    r.close();
                                                    return (null);
                                                }
                                            }
                                        } catch (Exception err) {
                                            throw new SnifflibDatatypeException("Problem constructing " + construct.getDeclaringClass() + "at row " + currentRow + " column " + currentColumn + ".", err);
                                        }
                                    }
                                } catch (java.lang.NoSuchMethodException err) {
                                    throw new SnifflibDatatypeException("Problem constructing" + err.getMessage());
                                }
                            }
                            break;
                        }
                    case StreamTokenizer.TT_EOL:
                        {
                            if (readingHeaders) {
                                readingHeaders = false;
                                readingInitialValues = true;
                            } else {
                                if (readingInitialValues) {
                                    readingInitialValues = false;
                                    readingData = true;
                                }
                            }
                            if (readingData) {
                                if (valueQueue.getUpperIndex() < currentRow) {
                                    valueQueue.push("");
                                }
                                currentRow++;
                            }
                            break;
                        }
                    case StreamTokenizer.TT_EOF:
                        {
                            if (readingHeaders) {
                                throw new SnifflibDatatypeException("End of file reached while reading headers.");
                            }
                            if (readingInitialValues) {
                                throw new SnifflibDatatypeException("End of file reached while reading initial values.");
                            }
                            if (readingData) {
                                readingData = false;
                            }
                            break;
                        }
                    default:
                        {
                            if (tokenizer.ttype == '"') {
                                advanceField = true;
                                if (readingHeaders) {
                                    this.headers.add(tokenizer.sval);
                                } else {
                                    if (readingInitialValues) {
                                        this.types.add(String.class);
                                    }
                                    if (!(Boolean)(Object)this.dryrun) {
                                        if (out.getColumnCount() <= currentColumn) {
                                            out.addColumn((String) this.headers.get(currentColumn), (Class) this.types.get(currentColumn));
                                        }
                                    }
                                    try {
                                        Constructor construct;
                                        if (currentColumn < this.constructors.size()) {
                                            construct = (Constructor) this.constructors.get(currentColumn);
                                        } else {
                                            Class targetclass = (Class) this.types.get(currentColumn);
                                            construct =(Constructor)(Object) targetclass.getConstructor(String.class);
                                            this.constructors.add(construct);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!(Boolean)(Object)this.dryrun) {
                                                        out.setValueAt(construct.newInstance((String) tokenizer.sval), currentRow, currentColumn);
                                                    } else if ((boolean)(Object)this.findingTargetValue) {
                                                        Object vvv = construct.newInstance((String) tokenizer.sval);
                                                        this.valueQueue.push(vvv);
                                                        if (((int)(Object)this.targetRow == currentRow) && (this.targetColumn == currentColumn)) {
                                                            this.targetValue =(MyHelperClass[])(Object) vvv;
                                                            r.close();
                                                            return (null);
                                                        }
                                                    }
                                                } catch (java.lang.reflect.InvocationTargetException err) {
                                                    throw new SnifflibDatatypeException("Problem constructing a " + construct, err);
                                                }
                                            } catch (java.lang.IllegalAccessException err) {
                                                throw new SnifflibDatatypeException("Problem constructing 2 ", err);
                                            }
                                        } catch (java.lang.InstantiationException err) {
                                            throw new SnifflibDatatypeException("Problem constructing 3 ", err);
                                        }
                                    } catch (java.lang.NoSuchMethodException err) {
                                        throw new SnifflibDatatypeException("Problem constructing 4", err);
                                    }
                                }
                            } else if (tokenizer.ttype == 'e') {
                                Class targetclass = (Class) this.types.get(currentColumn);
                                if (Number.class.isAssignableFrom(targetclass)) {
                                    currentColumn--;
                                    readingScientificNotation = true;
                                    advanceField = false;
                                }
                            } else {
                                advanceField = false;
                            }
                            break;
                        }
                }
                if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
                    advanceField = false;
                    break;
                }
                if (advanceField) {
                    currentColumn++;
                    if (!readingHeaders) {
                        if (currentColumn >= this.headers.size()) {
                            currentColumn = 0;
                        }
                    }
                }
            }
            if (!readingHeaders) {
                this.rowcount = currentRow;
            } else {
                this.rowcount = 0;
                readingHeaders = false;
                if (this.ignorePostHeaderLines > 0) {
                    String strLine;
                    int k = 0;
                    while ((k < this.ignorePostHeaderLines) && ((strLine = r.readLine()) != null)) {
                        k++;
                    }
                }
            }
            r.close();
        } catch (java.io.IOException err) {
            throw new SnifflibDatatypeException(err.getMessage());
        }
        if (!this.dryrun) {
            for (int j = 0; j < this.headers.size(); j++) {
                out.setColumnName(j, (String) this.headers.get(j));
            }
        }
        return (out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass add(Class<String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass add(Class<Double o0){ return null; }
	public MyHelperClass push(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getUpperIndex(){ return null; }
	public MyHelperClass charAt(int o0){ return null; }
	public MyHelperClass add(Constructor o0){ return null; }
	public MyHelperClass push(Object o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass push(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class DataSet {

public MyHelperClass getColumnCount(){ return null; }
	public MyHelperClass setValueAt(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass setValueAt(Double o0, int o1, int o2){ return null; }
	public MyHelperClass addColumn(String o0, Class o1){ return null; }}

class SnifflibDatatypeException extends Exception{
	public SnifflibDatatypeException(String errorMessage) { super(errorMessage); }
	SnifflibDatatypeException(String o0, InstantiationException o1){}
	SnifflibDatatypeException(String o0, NoSuchMethodException o1){}
	SnifflibDatatypeException(){}
	SnifflibDatatypeException(String o0, InvocationTargetException o1){}
	SnifflibDatatypeException(String o0, IllegalAccessException o1){}
}

class NumberFormat {

}

class Constructor {

public MyHelperClass newInstance(String o0){ return null; }
	public MyHelperClass getDeclaringClass(){ return null; }}
