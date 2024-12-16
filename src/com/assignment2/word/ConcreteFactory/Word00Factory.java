package com.assignment2.word.ConcreteFactory;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;
import com.assignment2.word.components.implementation.Word00Button;
import com.assignment2.word.components.implementation.Word00Panel;
import com.assignment2.word.components.implementation.Word00TextBox;

public class Word00Factory extends GuiFactoryWord {

	private static Word00Factory instance;
	private static int count = 0;

	private Word00Factory() {
	}

	public static synchronized Word00Factory getInstance() {
		if (count >= MAX_INSTANCES) {
			System.out.println("Warning: Word00 has exceeded maximum allowed instances (" + MAX_INSTANCES + ") and has current instance ("+(count+1)+")");
		}
		if (instance == null) {
			instance = new Word00Factory();
		}
		count++;
		return instance;
	}

	public static int getCount() {
        return count;
    }
    
    public static void resetCount() {
        count = 0;
        instance = null;
    }
    
	@Override
	public Panel createPanel() {
		return new Word00Panel();
	}

	@Override
	public Button createButton() {
		return new Word00Button();
	}

	@Override
	public TextBox createTextbox() {
		return new Word00TextBox();
	}

}
