package gui.use;

import javax.swing.*;
import java.awt.*;

public class GuiTest {
    private JTextField text;
    private JButton button;
    private JRadioButton red;
    private JRadioButton blue;
    private JRadioButton green;
    public GuiTest(){
        JFrame jf=new JFrame("helloi");
        jf.setLayout(new GridLayout(1,2));
        String filePath[]={FilePathUtil.getPath("a.jpg"),
                "src/main/resources/images/b.jpg",
                "src/main/resources/images/c.jpeg",
                "src/main/resources/images/d.jpg"};

        JpanelThread jpanelThread=new JpanelThread(filePath);
        jpanelThread.start();
        jf.add(jpanelThread.getLunBoPanel());
        /**开始第二个面板**/
        JPanel jPanel2=new JPanel();
        jPanel2.setBackground(Color.red);
        text=new JTextField(30);
        button=new JButton("单击wo");
        red=new JRadioButton("red");
        blue=new JRadioButton("blue");
        green=new JRadioButton("green");
        ButtonGroup bg=new ButtonGroup();
        bg.add(red);bg.add(blue);bg.add(green);
        jPanel2.add(text);jPanel2.add(button);
        jPanel2.add(red);jPanel2.add(blue);jPanel2.add(green);
        jf.add(jPanel2);
        jPanel2.setSize(200,200);

        jf.setBounds(150,150,400,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String []ar){
        new GuiTest();
    }
}
