package ementor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Arquivo implements Serializable{
	public void salvarNoDisco(Object[] meuObjeto, String nomeArquivo) {
		
		File arquivo = new File(nomeArquivo); //cria o arquivo fisicamente
		
		try {
			FileOutputStream fout = new FileOutputStream(arquivo);
			ObjectOutputStream ObjetoGravacao = new ObjectOutputStream (fout);
			
			ObjetoGravacao.writeObject(meuObjeto);
			
			ObjetoGravacao.flush();
			ObjetoGravacao.close();
			fout.close();
					
			
		}catch(Exception ex) {
			System.out.println("ERRO:" + ex.toString());
		}	
	}
	
	public Object[] lerDoDisco (Object [] vetor, String nomeArquivo) {
		File arquivo = new File(nomeArquivo); //cria o arquivo fisicamente
		
		try {
			FileInputStream arquivoFisico = new FileInputStream(arquivo);
			ObjectInputStream OEntrada = new ObjectInputStream(arquivoFisico);
			
			vetor = (Object[]) OEntrada.readObject();
			
			OEntrada.close();
			arquivoFisico.close();
			
		}catch(Exception ex) {
			System.out.println("ERRO:" + ex.toString());
		}
		
		return vetor;
	}
	
	
	public void salvarNoDiscoIndiceI(int indiceI, String nomeArquivo) {
		
		File arquivo = new File(nomeArquivo); //cria o arquivo fisicamente
		
		try {
			FileOutputStream fout = new FileOutputStream(arquivo);
			ObjectOutputStream ObjetoGravacao = new ObjectOutputStream (fout);
			
			ObjetoGravacao.writeObject(indiceI);
			
			ObjetoGravacao.flush();
			ObjetoGravacao.close();
			fout.close();
					
			
		}catch(Exception ex) {
			System.out.println("ERRO:" + ex.toString());
		}	
	}
	
	public int lerDoDiscoIndiceI (String nomeArquivo) {
		File arquivo = new File(nomeArquivo); //cria o arquivo fisicamente
		int indiceI =0;
		
		try {
			FileInputStream arquivoFisico = new FileInputStream(arquivo);
			ObjectInputStream OEntrada = new ObjectInputStream(arquivoFisico);
			
			indiceI = (int) OEntrada.readObject();
			
			OEntrada.close();
			arquivoFisico.close();
			
		}catch(Exception ex) {
			System.out.println("ERRO:" + ex.toString());
		}
		
		return indiceI;
	}
}

