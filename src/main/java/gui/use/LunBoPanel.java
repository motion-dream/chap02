package gui.use;

import javax.swing.*;
import java.awt.*;
//danyizhizeyuanze
public class LunBoPanel extends JPanel {

    private CardLayout cardLayout;
    public LunBoPanel(String[] filePath){
        JLabel jls[]=new JLabel[filePath.length];
        for(int i=0;i<jls.length;i++){
            ImageIcon ii=new ImageIcon(filePath[i]);
            ii.setImage(ii.getImage().
                    getScaledInstance(200,200,
                            Image.SCALE_DEFAULT));
            jls[i]=new JLabel(ii);
            jls[i].setSize(200,200);
            this.add(jls[i]);
        }
        cardLayout=new CardLayout();
        this.setLayout(cardLayout);
    }
    public void showImage(){
        while(true){
            cardLayout.next(this);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
