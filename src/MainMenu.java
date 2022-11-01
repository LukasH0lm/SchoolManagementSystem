public class MainMenu extends Menu{



    public MainMenu(String headerText, String[] menuItems){
        super("header text",menuItems);

    }

    @Override
    protected void doAction(int option) {

        if (option == 1){
            System.out.println("option 1 was picked");
        }
        if (option == 2){
            System.out.println("option 2 was picked");
        }
        if (option == 3){
            System.out.println("option 3 was picked");
        }

    }
}
