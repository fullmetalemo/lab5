package app;
import java.util.Scanner;

import commands.*;
import utilities.*;

public class Running{
  
  public static void main(String[] args){
    try (Scanner newScanner = new Scanner){
      final String envVariable = "LAB";

            PassportAsker passportAsker = new PassportAsker(userScanner);
            FileManager fileManager = new FileManager(envVariable);
            CollectionManager collectionManager = new CollectionManager(fileManager);
    
            CommandManager commandManager = new CommandManager( //not finished
            new Help(),
            new Info(),
            new Show(),
            new Add(),
            new UpdateID(),
            new RemoveByID(),
            new Clear(),
            new Save(),
            new Exit(),
            new ExecuteScript(),
            new AddIfMax(),
            new RemoveGreater(),
            new History(),
            new MaxByHeight(),
            new FilterByNationality(),
            new FilterGreaterThanBirthday()
          );
          Console console = new Console(commandManager, userScanner, marineAsker);
          console.interactiveMode();
    }
  }
}
