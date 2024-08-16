package abstractFactory.button;

public class MacButton implements Button {

    @Override
    public void clickMe() {
        System.out.println("Mac button clicked");
    }

    @Override
    public String type() {
        return "primary";
    }

}
