
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3488916 {

    public static void main(String[] args) {
        if (args.length != 2) throw new IllegalArgumentException("Expected arguments: fileName log");
        String fileName = args[0];
        String logFile = args[1];
        LineNumberReader reader = null;
        PrintWriter writer = null;
        try {
            Reader reader0 =(Reader)(Object) new FileReader(fileName);
            reader = new LineNumberReader(reader0);
            Writer writer0 =(Writer)(Object) new FileWriter(logFile);
            BufferedWriter writer1 = new BufferedWriter(writer0);
            writer = new PrintWriter(writer1);
            String line =(String)(Object) reader.readLine();
            while (line != null) {
                line = line.trim();
                if (line.length() >= 81) {
                    writer.println("Analyzing Sudoku #" + reader.getLineNumber());
                    System.out.println("Analyzing Sudoku #" + reader.getLineNumber());
                    Grid grid = new Grid();
                    for (int i = 0; i < 81; i++) {
                        char ch = line.charAt(i);
                        if (ch >= '1' && ch <= '9') {
                            int value = (ch - '0');
                            grid.setCellValue(i % 9, i / 9, value);
                        }
                    }
                    Solver solver = new Solver(grid);
                    solver.rebuildPotentialValues();
                    try {
                        Map rules =(Map)(Object) solver.solve(null);
                        Map ruleNames =(Map)(Object) solver.toNamedList(rules);
                        double difficulty = 0;
                        String hardestRule = "";
                        for (Rule rule :(Rule[])(Object) (Object[])(Object)rules.keySet()) {
                            if ((double)(Object)rule.getDifficulty() > difficulty) {
                                difficulty =(double)(Object) rule.getDifficulty();
                                hardestRule =(String)(Object) rule.getName();
                            }
                        }
                        for (String rule :(String[])(Object) (Object[])(Object)ruleNames.keySet()) {
                            int count =(int)(Object) ruleNames.get(rule);
                            writer.println(Integer.toString(count) + " " + rule);
                            System.out.println(Integer.toString(count) + " " + rule);
                        }
                        writer.println("Hardest technique: " + hardestRule);
                        System.out.println("Hardest technique: " + hardestRule);
                        writer.println("Difficulty: " + difficulty);
                        System.out.println("Difficulty: " + difficulty);
                    } catch (UnsupportedOperationException ex) {
                        writer.println("Failed !");
                        System.out.println("Failed !");
                    }
                    writer.println();
                    System.out.println();
                    writer.flush();
                } else System.out.println("Skipping incomplete line: " + line);
                line =(String)(Object) reader.readLine();
            }
            writer.close();
            reader.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (UncheckedIOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.print("Finished.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(Reader o0){}
	public MyHelperClass getLineNumber(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(BufferedWriter o0){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Reader {

}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class Writer {

}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(Writer o0){}}

class Grid {

public MyHelperClass setCellValue(int o0, int o1, int o2){ return null; }}

class Solver {

Solver(){}
	Solver(Grid o0){}
	public MyHelperClass toNamedList(Map o0){ return null; }
	public MyHelperClass solve(Object o0){ return null; }
	public MyHelperClass rebuildPotentialValues(){ return null; }}

class Map {

public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Rule {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getDifficulty(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
