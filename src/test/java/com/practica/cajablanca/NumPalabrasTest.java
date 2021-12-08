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
public class NumPalabrasTest {
	
	private Editor editor;
	private SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> salida;

	@BeforeEach
	void setUp() throws Exception {
		editor = new Editor();
		salida = new SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>>();

	}
	
	@Test
	void C1Test() throws EmptyCollectionException {

		  assertThrows(IllegalArgumentException.class, () -> {
			  editor.numPalabras(0, 2,"a");
	       });

	}
	
	
	
	
	
	@Test
	void C2Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC2.txt");
		
		  assertThrows(IllegalArgumentException.class, () -> {
			  editor.numPalabras(1, 2,"a");
	       });

	}
	
	
	
	@Test
	void C3Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC3.txt");
		
		  
		 assertEquals(0,editor.numPalabras(1,-1,"a"));
	      

	}
	
	
	
	@Test
	void C4Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC4.txt");
		
		  
		 assertEquals(0,editor.numPalabras(1,1,"a"));
	      

	}
	
	
	@Test
	void C5Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC5.txt");
		
		  
		 assertEquals(0,editor.numPalabras(1,2,"b"));
	      

	}
	
	
	
	@Test
	void C6Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC6.txt");
		
		 assertEquals(0,editor.numPalabras(1,2,"b"));
	      

	}
	
	
	
	@Test
	void C7Test() throws EmptyCollectionException {
		editor.leerFichero("NumPalabrasC7.txt");
		
		 assertEquals(1,editor.numPalabras(1,2,"a"));
	      

	}
}