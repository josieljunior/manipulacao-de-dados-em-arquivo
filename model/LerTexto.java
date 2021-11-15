package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {
	public static ListaEncadeada lista = new ListaEncadeada();

	public void ler() {

		String arquivoTXT = "aps2/dados.txt";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = ",";
		int cont = 1;

		try {

			br = new BufferedReader(new FileReader(arquivoTXT));
			while (cont < ListaEncadeada.getLimite()+1) {
				linha = br.readLine();
				String[] coluna = linha.split(csvDivisor);
				Dados dados = new Dados();

				dados.setData(coluna[0].replace("\"", ""));
				dados.setHora(coluna[1].replace("\"", ""));
				dados.setEstacao(coluna[2].replace("\"", ""));
				dados.setPoluente(coluna[3].replace("\"", ""));
				dados.setValor(Double.parseDouble(coluna[4]));
				dados.setUnidade(coluna[5].replace("\"", ""));
				dados.setTipo(coluna[6].replace("\"", ""));
				dados.setId(cont);

				lista.adicionarElementoNoInicioDaLista(dados);
				cont++;
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

	public static ListaEncadeada getLista() {
		return lista;
	}

	public static void setLista(ListaEncadeada lista) {
		LerTexto.lista = lista;
	}

}
