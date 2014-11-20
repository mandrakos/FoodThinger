/*
 * HelpJInternalFrame.java
 *
 * Created on May 27, 2008, 1:31 PM
 */

package foodthinger;

/**
 * this package loads an html version of the help file
 * @author  RC Stanley
 */
public class HelpJInternalFrame extends javax.swing.JInternalFrame
{
    String helpUrl;
    /** Creates new form HelpJInternalFrame */
    public HelpJInternalFrame(String helpUrl)
    {
	this.helpUrl = helpUrl;
	
	initComponents();
	
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        java.io.File f = null;
        try
        {
            f = new java.io.File(helpUrl);
            jEditorPane1 =
            new javax.swing.JEditorPane(f.toURI().toURL());
        }
        catch(java.io.IOException e)
        {
            jEditorPane1 = new javax.swing.JEditorPane();
            System.out.println(e);
            jEditorPane1.setText("Unable to load the help file. Please go to http://www.foodthinger.com");
        }
        jEditorPane1.addHyperlinkListener(new Hyperactive());

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Help");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
                goodbyeHandler(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPane1.setEditable(false);
        jEditorPane1.setToolTipText("");
        jEditorPane1.setContentType("text/html");
        jScrollPane1.setViewportView(jEditorPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void goodbyeHandler(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_goodbyeHandler
    {//GEN-HEADEREND:event_goodbyeHandler
	
    }//GEN-LAST:event_goodbyeHandler
    class Hyperactive implements javax.swing.event.HyperlinkListener {
 
         public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent e) {
 	          if (e.getEventType() == javax.swing.event.HyperlinkEvent.EventType.ACTIVATED) {
 		      javax.swing.JEditorPane pane = (javax.swing.JEditorPane) e.getSource();
 		      if (e instanceof javax.swing.text.html.HTMLFrameHyperlinkEvent) {
 		          javax.swing.text.html.HTMLFrameHyperlinkEvent  evt = (javax.swing.text.html.HTMLFrameHyperlinkEvent)e;
 		          javax.swing.text.html.HTMLDocument doc = (javax.swing.text.html.HTMLDocument)pane.getDocument();
 		          doc.processHTMLFrameHyperlinkEvent(evt);
 		      } else {
 		          try {
 			      pane.setPage(e.getURL());
 		          } catch (Throwable t) {
 			      t.printStackTrace();
 		          }
 		      }
 	          }
 	      }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}