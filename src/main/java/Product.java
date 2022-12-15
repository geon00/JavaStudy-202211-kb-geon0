import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder

@AllArgsConstructor

public class Product {

	private int serialNumber;

	private String productType;

	private String productName;

	private int price;

	public static void main(String[] args) {

		Product product = Product.builder()

				.serialNumber(2001)

				.productType("laptop")

				.productName("Samsung GalaxyBook")

				.price(1400000)

				.build();

		System.out.println(product);

		GsonBuilder gsonBuilder = new GsonBuilder();

		Gson gson = gsonBuilder.setPrettyPrinting().create();

		String json = gson.toJson(product);

		System.out.println(json);

	}

}