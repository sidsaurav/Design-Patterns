package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.inputbox.Inputbox;

public interface Factory {
    Button createBtn();

    Inputbox createInputbox();
}
