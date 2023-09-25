package part_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TriviaNights {
	private String eventName;
	private String eventDate;
	private int numberOfParticipants;
	private String mainTheme;
	private String registerUrl;
	private String chatUrl;
	private String eventLocation;
	private String eventDescription;

	// Constructor with initial values for the main properties
	public TriviaNights(String eventName, String eventDate, int numberOfParticipants, String mainTheme,
	                   String registerUrl, String chatUrl, String eventLocation, String descriptionFilePath) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.numberOfParticipants = numberOfParticipants;
		this.mainTheme = mainTheme;
		this.registerUrl = registerUrl;
		this.chatUrl = chatUrl;
		this.eventLocation = eventLocation;
		// Read event description from a file
		this.eventDescription = readDescriptionFromFile(descriptionFilePath);
	}

	// Read event description from file
	private String readDescriptionFromFile(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				contentBuilder.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Error reading the description file.";
		}
		return contentBuilder.toString();
	}

	public String getRegisterUrl() {
		return registerUrl;
	}

	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
	}

	public String getChatUrl() {
		return chatUrl;
	}

	public void setChatUrl(String chatUrl) {
		this.chatUrl = chatUrl;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	// Method to output the full description of the object
	public void describeEvent() {
		System.out.println("Event Name: " + eventName);
		System.out.println("Event Date: " + eventDate);
		System.out.println("Number of Participants: " + numberOfParticipants);
		System.out.println("Main Theme: " + mainTheme);
		System.out.println("Register URL: " + registerUrl);
		System.out.println("Chat URL: " + chatUrl);
		System.out.println("Event Location: " + eventLocation);
		System.out.println("Event Description: " + eventDescription);
	}
}
