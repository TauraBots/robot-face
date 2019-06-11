

package src;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author victor
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motor Angles");
        setBackground(new java.awt.Color(254, 254, 254));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 12, 350, 230);

        jPanel2.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(420, 10, 350, 230);

        jPanel3.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 260, 350, 230);

        jPanel4.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel4);
        jPanel4.setBounds(420, 260, 350, 230);

        setSize(new java.awt.Dimension(822, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        XYSeries series1 = new XYSeries("Motor Servo Angles");
	XYSeriesCollection dataset1 = new XYSeriesCollection(series1);
        series1.setMaximumItemCount(100);
        XYSeries series2 = new XYSeries("Motor Servo Angles");
	XYSeriesCollection dataset2 = new XYSeriesCollection(series2);
        series2.setMaximumItemCount(100);
        XYSeries series3 = new XYSeries("Motor Servo Angles");
	XYSeriesCollection dataset3 = new XYSeriesCollection(series3);
        series3.setMaximumItemCount(100);
        XYSeries series4 = new XYSeries("Motor Servo Angles");
	XYSeriesCollection dataset4 = new XYSeriesCollection(series4);
        series4.setMaximumItemCount(100);
	JFreeChart chart1 = ChartFactory.createXYLineChart("Motor angle 1", "Time (seconds)", "ADC Reading", dataset1, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart2 = ChartFactory.createScatterPlot("Motor angle 2", "Time (seconds)", "ADC Reading", dataset2, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart3 = ChartFactory.createXYStepAreaChart("Motor angle 3", "Time (seconds)", "ADC Reading", dataset3, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart4 = ChartFactory.createXYStepChart("Motor angle 4", "Time (seconds)", "ADC Reading", dataset4, PlotOrientation.VERTICAL, true, true, true);
	jPanel1.add(new ChartPanel(chart1), BorderLayout.CENTER);
        jPanel1.setMinimumSize(jPanel1.getMaximumSize());
        jPanel2.add(new ChartPanel(chart2), BorderLayout.CENTER);
        jPanel2.setMinimumSize(jPanel2.getMaximumSize());
        jPanel3.add(new ChartPanel(chart3), BorderLayout.CENTER);
        jPanel3.setMinimumSize(jPanel3.getMaximumSize());
        jPanel4.add(new ChartPanel(chart4), BorderLayout.CENTER);
        jPanel4.setMinimumSize(jPanel4.getMaximumSize());
        
        Thread thread = new Thread(){
            @Override 
            public void run() {
                try {
                    int contador = 0;
                    double rad;
                    while(true){
                        contador = contador + 2;
                        rad = (Math.PI/180)*contador;
                        series1.add(contador,Math.sin(rad));
                        jPanel1.repaint();
                        Thread.sleep(40);
                    }
                } catch(NumberFormatException e) {} catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	};
	thread.start();
        
        Thread thread2 = new Thread(){
            @Override 
            public void run() {
                try {
                    int contador = 0;
                    double rad;
                    while(true){
                        contador = contador + 2;
                        rad = (Math.PI/180)*contador;
                        series2.add(contador,Math.cos(rad));
                        jPanel2.repaint();
                        Thread.sleep(40);
                    }
                } catch(NumberFormatException e) {} catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	};
	thread2.start();
        
        Thread thread3 = new Thread(){
            @Override 
            public void run() {
                try {
                    int contador = 0;
                    double rad;
                    while(true){
                        contador = contador + 2;
                        rad = (Math.PI/180)*contador;
                        series3.add(contador,Math.cos(rad));
                        jPanel3.repaint();
                        Thread.sleep(40);
                    }
                } catch(NumberFormatException e) {} catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	};
	thread3.start();
        
        Thread thread4 = new Thread(){
            @Override 
            public void run() {
                try {
                    int contador = 0;
                    double rad;
                    while(true){
                        contador = contador + 2;
                        rad = (Math.PI/180)*contador;
                        series4.add(contador,Math.sin(rad));
                        jPanel4.repaint();
                        Thread.sleep(40);
                    }
                } catch(NumberFormatException e) {} catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	};
	thread4.start();
        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
