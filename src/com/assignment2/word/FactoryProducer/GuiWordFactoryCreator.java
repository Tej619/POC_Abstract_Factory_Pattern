package com.assignment2.word.FactoryProducer;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.ConcreteFactory.Word00Factory;
import com.assignment2.word.ConcreteFactory.Word10Factory;
import com.assignment2.word.ConcreteFactory.Word21Factory;
import com.assignment2.word.ConcreteFactory.Word90Factory;

public class GuiWordFactoryCreator {
	public static GuiFactoryWord createFactory(String version) {
        switch (version.trim()) {
            case "Word90": return Word90Factory.getInstance();
            case "Word00": return Word00Factory.getInstance();
            case "Word10": return Word10Factory.getInstance();
            case "Word21": return Word21Factory.getInstance();
            default: throw new IllegalArgumentException("Unknown version: " + version);
        }
    }
}
