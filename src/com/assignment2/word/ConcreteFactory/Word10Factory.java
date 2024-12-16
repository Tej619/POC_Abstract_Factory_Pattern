package com.assignment2.word.ConcreteFactory;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;
import com.assignment2.word.components.implementation.Word10Button;
import com.assignment2.word.components.implementation.Word10Panel;
import com.assignment2.word.components.implementation.Word10TextBox;

public class Word10Factory extends GuiFactoryWord {

	private static Word10Factory instance;
	private static int count = 0;

	private Word10Factory() {
	}

	public static synchronized Word10Factory getInstance() {
		if (count >= MAX_INSTANCES) {
			System.out.println("Warning: Word10 has exceeded maximum allowed instances (" + MAX_INSTANCES + ") and has current instance ("+(count+1)+")");
		}
		if (instance == null) {
			instance = new Word10Factory();
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
		return new Word10Panel();
	}

	@Override
	public Button createButton() {
		return new Word10Button();
	}

	@Override
	public TextBox createTextbox() {
		return new Word10TextBox();
	}

}
