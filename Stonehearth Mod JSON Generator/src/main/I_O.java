package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.CraftableEntity;
import models.Entity;

import org.json.JSONArray;
import org.json.JSONObject;

public class I_O {
	public I_O(){}
	
	public List<Entity> getEntitiesFromJSON(String path) {
		File f = new File(path);
		StringBuilder stringBuilder = new StringBuilder();
		Scanner scan = null;

		try {
			scan = new Scanner(f);
			scan.useDelimiter("\n");
			while (scan.hasNext()) {
				stringBuilder.append(scan.next());
				stringBuilder.append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unable to read entity list file.");
		} finally {
			scan.close();
		}

		String json = stringBuilder.toString();
		JSONObject file = new JSONObject(json);
		JSONArray jsonEntities = file.getJSONArray("entities");
		List<Entity> entities = new ArrayList<Entity>();
		JSONObject obj = null;
		String name = "";
		boolean craftable = false;
		String entityPath = "";
		String recipePath = "";

		for (int i = 0; i < jsonEntities.length(); i++) {
			obj = jsonEntities.getJSONObject(i);
			name = obj.getString("name");
			craftable = obj.getBoolean("craftable");
			entityPath = obj.getString("entity_path");
			recipePath = obj.getString("recipe_path");
			if (craftable) {
				entities.add(new CraftableEntity(name, entityPath, recipePath));
			}
		}

		return entities;
	}
	
	public FormulaConstants loadFormulaConstantsFromJSON(String path) {
		File f = new File(path);
		StringBuilder stringBuilder = new StringBuilder();
		FormulaConstants constants = new FormulaConstants();
		Scanner scan = null;

		try {
			scan = new Scanner(f);
			scan.useDelimiter("\n");
			while (scan.hasNext()) {
				stringBuilder.append(scan.next());
				stringBuilder.append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unable to read formula constants file.");
		} finally {
			scan.close();
		}

		String json = stringBuilder.toString();
		JSONObject file = new JSONObject(json);
		JSONObject resourcePrices = file.getJSONObject("base_resource_prices");
		JSONObject laborPrices = file.getJSONObject("labor_prices");
		JSONObject multipliers = file.getJSONObject("multipliers");

		constants.setWoodResourcePrice(resourcePrices.getDouble("wood"));
		constants.setStoneResourcePrice(resourcePrices.getDouble("stone"));
		constants.setFiberResourcePrice(resourcePrices.getDouble("fiber"));

		JSONArray carpenterLaborPrices = laborPrices.getJSONArray("carpenter");
		JSONArray weaverLaborPrices = laborPrices.getJSONArray("weaver");
		JSONArray masonLaborPrices = laborPrices.getJSONArray("mason");

		double[] temp = new double[carpenterLaborPrices.length()];
		for (int i = 0; i < carpenterLaborPrices.length(); i++) {
			temp[i] = carpenterLaborPrices.getDouble(i);
		}
		constants.setCarpenterLaborPrices(temp);
		temp = new double[weaverLaborPrices.length()];
		for (int i = 0; i < weaverLaborPrices.length(); i++) {
			temp[i] = weaverLaborPrices.getDouble(i);
		}
		constants.setWeaverLaborPrices(temp);
		temp = new double[masonLaborPrices.length()];
		for (int i = 0; i < masonLaborPrices.length(); i++) {
			temp[i] = masonLaborPrices.getDouble(i);
		}
		constants.setMasonLaborPrices(temp);

		constants.setFineItemMultiplier(multipliers.getDouble("fine_item"));
		constants.setBasicResourceMultiplier(multipliers.getDouble("basic_resource"));
		constants.setNonBasicResourceMultiplier(multipliers.getDouble("non_basic_resource"));
		return constants;
	}
}
