package aps2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {
	static ListaEncadeada lista = new ListaEncadeada();
	private int id = 0;

	  public void run()  {

	    String arquivoTXT = "aps2/dados.txt";
	    BufferedReader br = null;
	    String linha = "";
	    String Divisor = ",";
	    
	    try {

	        br = new BufferedReader(new FileReader(arquivoTXT));
	        while ((linha = br.readLine()) != null) {

	            String[] pais = linha.split(Divisor);
	            Dados dados = new Dados();
	           	            
	            dados.setData(pais[0]);
	            dados.setHora(pais[1]);
	            dados.setEstacao(pais[2]);
	            dados.setPoluente(pais[3]);
	            dados.setValor(pais[4]);
	            dados.setUnidade(pais[5]);
	            dados.setTipo(pais[6]);
	            dados.setId(id);
	            
	            lista.adicionarElementoNoInicioDaLista(dados);
	            ListaEncadeada.setTotal(ListaEncadeada.getTotal() + 1);
	            id++;
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
	   
	   /*try {
		vetor = lista.criarVetor();
	} catch (Exception e) {
		e.printStackTrace();
	}*/
	  }

	public static ListaEncadeada getLista() {
		return lista;
	}

	public static void setLista(ListaEncadeada lista) {
		LerTexto.lista = lista;
	}

	

	
	

}

