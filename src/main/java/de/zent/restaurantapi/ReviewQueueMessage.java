package de.zent.restaurantapi;

import java.net.URI;

import org.joda.time.DateTime;

public class ReviewQueueMessage {
	private final String name;
	private final String email;
	private final String comment;
	private final URI imageUri;
	private final DateTime reviewedOn;

	public ReviewQueueMessage(String name, String email, String comment, URI imageUri, DateTime reviewedOn) {
		this.name = name;
		this.email = email;
		this.comment = comment;
		this.imageUri = imageUri;
		this.reviewedOn = reviewedOn;
	}
	
	public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }

    public URI getImageUri() {
        return imageUri;
    }

    public DateTime getReviewedOn() {
        return reviewedOn;
    }
}
