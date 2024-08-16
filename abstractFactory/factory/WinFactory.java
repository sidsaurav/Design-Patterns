package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.button.WinButton;
import abstractFactory.inputbox.Inputbox;
import abstractFactory.inputbox.WinInputbox;

public class WinFactory implements Factory {

    @Override
    public Button createBtn() {
        return new WinButton();
    }

    @Override
    public Inputbox createInputbox() {
        return new WinInputbox();
    }

}
