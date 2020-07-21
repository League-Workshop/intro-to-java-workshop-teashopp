package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("mandlebrot");
		// 2. Catch the user's answer in a String
		String ans0 = JOptionPane.showInputDialog(null, "Spell what you just heard:");
		// 3. If the user spelled the word correctly, speak "correct"
		if (ans0.equalsIgnoreCase("mandelbrot")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		// 5. repeat the process for other words
		
		
		speak("sköldpadda");
		
		String ans1 = JOptionPane.showInputDialog(null, "Spell what you just heard:");
		
		if (ans1.equalsIgnoreCase("sköldpadda")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		
		speak("Nietzsche");
		
		String ans2 = JOptionPane.showInputDialog(null, "Spell what you just heard:");
		
		if (ans2.equalsIgnoreCase("Nietzsche")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		
	}

	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


