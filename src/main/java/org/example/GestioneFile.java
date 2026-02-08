package org.example;

import java.io.*;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class GestioneFile {

    // 1) Leggi file con BufferedReader e stampa su standard output
    public static void leggiConBufferedReader(String nomeFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                System.out.println(riga);
            }
        } catch (IOException e) {
            System.err.println("Errore in lettura: " + e.getMessage());
        }
    }

    // 2) Leggi JSON con Gson e crea lista di oggetti Azione
    public static List<Azione> leggiConGson(String nomeFile) {
        try (Reader reader = new FileReader(nomeFile)) {
            Gson gson = new Gson();
            Type tipoLista = new TypeToken<List<Azione>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Errore in lettura JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // 4) Scrivi lista aggiornata su file JSON
    public static void scriviConGson(String nomeFile, List<Azione> lista) {
        try (Writer writer = new FileWriter(nomeFile)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(lista, writer);
        } catch (IOException e) {
            System.err.println("Errore in scrittura JSON: " + e.getMessage());
        }
    }
}
