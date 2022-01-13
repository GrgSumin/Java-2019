import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Popup {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple Program");
        JPopupMenu menu = new JPopupMenu("Menu");
        
        
        JPopupMenu file1 = new JPopupMenu("File");
        JPopupMenu edit1 = new JPopupMenu("Edit");
        JPopupMenu view1 = new JPopupMenu("View");
        JPopupMenu open1 = new JPopupMenu("Open");
        JPopupMenu subnew1 = new JPopupMenu("New");

        //menuitems
        JMenuItem item_1 = new JMenuItem("text");
        JMenuItem item_2 = new JMenuItem("folder");
        JMenuItem item_3 = new JMenuItem("shape");
        JMenuItem item_4 = new JMenuItem("close");
        JMenuItem item_5 = new JMenuItem("Window");
        JMenuItem item_6 = new JMenuItem("Panel");

        //PopMenu
        

        menu.add(file1);
        menu.add(edit1);
        menu.add(view1);
        menu.add(open1);
        file1.add(subnew1);
        subnew1.add(item_1);
        subnew1.add(item_2);
        file1.add(item_3);
        file1.add(item_4);
        view1.add(item_5);
        view1.add(item_6);  
        
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                if(SwingUtilities.isRightMouseButton(mouseEvent)){
                    menu.show(frame,    MouseEvent.getY(),mouseEvent.getX());
                }
            }
        });

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(null);


    }
}
