


class c2086683 {

    private PieceSet[] getPieceSets() {
        MyHelperClass boardManager = new MyHelperClass();
        Resource[] resources =(Resource[])(Object) boardManager.getResources("pieces");
        PieceSet[] pieceSets = new PieceSet[resources.length];
        for (int i = 0; i < resources.length; i++) pieceSets[i] = (PieceSet)(PieceSet)(Object) resources[i];
        for (int i = 0; i < resources.length; i++) {
            for (int j = 0; j < resources.length - (i + 1); j++) {
                String name1 =(String)(Object) pieceSets[j].getName();
                String name2 =(String)(Object) pieceSets[j + 1].getName();
                if (name1.compareTo(name2) > 0) {
                    PieceSet tmp = pieceSets[j];
                    pieceSets[j] = pieceSets[j + 1];
                    pieceSets[j + 1] = tmp;
                }
            }
        }
        return pieceSets;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResources(String o0){ return null; }}

class PieceSet {

public MyHelperClass getName(){ return null; }}

class Resource {

}
