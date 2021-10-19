package aps2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {
	ListaEncadeada lista = new ListaEncadeada();
	private Dados[] vetor;

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
	            
	            lista.adicionarElementoNoInicioDaLista(dados);
	            lista.setTotal(lista.getTotal() + 1);
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
	   
	   try {
		vetor = lista.criarVetor();
	} catch (Exception e) {
		e.printStackTrace();
	}
	  }

	public Dados[] getVetor() {
		return vetor;
	}

	public void setVetor(Dados[] vetor) {
		this.vetor = vetor;
	}

	
	

}

