package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.button.MacButton;
import abstractFactory.inputbox.Inputbox;
import abstractFactory.inputbox.MacInputbox;

public class MacFactory implements Factory {

    @Override
    public Button createBtn() {
        return new MacButton();
    }

    @Override
    public Inputbox createInputbox() {
        return new MacInputbox();
    }

}
