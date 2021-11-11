package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Exportar {
	
	public Exportar() throws IOException {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("/aps2/"));
		int retrival = chooser.showSaveDialog(null);
		if (retrival == JFileChooser.APPROVE_OPTION) {
			try(BufferedWriter br = new BufferedWriter(new FileWriter("Aplicacao.txt"))) {
				
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
					br.write(dados[0] + "," 
						   + dados[1] + "," 
						   + dados[2] + "," 
						   + dados[3] + "," 
						   + dados[4] + "," 
						   + dados[5] + "," 
						   + dados[6] + "," 
						   + dados[7] );
					br.newLine();
					aux = aux.getProximo();
				}
				br.close();
			}
		}
	}

}
