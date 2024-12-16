package com.assignment2.word.AbstractFactory.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.ConcreteFactory.Word00Factory;
import com.assignment2.word.ConcreteFactory.Word10Factory;
import com.assignment2.word.ConcreteFactory.Word21Factory;
import com.assignment2.word.ConcreteFactory.Word90Factory;
import com.assignment2.word.FactoryProducer.GuiWordFactoryCreator;
import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;

public class GuiWordDemo {

		private static void resetAllFactories() {
	        Word90Factory.resetCount();
	        Word00Factory.resetCount();
	        Word10Factory.resetCount();
	        Word21Factory.resetCount();
	    }
	    
	    public static void main(String[] args) {
	        String filename = "config.txt"; //specify the location of the file
	        
	        try {
	            // Creating file if it doesn't exist
	            if (!new File(filename).exists()) {
	                try (PrintWriter writer = new PrintWriter(filename)) {
	                    writer.println("Word90");
	                    writer.println("Word00");
	                    writer.println("Word90");
	                    writer.println("Word21");
	                    writer.println("Word10");
	                    writer.println("Word00");
	                    writer.println("Word21");
	                    writer.println("Word90");
	                    writer.println("Word00");
	                }
	            }
	            
	            // Reset factory counts to zero at the start of run
	            resetAllFactories();
	            
	            // Read and process file
	            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    try {
	                        GuiFactoryWord factory = GuiWordFactoryCreator.createFactory(line.trim());
	                        
	                        System.out.println("\nCalling " + line.trim() + " components:");
	                        Panel panel = factory.createPanel();
	                        Button button = factory.createButton();
	                        TextBox textbox = factory.createTextbox();
	                        
	                        panel.display();
	                        button.display();
	                        textbox.display();
	                        
	                    } catch (IllegalArgumentException e) {
	                        System.out.println(e.getMessage());
	                    }
	                }
	            }
	            
	        } catch (IOException e) {
	            System.out.println("Error Occurred while processing file: " + e.getMessage());
	        }
	    }

}
