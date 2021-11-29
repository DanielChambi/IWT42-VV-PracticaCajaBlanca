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


public class MayorLongitudTest {
	
	Editor editor;
	
	@Test
	void C1Test() throws EmptyCollectionException {
		editor = new Editor();
		assertNull(editor.mayorLongitud());
	}
	
	@Test
	void C3Test() throws EmptyCollectionException {
		editor = new Editor();
		editor.leerFichero("MayorLongitudC3.txt");
		assertNull(editor.mayorLongitud());
	}
	
	@Test
	void C4Test() throws EmptyCollectionException {
		editor = new Editor();
		editor.leerFichero("MayorLongitudC4.txt");
		assertEquals("abc" ,editor.mayorLongitud());
	}
	
	@Test
	void C7Test() throws EmptyCollectionException {
		editor = new Editor();
		editor.leerFichero("MayorLongitudC7.txt");
		assertEquals("abc" ,editor.mayorLongitud());
	}
	
	@Test
	void C8Test() throws EmptyCollectionException {
		editor = new Editor();
		editor.leerFichero("MayorLongitudC8.txt");
		assertEquals("efgh" ,editor.mayorLongitud());
	}
}
