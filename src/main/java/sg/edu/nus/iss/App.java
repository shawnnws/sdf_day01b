package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Console con = System.console();

        ArrayList<String> toDos = new ArrayList<String>();

        String input = "";

        while (!input.equals("quit")) {
            input = con.readLine("Enter a string: ");

            if (!input.equals("quit")) {
                toDos.add(input);
            }
        }

        for (String toDo : toDos) {
            System.out.println("Task: " + toDo);
        }
    }
}
