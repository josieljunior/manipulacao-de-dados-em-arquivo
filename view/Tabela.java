package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Dados;
import model.ListaEncadeada;

public class Tabela extends JFrame {

	JTable jt;
	DefaultTableModel dtm;
	JScrollPane jsPane = new JScrollPane();	
	public static Boolean aberto = false;

	public void exibirTabela(ListaEncadeada listaEncadeada) {
		
		this.setBounds(500, 100, 750, 500);

		String[] titulos = { "Id","Data", "Hora", "Estacao", "Poluente", "Valor", "Unidade", "Tipo" };
		dtm = new DefaultTableModel(titulos, 0);
		Dados aux = ListaEncadeada.getCabeca();

		while (aux != null) {
			String[] dados = { Integer.toString(aux.getId()),
					           aux.getData(),
					           aux.getHora(), 
					           aux.getEstacao(),
					           aux.getPoluente(),
					           Double.toString(aux.getValor()),
					           aux.getUnidade(), 
					           aux.getTipo()};
			dtm.addRow(dados);
			aux = aux.getProximo();
		}
		jt = new JTable(dtm);

		jsPane.setViewportView(jt);

		this.add(jsPane);
		this.setVisible(true);
	}
}
