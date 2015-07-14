package main;

public class FormulaConstants {
	private double woodResourcePrice;
	private double stoneResourcePrice;
	private double fiberResourcePrice;

	private double[] carpenterLaborPrices;
	private double[] weaverLaborPrices;
	private double[] masonLaborPrices;

	private double fineItemMultiplier;
	private double basicResourceMultiplier;
	private double nonBasicResourceMultiplier;

	public double getWoodResourcePrice() {
		return woodResourcePrice;
	}

	public double getStoneResourcePrice() {
		return stoneResourcePrice;
	}

	public double getFiberResourcePrice() {
		return fiberResourcePrice;
	}

	public double[] getCarpenterLaborPrices() {
		return carpenterLaborPrices;
	}

	public double[] getWeaverLaborPrices() {
		return weaverLaborPrices;
	}

	public double[] getMasonLaborPrices() {
		return masonLaborPrices;
	}

	public double getFineItemMultiplier() {
		return fineItemMultiplier;
	}

	public double getBasicResourceMultiplier() {
		return basicResourceMultiplier;
	}

	public double getNonBasicResourceMultiplier() {
		return nonBasicResourceMultiplier;
	}

	public void setWoodResourcePrice(double woodResourcePrice) {
		this.woodResourcePrice = woodResourcePrice;
	}

	public void setStoneResourcePrice(double stoneResourcePrice) {
		this.stoneResourcePrice = stoneResourcePrice;
	}

	public void setFiberResourcePrice(double fiberResourcePrice) {
		this.fiberResourcePrice = fiberResourcePrice;
	}

	public void setCarpenterLaborPrices(double[] carpenterLaborPrices) {
		this.carpenterLaborPrices = carpenterLaborPrices;
	}

	public void setWeaverLaborPrices(double[] weaverLaborPrices) {
		this.weaverLaborPrices = weaverLaborPrices;
	}

	public void setMasonLaborPrices(double[] masonLaborPrices) {
		this.masonLaborPrices = masonLaborPrices;
	}

	public void setFineItemMultiplier(double fineItemMultiplier) {
		this.fineItemMultiplier = fineItemMultiplier;
	}

	public void setBasicResourceMultiplier(double basicResourceMultiplier) {
		this.basicResourceMultiplier = basicResourceMultiplier;
	}

	public void setNonBasicResourceMultiplier(double nonBasicResourceMultiplier) {
		this.nonBasicResourceMultiplier = nonBasicResourceMultiplier;
	}
}
