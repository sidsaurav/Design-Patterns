package abstractFactory;

import abstractFactory.button.Button;
import abstractFactory.factory.Factory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WinFactory;
import abstractFactory.inputbox.Inputbox;

public class Main {
    public static void main(String[] args) {
        Factory windowsFactory = GUIFactory.createWindowsFactory();
        Button windowsButton = windowsFactory.createBtn();
        windowsButton.clickMe();

        Factory macFactory = new MacFactory();
        Inputbox macIB = macFactory.createInputbox();

        macIB.typeInMe();
    }
}

// do tarah ke btn -> win and mac so create an btn interface
// do trah k input box -> so input box interface

// do tarah ke factory -> mac and windows so factory interface

// finally ek abstract factory which will return mac and windows factory so ek
// class for abstract factory