import javax.swing.*;
class Menubar{
    JMenu file,edit,view,open,subnew;
    JMenuItem item1,item2,item3,item4,item5,item6;
   
    Menubar(){
        JFrame frame = new JFrame("Simple Program");
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        JpopupMenu popup = new JPopupMenu();
        //Menubar
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        open = new JMenu("Open");
        subnew = new JMenu("New");

        //menuitems
        item1 = new JMenuItem("text");
        item2 = new JMenuItem("folder");
        item3 = new JMenuItem("shape");
        item4 = new JMenuItem("close");
        item5 = new JMenuItem("Window");
        item6 = new JMenuItem("Panel");

        //PopMenu
        

        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);
        menubar.add(open);
        file.add(subnew);
        subnew.add(item1);
        subnew.add(item2);
        file.add(item3);
        file.add(item4);
        view.add(item5);
        view.add(item6);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
            JPopupMenu menu = new JPopupMenu("Menu");
            JMenu file1,edit1,view1,open1,subnew1;
            JMenuItem item_1,item_2,item_3,item_4,item_5,item_6;
            file1 = new JMenu("File");
            edit1 = new JMenu("Edit");
            view1 = new JMenu("View");
            open1 = new JMenu("Open");
            subnew1 = new JMenu("New");
    
            //menuitems
            item_1 = new JMenuItem("text");
            item_2 = new JMenuItem("folder");
            item_3 = new JMenuItem("shape");
            item_4 = new JMenuItem("close");
            item_5 = new JMenuItem("Window");
            item_6 = new JMenuItem("Panel");
    
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
   
             
               if (SwingUtilities.isRightMouseButton(mouseEvent)){
                   menu.show(frame, mouseEvent.getX(), mouseEvent.getY());
                   menu.setVisible(true);
    
               }
    
                      
          }               
      });   
        
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(null);



    }
    public static void main(String[] args){
        new Menubar();
    }

}