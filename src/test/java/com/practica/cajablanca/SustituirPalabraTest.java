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
		editor.leerFichero("c2.txt");
		System.out.println(editor.getLinea(1));
		salida.addLast(new SingleLinkedListImpl<String>());
		System.out.println(salida);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	@Test
	void C3Test() throws EmptyCollectionException {
		editor.leerFichero("c3.txt");
		SingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
		aux.addLast("b");
		salida.addLast(aux);
		System.out.println(salida);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	
	@Test
	void C4Test() throws EmptyCollectionException {
		editor.leerFichero("c4.txt");
		SingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
		aux.addLast("b");
		salida.addLast(aux);
		System.out.println(salida);
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	
	@Test
	void C5Test() throws EmptyCollectionException {
		editor.leerFichero("c5.txt");
		salida.addLast(new SingleLinkedListImpl<String>());
		salida.addLast(new SingleLinkedListImpl<String>());
		System.out.println(salida);
		System.out.println(editor.getLinea(1));
		System.out.println(editor.getLinea(2));
		editor.sustituirPalabra("a", "b");
		assertTrue(compararEditores(editor, salida));
	}
	
	boolean compararEditores(Editor e1, SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> e2) throws EmptyCollectionException {
		System.out.println(e1.size() + " " + e2.size());
		if (e1.size() != e2.size()) 
			return false;
		int size = e1.size();
		boolean continua = true;
		for (int i = 1; i <= size && continua; i++) {
			AbstractSingleLinkedListImpl<String> l1 = e1.getLinea(i);
			AbstractSingleLinkedListImpl<String> l2 = e2.getAtPos(i);
			System.out.println(l1 + " " + l1.size() + " " + l2 +" " + l2.size());
			if (l1.size() > 0) System.out.println(l1.getAtPos(1));
			if (l1.size() == l2.size()) {
				for (int j = 1; j <= l1.size() && continua; j++) {
					if (!l1.getAtPos(j).equals(l2.getAtPos(j))) {
						System.out.println("owo");
						continua = false;
					}
				}
			} else { continua = false; 						System.out.println("uwu");}
				/*
			if (!l1.equals(l2))
				continua = false;
				*/
		}

		return continua;
	}
}
