package aps2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {
	ListaEncadeada lista = new ListaEncadeada();

	public void run() {

		String arquivoCSV = "aps2/dados.txt";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = ",";
		int cont =0;

		try {

			br = new BufferedReader(new FileReader(arquivoCSV));
			while (cont <500000) {
				linha = br.readLine();
				String[] pais = linha.split(csvDivisor);
				Dados dados = new Dados();

				dados.setData(pais[0]);
				dados.setHora(pais[1]);
				dados.setEstacao(pais[2]);
				dados.setPoluente(pais[3]);
				dados.setValor(Double.parseDouble(pais[4]));
				dados.setUnidade(pais[5]);
				dados.setTipo(pais[6]);

				lista.adicionarElementoNoInicioDaLista(dados);
				cont ++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ListaEncadeada getLista() {
		return lista;
	}

}
