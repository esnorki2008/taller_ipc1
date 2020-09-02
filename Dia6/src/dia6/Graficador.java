/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

import dia6.Libro;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Esnorki
 */
public class Graficador extends JFrame{
    private String Titulo;
    private String NombreX,NombreY;
    private DefaultCategoryDataset ContenidoGrafica;

    public Graficador(String Titulo, String NombreX,String NombreY) {
        this.Titulo = Titulo;
        this.NombreX = NombreX;
        this.NombreY = NombreY;
        this.setSize(800, 600);
        this.ContenidoGrafica = new DefaultCategoryDataset();
    }
    
    public void CargarLibro(Libro Nuevo){
        this.ContenidoGrafica.addValue(Nuevo.getCantidad(), Nuevo.getNombre(),Nuevo.getGeneroLibro().getNombre());
    }
    
    public void CargarGrafica(){
        JFreeChart barChart = ChartFactory.createBarChart(
                this.Titulo,
                this.NombreX,
                this.NombreY,
                ContenidoGrafica,
                PlotOrientation.VERTICAL,
                true,
                true,
                true);
        
        ChartPanel panel = new ChartPanel(barChart);
        JPanel grafica = new JPanel();
        grafica.add(panel);
        
        this.add(grafica);
        grafica.setVisible(true);
        this.setVisible(true);
    }
}
