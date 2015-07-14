package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import models.CraftableEntity;
import models.Entity;

public class ComputeNetWorthValues {
	private final static String DIVIDER = System.getProperty("file.separator");
	private final static String IN_FILE_PATH = "files" + DIVIDER + "in" + DIVIDER;
	private final static String ENTITY_LIST_FILE_PATH = IN_FILE_PATH + "entities.json";
	private final static String FORMULA_CONSTANTS_FILE_PATH = IN_FILE_PATH
		+ "formula_constants.json";

	public static void main(String[] args) {
		// Input input = new Input(args);
		I_O i_o = new I_O();
		List<Entity> entities = i_o.getEntitiesFromJSON(ENTITY_LIST_FILE_PATH);
		FormulaConstants constants = i_o.loadFormulaConstantsFromJSON(FORMULA_CONSTANTS_FILE_PATH);

		for (Entity e : entities) {
			computePrice(e, constants);
		}
	}

	private static void computePrice(Entity entity, FormulaConstants constants) {
		// Only compute each item's worth once.
		if (entity.getNetWorth() > 0) { return; }

		// get minimum level

		// get required materials

		// Compute
		double netWorth = 0.0 * 0.0;

		// Save value
		entity.setNetWorth((int) Math.ceil(netWorth));
	}
}
