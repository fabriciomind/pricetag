package pricetag;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pricetag.util.Config;

public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class.getName());

	public static void main(String[] args) {

		try {
			reloadConfig();
				new Main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void reloadConfig() throws FileNotFoundException, IOException {
		Config.loadConfig();
	}

	public Main(String[] args) throws Exception {

		showGui();
	}

	private void showGui() {
		// SwingUtilities.invokeLater(() -> new PricetagFrame(Main.this,
		// query));
	}
}