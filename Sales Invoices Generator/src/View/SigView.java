package View;

import Model.InvoiceLine;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class SigView extends JFrame{
    private JTable InvoicesTable ;
    private JButton CreatInvoice,DeleteInvoice , SaveInvoice , Cancel;
    private JTable ItemsTable;
    final Object[] row = new Object[4];
    private JFrame MainFrame = new JFrame();
    private JPanel LeftSidePanel;
    private JPanel RightSidePanel;
    static JMenuBar MenuBar;

    // JMenu
    static JMenu menu;

    // Menu items
    static JMenuItem Save , Load;
public void ViewFrame ()
{
    String[][] InvoicesData = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
    };

    // Column Names
    String[] columnNames = { "No", "Date", "Name" };




    String[][] InvoicesItemsData = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
    };

    // Column Names
    String[] InvoicesItems = { "No", "Date", "Name" };

    InvoicesTable = new JTable(InvoicesData , columnNames);
    ItemsTable = new JTable(InvoicesData,InvoicesItems);

    MenuBar = new JMenuBar();

    CreatInvoice = new JButton("CreateInvoice");
            DeleteInvoice = new JButton("DeleteInvoice");
            SaveInvoice=  new JButton("Save");
            Cancel= new JButton("Cancel");



    // create a menu
    menu = new JMenu("File");

    // create menuitems
    Save = new JMenuItem("Save File");
    Load = new JMenuItem("Load File");


    // add menu items to menu
    menu.add(Save);
    menu.add(Load);


    // add menu to menu bar
    MenuBar.add(menu);

    // add menubar to frame
    MainFrame.setJMenuBar(MenuBar);



    InvoicesTable.setBounds(30, 40, 200, 300);

    // adding it to JScrollPane

    JScrollPane LeftSidePanel = new JScrollPane(InvoicesTable);

    JScrollPane RightSidePanel = new JScrollPane(ItemsTable);







    RightSidePanel.setBorder(BorderFactory.createLineBorder(Color.black));








    MainFrame.setLayout(new GridLayout(1 , 2));


    MainFrame.add(LeftSidePanel);
    MainFrame.add(RightSidePanel);








    MainFrame.setSize(300,300);
    MainFrame.setVisible(true);
}

}
