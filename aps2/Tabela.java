package aps2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela extends JFrame {

	// Elementos da Tabela:
	JTable jt;
	DefaultTableModel dtm;
	JScrollPane jsPane = new JScrollPane();
	
	public Tabela() {
		this.montaJanela();
	}
	public void montaJanela() {
		this.setBounds(100, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Montando a Tabela:
		String[] titulos = {"Data", "Hora", "Estação", "Poluente", "Valor","Unidade","Tipo"};
		dtm = new DefaultTableModel(titulos, 0);
		
		LerTexto obj = new LerTexto();
	    obj.run();
		
	   
		
	    
	    Dados aux = obj.lista.getCabeca();
        
	    while (aux != null) {
        	String[] dados = {aux.getData(),aux.getHora(),aux.getEstacao(),aux.getPoluente(),aux.getValor(),aux.getUnidade(),aux.getTipo()};
        	dtm.addRow(dados);
            aux = aux.getProximo();
        }
	    
		
		
		
		// Instanciando a Table com o DefaultTableModel
		jt = new JTable(dtm);
		
		// Inserindo a Tabela na "Tela com barra de rolagem"
		jsPane.setViewportView(jt);
		
		this.add(jsPane);
		this.setVisible(true);
	}
}
