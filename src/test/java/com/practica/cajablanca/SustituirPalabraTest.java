package com.practica.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

class SustituirPalabraTest {

	private Editor editor;
	private SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> salida;

	@BeforeEach
	void setUp() throws Exception {
		editor = new Editor();
		salida = new SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>>();

	}
	
	@Test
	void C1Test() throws EmptyCollectionException {
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	
	@Test
	void C2Test() throws EmptyCollectionException {
		editor.leerFichero("SustituirPalabraC2.txt");
		salida.addLast(new SingleLinkedListImpl<String>());
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	@Test
	void C3Test() throws EmptyCollectionException {
		editor.leerFichero("SustituirPalabraC3.txt");
		SingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
		aux.addLast("b");
		salida.addLast(aux);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	
	@Test
	void C4Test() throws EmptyCollectionException {
		editor.leerFichero("SustituirPalabraC4.txt");
		SingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
		aux.addLast("b");
		salida.addLast(aux);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	
	@Test
	void C5Test() throws EmptyCollectionException {
		editor.leerFichero("SustituirPalabraC5.txt");
		SingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
		aux.addLast("b");
		SingleLinkedListImpl<String> aux2 = new SingleLinkedListImpl<String>();
		aux2.addLast("b");
		salida.addLast(aux);
		salida.addLast(aux2);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	boolean compararEditores(Editor e1, SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> e2) throws EmptyCollectionException {
		if (e1.size() != e2.size()) 
			return false;
		int size = e1.size();
		boolean continua = true;
		for (int i = 1; i <= size && continua; i++) {
			AbstractSingleLinkedListImpl<String> l1 = e1.getLinea(i);
			AbstractSingleLinkedListImpl<String> l2 = e2.getAtPos(i);
			if (l1.size() > 0) System.out.println(l1.getAtPos(1));
			if (l1.size() == l2.size()) {
				for (int j = 1; j <= l1.size() && continua; j++) {
					if (!l1.getAtPos(j).equals(l2.getAtPos(j))) {
						continua = false;
					}
				}
			} else { continua = false;}
		}

		return continua;
	}
}
