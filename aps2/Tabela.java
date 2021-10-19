package aps2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Tabela extends JFrame {
	JTable jt;
	DefaultTableModel dtm;
	JScrollPane jsPane = new JScrollPane();
	
	public void montarTabela(Dados[] vetor) {
		this.setBounds(500, 100, 750, 500);
		
		String[] titulos = {"Data", "Hora", "Estacao", "Poluente", "Valor","Unidade","Tipo"};
		dtm = new DefaultTableModel(titulos, 0);

	    for (int i=0; i<vetor.length;i++) {
	    	Dados aux = vetor[i];
        	String[] dados = {aux.getData(),aux.getHora(),aux.getEstacao(),aux.getPoluente(),aux.getValor(),aux.getUnidade(),aux.getTipo()};
        	dtm.addRow(dados);
        }
		
		// Instanciando a Table com o DefaultTableModel
		jt = new JTable(dtm);
		
		// Inserindo a Tabela na "Tela com barra de rolagem"
		jsPane.setViewportView(jt);
		
		this.add(jsPane);
		this.setVisible(true);
		
	}
}
