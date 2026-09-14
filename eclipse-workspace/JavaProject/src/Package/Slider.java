package Package;

public class Slider {

	public static void main(String[] args) {
		int sliderMin = 0;
		int sliderMax = 100;
		int minPrice = 0;
		int maxPrice = 100000;

		int lowerSliderValue = 25;

		int lowerRangePrice = minPrice + (lowerSliderValue * (maxPrice - minPrice)) / (sliderMax - sliderMin);
		System.out.println("Lower Range Price: ₹" + lowerRangePrice);


	}

}
