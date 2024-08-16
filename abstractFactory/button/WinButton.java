package abstractFactory.button;

public class WinButton implements Button {

    @Override
    public void clickMe() {
        System.out.println("Windows button clicked");
    }

    @Override
    public String type() {
        return "primary";
    }

}
