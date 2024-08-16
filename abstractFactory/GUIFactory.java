package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WinFactory;

public class GUIFactory {
    public static Factory createWindowsFactory() {
        return new WinFactory();
    }

    public static Factory createMacFactory() {
        return new MacFactory();
    }
}
