package sk.kasv.mizak.sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\rmiza\\OneDrive\\Dokumenty\\sudoku.txt"));
        MapCreator mapCreator=new MapCreator();
        mapCreator.process(input);

    }
}
