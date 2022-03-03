 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import NTree.*;
import java.awt.*;
import javax.swing.JFrame;

public class test {
    test(){
        JFrame f=new JFrame();
        NNode a=new NNode("MCA");
        NNode b=new NNode("BCom");
        NNode c=new NNode("BCA");
        NNode d=new NNode("BSc");
        NNode e=new NNode("BBA");
        NNode g=new NNode("BBM");
        
        a.addChild(b);
        a.addChild(c);
        c.addChild(d);
        a.addChild(e);
        e.addChild(g);
        
        NTree nt=new NTree(a);
        f.add(nt,BorderLayout.PAGE_START);
        f.setSize(400,400);
        f.setVisible(true);        
    }
    public static void main(String[] args) {
        new test();
    }
}
