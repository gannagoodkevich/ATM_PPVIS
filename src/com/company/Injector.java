package com.company;

import java.util.ArrayList;

public class Injector {
    public ArrayList<Window> getAllWondows(){
        Controller controller = new Controller();
        ArrayList<Window> windows = new ArrayList<Window>();
        Window languageChooser = new LanguageChooser(controller);
        Window cardEnter = new CardEnter(controller);
        Window window = new MoneySetter(controller);
        Window paper = new PaperSetter(controller);
        Window pin = new PinEnter(controller);
        Window acc = new AccountViewer(controller);
        Window money = new MoneyGiver(controller);
        Window trans = new MoneyTransaction(controller);
        Window pay = new Payment(controller);
        Window card = new CardGiver(controller);
        windows.add(cardEnter);
        windows.add(languageChooser);
        windows.add(paper);
        windows.add(pin);
        windows.add(acc);
        windows.add(money);
        windows.add(trans);
        windows.add(pay);
        windows.add(card);
        windows.add(window);
        InteractionSupport support = new InteractionSupport(controller);
        InteractionUser user = new InteractionUser(controller, windows);
        Window choose_window = new InteractionChooser(user, support);
        windows.add(choose_window);
        choose_window.createUI();
        return windows;
    }
}
