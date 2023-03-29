/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
/*
* menu creator for console
* */
public class TerminalMenu {
    private String[] items;
    private char[] itemTriggers;
    private char quitKey;

    public TerminalMenu(String[] items, char quitKey, char[] itemTriggers) {
        this.items = items;
        this.quitKey = quitKey;
        this.itemTriggers = itemTriggers;
    }

    public char[] getItemTriggers() {
        return itemTriggers;
    }

    public void setItemTriggers(char[] itemTriggers) {
        this.itemTriggers = itemTriggers;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public char getQuitKey() {
        return quitKey;
    }

    public void setQuitKey(char quitKey) {
        this.quitKey = quitKey;
    }

    public void printMenuToConsole() {
        for (int i = 0; i < this.items.length; i++) {
            System.out.println(this.itemTriggers[i] + ". " + this.items[i]);
        }
    }

    public void printMenuQuitCode(char inputKey) {
        System.out.println("Enter " + inputKey + " to quit.");
    }

    public boolean validateChoice(char choice) {

        for (int i = 0; i < this.itemTriggers.length; i++) {
            if (choice == itemTriggers[i]) return true;
        }
        return quitKey == choice;
    }

    public boolean validateChoice(String choices) {
        return choices.length()==1;
    }

    public void printMenuChoiceCode() {
        System.out.print("Enter your choice: ");
    }

    public void printMenuChoiceError() {
        System.out.print("No such choice! please enter again: ");
    }


}
