package models;

public class CraftableEntity extends Entity {
	private String recipeFilePath;

	public CraftableEntity(String name, String filePath, String recipeFilePath) {
		this.name = name;
		this.filePath = filePath;
		this.recipeFilePath = recipeFilePath;
		isCraftable = true;
		netWorth = -1;
	}
}
