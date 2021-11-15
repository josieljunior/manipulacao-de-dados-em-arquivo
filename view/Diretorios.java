package view;

import java.io.File;

import javax.swing.JOptionPane;

public class Diretorios {
	
	public Diretorios() {
	}
	
	public void CriaDiretorio(String local) {
		
		File dir = new File("c:/"+ local);
		if (!dir.exists()) {
			dir.mkdir();
			JOptionPane.showMessageDialog(null, "Diretório criado com sucesso.");
		}else {
			JOptionPane.showMessageDialog(null, "Diretório acessado com sucesso");
		}
	}

	public String[] ListaDiretorio(String local) {
		
		File dir2 = new File("c:/"+ local);
		String lista[] = null;
		
		if(dir2.isDirectory() && (dir2.list() != null)) {
			lista = dir2.list();
		} 
		
		return lista;
	}
}
