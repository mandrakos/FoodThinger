/*
 * FoodThingerMainWindow.java
 *
 * Created on June 11, 2006, 1:00 PM
 */

package foodthinger;


/**
 *
 * @author  Rachel
 */
public class FoodThingerMainWindow extends javax.swing.JFrame {
    
    FoodModel fm;
    private javax.swing.JInternalFrame pantryjInternalFrame = null;
    private javax.swing.JInternalFrame pantryAddjInternalFrame = null;
    private javax.swing.JInternalFrame exportJInternalFrame=null;
    private javax.swing.JInternalFrame OptionsJInternalFrame = null;
    private javax.swing.JInternalFrame helpJInternalFrame = null;
    private ReportJInternalFrame reportJInteralFrame = null;
    private ConverterJInternalFrame converterJInternalFrame = null;
    /** Creates new form FoodThingerMainWindow */
    public FoodThingerMainWindow() {
        initComponents();
    }
    
    public FoodThingerMainWindow(FoodModel fm1)
    {
	this.fm = fm1;
	fm.exec(Constants.UPDATE_EXPIRED_QUERY,new String[]{fm.getToday(0)}, Constants.TABLE_FOOD_STORED);
	initComponents();
	System.out.println(fm.getIconUrl());
	this.setIconImage(new javax.swing.ImageIcon(fm.getIconUrl()).getImage());
	this.reportJInteralFrame = new ReportJInternalFrame(fm);
	desktopPane.add(reportJInteralFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
	this.converterJInternalFrame = new ConverterJInternalFrame(fm);
	desktopPane.add(converterJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
	String opened = fm.getProperty(Constants.PROP_OPENED);
	//first time being opened, pop up the properties box to create plan
	if(opened==null || opened.length()==0)
	{
	     preferencesMenu();
	     //this.OptionsJInternalFrame.
	}
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        jPopupMenuRightClick = new javax.swing.JPopupMenu();
        jMenuItemAddNewFood = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonPantry = new javax.swing.JButton();
        jButtonConverter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        pantryAddjInternalFrame = new PantryAddJInternalFrame(fm);
        desktopPane.add(pantryAddjInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantryjInternalFrame = new PantryJInternalFrame(fm, pantryAddjInternalFrame);
        desktopPane.add(pantryjInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        this.exportJInternalFrame = new ExportJInternalFrame(fm);
        desktopPane.add(exportJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        this.OptionsJInternalFrame = new OptionsJInternalFrame(fm);
        desktopPane.add(OptionsJInternalFrame,javax.swing.JLayeredPane.DEFAULT_LAYER);
        jInternalFramePantry = new javax.swing.JInternalFrame();
        jToolBar2 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePantry = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTreePantry = new javax.swing.JTree();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItemPreferences = new javax.swing.JMenuItem();
        jMenuItemExport = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        helpMenuItem = new javax.swing.JMenuItem();

        jMenuItemAddNewFood.setText("Add New Food");
        jPopupMenuRightClick.add(jMenuItemAddNewFood);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoodThinger");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("FoodThinger");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                FoodThingerMainWindow.this.windowClosing(evt);
            }
        });

        jButtonPantry.setText("Pantry");
        jButtonPantry.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPantryActionPerformed(evt);
            }
        });
        jButtonPantry.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                PantryReleasedHandler(evt);
            }
        });
        jButtonPantry.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                PantryMouseReleasedHandler(evt);
            }
        });

        jToolBar1.add(jButtonPantry);

        jButtonConverter.setText("Converter");
        jButtonConverter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonConverterActionPerformed(evt);
            }
        });

        jToolBar1.add(jButtonConverter);

        jButton1.setText("Recipes");
        jButton1.setEnabled(false);
        jToolBar1.add(jButton1);

        jButton3.setText("Shopping List");
        jButton3.setEnabled(false);
        jToolBar1.add(jButton3);

        jToolBar1.add(jSeparator1);

        jButton2.setText("Reports");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        desktopPane.setPreferredSize(new java.awt.Dimension(700, 500));
        desktopPane.setVerifyInputWhenFocusTarget(false);
        jInternalFramePantry.setClosable(true);
        jInternalFramePantry.setTitle("Pantry");
        jInternalFramePantry.setToolTipText("Explore what foods you have stored");
        jButton4.setText("Add");
        jToolBar2.add(jButton4);

        jInternalFramePantry.getContentPane().add(jToolBar2, java.awt.BorderLayout.NORTH);

        jSplitPane1.setComponentPopupMenu(jPopupMenuRightClick);
        jSplitPane1.setAutoscrolls(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 404));
        jTablePantry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePantry.setEnabled(false);
        jTablePantry.setFocusable(false);
        jTablePantry.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTablePantry);

        jSplitPane1.setRightComponent(jScrollPane1);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(100, 324));
        jTreePantry.setMinimumSize(new java.awt.Dimension(24, 24));
        jTreePantry.setModel(fm.getTreeModel());
        jScrollPane3.setViewportView(jTreePantry);

        jSplitPane1.setLeftComponent(jScrollPane3);

        jInternalFramePantry.getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jInternalFramePantry.setBounds(10, 0, 420, 230);
        desktopPane.add(jInternalFramePantry, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");
        openMenuItem.setText("Open");
        openMenuItem.setEnabled(false);
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        saveMenuItem.setEnabled(false);
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setEnabled(false);
        fileMenu.add(saveAsMenuItem);

        fileMenu.add(jSeparator2);

        jMenuItemPreferences.setLabel("Preferences");
        jMenuItemPreferences.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                preferencesMenu(evt);
            }
        });

        fileMenu.add(jMenuItemPreferences);

        jMenuItemExport.setText("Export");
        jMenuItemExport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exportAction(evt);
            }
        });

        fileMenu.add(jMenuItemExport);

        fileMenu.add(jSeparator3);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        helpMenu.setText("Help");
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aboutMenuItemActionPerformed(evt);
            }
        });

        helpMenu.add(aboutMenuItem);

        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                helpMenuItemActionPerformed(evt);
            }
        });

        helpMenu.add(helpMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_helpMenuItemActionPerformed
    {//GEN-HEADEREND:event_helpMenuItemActionPerformed
	//user closed it, so remove it before reopening
	if(this.helpJInternalFrame != null && this.helpJInternalFrame.isClosed())
	{
	    desktopPane.remove(this.helpJInternalFrame);
	    this.helpJInternalFrame = null;
	}
	//if the help window doesn't exist, create it
	if(this.helpJInternalFrame == null)
	{
	    this.helpJInternalFrame = new HelpJInternalFrame(fm.getHelpUrl());
	    desktopPane.add(helpJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
	    helpJInternalFrame.moveToFront();
	    helpJInternalFrame.setVisible(true);
	}
	else //move it to the front
	{
	    helpJInternalFrame.moveToFront();
	    try
	    {
		helpJInternalFrame.setSelected(true);
	    }
	    catch(Exception e)
	    {
		System.out.println(e);
	    }
	}
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aboutMenuItemActionPerformed
    {//GEN-HEADEREND:event_aboutMenuItemActionPerformed
	javax.swing.JOptionPane.showMessageDialog(null,Constants.ABOUT_MESSAGE,Constants.ABOUT_TITLE,javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jButtonConverterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonConverterActionPerformed
    {//GEN-HEADEREND:event_jButtonConverterActionPerformed
    //make sure you can see it
	if(converterJInternalFrame.isVisible())
	{
	    converterJInternalFrame.moveToFront();
	    try
	    {
		converterJInternalFrame.setSelected(true);
	    }
	    catch(Exception e)
	    {
		System.out.println(e);
	    }
	    
	}
	else
	{
	    converterJInternalFrame.show();
	}
    }//GEN-LAST:event_jButtonConverterActionPerformed

    private void jButtonPantryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPantryActionPerformed
    {//GEN-HEADEREND:event_jButtonPantryActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonPantryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
	if(reportJInteralFrame.isVisible())
	{
	    reportJInteralFrame.moveToFront();
	    try
	    {
		reportJInteralFrame.setSelected(true);
	    }
	    catch(Exception e)
	    {
		System.out.println(e);
	    }
	    
	}
	else
	{
	    reportJInteralFrame.show();
	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void windowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_windowClosing
    {//GEN-HEADEREND:event_windowClosing
	//window closing so write out properties
	fm.writeProperties();
    }//GEN-LAST:event_windowClosing

    private void preferencesMenu()
    {
	if(OptionsJInternalFrame == null || OptionsJInternalFrame.isClosed())
	{
	    this.OptionsJInternalFrame = new OptionsJInternalFrame(fm);
	    desktopPane.add(OptionsJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
	}
	OptionsJInternalFrame.show();
    }
    private void preferencesMenu(java.awt.event.ActionEvent evt)//GEN-FIRST:event_preferencesMenu
    {//GEN-HEADEREND:event_preferencesMenu
	
	 preferencesMenu();
    }//GEN-LAST:event_preferencesMenu

    private void exportAction(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exportAction
    {//GEN-HEADEREND:event_exportAction
	this.exportJInternalFrame = new ExportJInternalFrame(fm);
	desktopPane.add(exportJInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
	this.exportJInternalFrame.show();

    }//GEN-LAST:event_exportAction

    private void PantryMouseReleasedHandler(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PantryMouseReleasedHandler
    {//GEN-HEADEREND:event_PantryMouseReleasedHandler
	
	//make sure you can see it
	if(pantryjInternalFrame.isVisible())
	{
	    pantryjInternalFrame.moveToFront();
	    try
	    {
		pantryjInternalFrame.setSelected(true);
	    }
	    catch(Exception e)
	    {
		System.out.println(e);
	    }
	    
	}
	else
	{
	    pantryjInternalFrame.show();
	}
	

    }//GEN-LAST:event_PantryMouseReleasedHandler

    private void PantryReleasedHandler(java.awt.event.KeyEvent evt)//GEN-FIRST:event_PantryReleasedHandler
    {//GEN-HEADEREND:event_PantryReleasedHandler
	
	
    }//GEN-LAST:event_PantryReleasedHandler
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodThingerMainWindow().setVisible(true);
            }
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonConverter;
    private javax.swing.JButton jButtonPantry;
    private javax.swing.JInternalFrame jInternalFramePantry;
    private javax.swing.JMenuItem jMenuItemAddNewFood;
    private javax.swing.JMenuItem jMenuItemExport;
    private javax.swing.JMenuItem jMenuItemPreferences;
    private javax.swing.JPopupMenu jPopupMenuRightClick;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTablePantry;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTree jTreePantry;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    
}
