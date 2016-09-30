package Util;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Grafo {
    private Object[][] matrizGrafo;
    
    public Grafo(){
        
    }
    
    public void addGrafo(){
        File arquivo = new File("testaPlanilha.xls");
        Workbook tabela = Workbook.getWorkbook(arquivo);
        Sheet[] abas = tabela.getSheets();
        Sheet aba = tabela.getSheet(0);
        matrizGrafo = new Object[aba.getRows()][aba.getColumns];
        
        Cell[] celulaTabela;
        for(int i = 0; i<matrizGrafo.length; i++){
            celulaTabela = aba.getRow(i);
            for(int j = 0; j< matrizGrafo[0].length;j++){
                matrizGrafo[i][j] = celulaTabela[j].getContents();
            }
        }
        
    }
    
    public  void imprimeGrafo(){
        for (int i = 0; i < matrizGrafo.length; i++) {

            for (int j = 0; j < matrizGrafo[0].length; j++) {

                System.out.print(matrizGrafo[i][j] + "\t");
            }
        }
    }


    
}
