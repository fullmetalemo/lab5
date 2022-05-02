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
    
            CommandManager commandManager = new CommandManager(
            new Help(),
            new Info(collectionManager),
            new Show(collectionManager),
            new Add(collectionManager, personAsker),
            new UpdateID(collectionManager, personAsker),
            new RemoveByID(collectionManager),
            new Clear(collectionManager),
            new Save(collectionManager),
            new Exit(),
            new ExecuteScript(),
            new AddIfMax(collectionManager, personAsker),
            new RemoveGreater(collectionManager, personAsker),
            new History(),
            new MaxByHeight(collectionManager),
            new FilterByNationality(collectionManager),
            new FilterGreaterThanBirthday(collectionManager, )
          );
          Console console = new Console(commandManager, userScanner, marineAsker);
          console.interactiveMode();
    }
  }
}
