package org.example;

public class MenuManager {

    public void initiate() {
        boolean exit = false;
        int selectedMenuOption = -1;

        UndoManager.myManager.removeAllLines();

        do {
            try {
                selectedMenuOption = menu();
            } catch (IncorrectMenuOptionException e) {
                System.out.println(e.getMessage());
            }

            switch (selectedMenuOption) {
                case 1:
                    UndoManager.myManager.addCommandLine(Entry.readString("Introduce the command to save:"));
                    break;
                case 2:
                    UndoManager.myManager.removeLastCommand();
                    break;
                case 3:
                    UndoManager.myManager.showHistory();
                    break;
                case 0:
                    UndoManager.myManager.removeAllLines();
                    exit = true;
                    break;
                default: break;
            }
        } while (!exit);
    }

    private int menu() throws IncorrectMenuOptionException {
        System.out.println(
                "\nMenú:" +
                        "\n1.- Add new command. " +
                        "\n2.- Remove last command. " +
                        "\n3.- Show commands history. " +
                        "\n0.- Exit."
        );

        int menuOption = Entry.readInt("Select a menu option between 0 and 3");
        if (menuOption < 0 || menuOption > 3) throw new IncorrectMenuOptionException("Menu option should be between 0 and 3.");
        else return menuOption;
    }
}
