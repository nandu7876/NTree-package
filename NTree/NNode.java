
package NTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nandan S
 */

public class NNode {

    List<NNode> children = null;
    String value;

    public NNode(String value) {
        this.children = new ArrayList<>();
        this.value = value;
    }

    public void addChild(NNode child) {
        children.add(child);
    }

    public String getNode() {
        return value;
    }

    public ArrayList<NNode> getChildren(NNode a) {
        ArrayList<NNode> ar = new ArrayList();
        if (a.value != null) {
            for (NNode i : a.children) {
                ar.add(i);
            }
        }
        return ar;
    }
}
