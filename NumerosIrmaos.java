package br.com.Navita;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosIrmaos {
	
	static String retornarReusltado(String numeroDigitado) {
		String s=String.valueOf(Integer.parseInt(numeroDigitado));
		ArrayList<Integer>numero=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++) {
			numero.add(Integer.valueOf(Character.toString(s.charAt(i))));
		}
		Collections.sort(numero);
		Collections.reverse(numero);
		return numero.toString().replaceAll("\\D*","").trim();
	}

}
