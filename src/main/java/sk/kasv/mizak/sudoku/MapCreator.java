package sk.kasv.mizak.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class MapCreator {

    public ArrayList<String> process(Scanner input){
        ArrayList<String> sudokuMap=new ArrayList<>();
        while(input.hasNext()){
            sudokuMap.add(input.next());
        }
        System.out.println(sudokuMap);
        return sudokuMap;
    }

}
