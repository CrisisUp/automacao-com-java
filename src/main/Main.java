package main;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.Region;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static Screen screen = new Screen();
	public static void main(String[] args) {
		//teclarBotaoWindows();
		//executarAtalho(Arrays.asList(Key.WIN, "r"));
		moverMouseNaTela(400, 34, true);
		
		//System.out.println(screen.getNumberScreens());
		//System.out.println(Screen.getScreen(0));
	}
	
	private static void moverMouseNaTela(int x, int y, boolean clicar) {
		Region region = new Region(x, y);
		region.hover();
		screen.wait(2d);
		if (clicar) {region.click();}
	}
	
	private static void executarAtalho(List<String> teclas) {
		screen.wait(2d);
		teclas.forEach(t -> screen.keyDown(t));
		teclas.forEach(t -> screen.keyUp(t));
	}
	
	private static void teclarBotaoWindows() {
		screen.keyDown(Key.WIN);
		screen.keyUp(Key.WIN);
	}
}
