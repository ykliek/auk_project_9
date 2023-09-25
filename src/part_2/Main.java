package part_2;

public class Main {
	public static void main(String[] args) {
		// Creating several objects of the TriviaNight class with different property values
		TriviaNights trivia1 = new TriviaNights("PubQuiz: City Lake Edition", "28-09-2023", 55, "Multi theme quiz",
				"https://forms.gle/1fw8KsVMydjVpjWe9", "https://t.me/+WunP3E1i7PJhOTcy", "https://maps.app.goo.gl/rU4wNv8BMEsuot7NA", "description.txt");

		TriviaNights trivia2 = new TriviaNights("PubQuiz: City Lake Edition", "05-10-2023", 0, "Historical quiz",
				"Soon", "https://t.me/+WunP3E1i7PJhOTcy", "https://maps.app.goo.gl/rU4wNv8BMEsuot7NA", "description.txt");

		System.out.println("Original Register URL: " + trivia1.getRegisterUrl());
		trivia1.setRegisterUrl("https://forms.gle/1fw8KsVMydjVpjWe9");
		System.out.println("Updated Register URL: " + trivia1.getRegisterUrl());
		trivia1.describeEvent();

		System.out.println("-------------");

		System.out.println("Original Chat URL: " + trivia2.getChatUrl());
		trivia2.setChatUrl("https://t.me/+WunP3E1i7PJhOTcy");
		System.out.println("Updated Chat URL: " + trivia2.getChatUrl());
		trivia2.describeEvent();
	}
}
