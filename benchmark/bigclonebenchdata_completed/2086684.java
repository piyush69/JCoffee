


class c2086684 {

    private BoardPattern[] getBoardPatterns() {
        MyHelperClass boardManager = new MyHelperClass();
        Resource[] resources =(Resource[])(Object) boardManager.getResources("boards");
        BoardPattern[] boardPatterns = new BoardPattern[resources.length];
        for (int i = 0; i < resources.length; i++) boardPatterns[i] = (BoardPattern)(BoardPattern)(Object) resources[i];
        for (int i = 0; i < resources.length; i++) {
            for (int j = 0; j < resources.length - (i + 1); j++) {
                String name1 =(String)(Object) boardPatterns[j].getName();
                String name2 =(String)(Object) boardPatterns[j + 1].getName();
                if (name1.compareTo(name2) > 0) {
                    BoardPattern tmp = boardPatterns[j];
                    boardPatterns[j] = boardPatterns[j + 1];
                    boardPatterns[j + 1] = tmp;
                }
            }
        }
        return boardPatterns;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResources(String o0){ return null; }}

class BoardPattern {

public MyHelperClass getName(){ return null; }}

class Resource {

}
