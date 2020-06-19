import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12483251 {
public MyHelperClass yPos;
	public MyHelperClass _vMax;
	public MyHelperClass xPos;
	public MyHelperClass _maxPackageRank;
	public MyHelperClass getVGap(){ return null; }
	public MyHelperClass getHGap(){ return null; }
	public MyHelperClass getRowHeight(int o0){ return null; }
	public MyHelperClass getObjectsInRow(int o0){ return null; }
	public MyHelperClass getRows(){ return null; }
	public MyHelperClass getColumns(int o0){ return null; }

    private void weightAndPlaceClasses()  throws Throwable {
        int rows =(int)(Object) getRows();
        for (int curRow =(int)(Object) _maxPackageRank; curRow < rows; curRow++) {
            xPos =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) getHGap() / 2;
            BOTLObjectSourceDiagramNode[] rowObject =(BOTLObjectSourceDiagramNode[])(Object) getObjectsInRow(curRow);
            for (int i = 0; i < rowObject.length; i++) {
                if (curRow == (int)(Object)_maxPackageRank) {
                    int nDownlinks =(int)(Object) rowObject[i].getDownlinks().size();
                    rowObject[i].setWeight((nDownlinks > 0) ? (1 / nDownlinks) : 2);
                } else {
                    Vector uplinks =(Vector)(Object) rowObject[i].getUplinks();
                    int nUplinks = uplinks.size();
                    if (nUplinks > 0) {
                        float average_col = 0;
                        for (int j = 0; j < uplinks.size(); j++) {
                            average_col += (float)(Object)((BOTLObjectSourceDiagramNode) (uplinks.elementAt(j))).getColumn();
                        }
                        average_col /= nUplinks;
                        rowObject[i].setWeight(average_col);
                    } else {
                        rowObject[i].setWeight(1000);
                    }
                }
            }
            int[] pos = new int[rowObject.length];
            for (int i = 0; i < pos.length; i++) {
                pos[i] = i;
            }
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < pos.length - 1; i++) {
                    if ((int)(Object)rowObject[pos[i]].getWeight() > (int)(Object)rowObject[pos[i + 1]].getWeight()) {
                        int temp = pos[i];
                        pos[i] = pos[i + 1];
                        pos[i + 1] = temp;
                        swapped = true;
                    }
                }
            }
            for (int i = 0; i < pos.length; i++) {
                rowObject[pos[i]].setColumn(i);
                if ((i > (int)(Object)_vMax) && ((int)(Object)rowObject[pos[i]].getUplinks().size() == 0) && ((int)(Object)rowObject[pos[i]].getDownlinks().size() == 0)) {
                    if ((int)(Object)getColumns(rows - 1) > (int)(Object)_vMax) {
                        rows++;
                    }
                    rowObject[pos[i]].setRank(rows - 1);
                } else {
                    rowObject[pos[i]].setLocation(new Point(xPos, yPos));
                   (int)(Object) xPos +=(int)(Object) rowObject[pos[i]].getSize().getWidth() + (int)(Object)getHGap();
                }
            }
           (int)(Object) yPos +=(int)(Object) getRowHeight(curRow) + (int)(Object)getVGap();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class BOTLObjectSourceDiagramNode {

public MyHelperClass getWeight(){ return null; }
	public MyHelperClass setWeight(float o0){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass setColumn(int o0){ return null; }
	public MyHelperClass setWeight(int o0){ return null; }
	public MyHelperClass setLocation(Point o0){ return null; }
	public MyHelperClass getDownlinks(){ return null; }
	public MyHelperClass setRank(int o0){ return null; }
	public MyHelperClass getColumn(){ return null; }
	public MyHelperClass getUplinks(){ return null; }}

class Point {

Point(MyHelperClass o0, MyHelperClass o1){}
	Point(){}}
