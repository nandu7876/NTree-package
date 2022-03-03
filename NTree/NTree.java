package NTree;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author N S
 */
public class NTree extends JPanel {
    int x;
    int y=0;
    JLabel l;
    GridBagConstraints gc = new GridBagConstraints();

    public NTree(NNode a) {
        GridBagLayout g = new GridBagLayout();
        setLayout(g);
        createNTree(a, 0);

    }

    private void cNTree(String a, int x) {

        l = new JLabel(a);
        setLay(l, x);

    }

    private void setLay(JLabel l, int x) {
        gc.gridx = x;
        gc.gridy = y+1;
        add(l, gc);
    }

    private void createNTree(NNode a, int x) {
        
        cNTree(a.getNode(), x);
        if (a.getChildren(a) != null) {
            x = x + 1;
        } else {
            x = x - 1;
        }
        
        y=y+1;
        
        ArrayList<NNode> ar = a.getChildren(a);

        for (NNode i : ar) {
            createNTree(i, x);
        }

    }
}
