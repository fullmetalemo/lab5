package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static utilities.ConsoleManager.PrintError;

public class ScriptManager {
    private Scanner scriptReader;

    public ScriptManager(String file) {
        try {
            scriptReader = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            PrintError("Файл не найден");
        }
    }

    public String getNextLine() {
        try {
            return scriptReader.nextLine().trim();
        } catch (NullPointerException | NoSuchElementException e){
            return null;
        }
    }
    public Scanner getScanner() {
        return scriptReader;
    }
}
