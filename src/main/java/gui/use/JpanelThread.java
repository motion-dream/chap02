package gui.use;

public class JpanelThread extends Thread {
    private LunBoPanel lunBoPanel;
    public JpanelThread(String[] filePath){
        lunBoPanel=new LunBoPanel(filePath);
    }
    public LunBoPanel getLunBoPanel(){
        return lunBoPanel;
    }
    public void run(){
        lunBoPanel.showImage();
    }
}
