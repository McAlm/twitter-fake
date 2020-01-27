package org.camunda.demo.twitterfake.domain;

public class Tweet {

	private String toTweet;

	public Tweet(String toTweet) {
		this.toTweet = toTweet;
	}

	public String getToTweet() {
		return toTweet;
	}

	public void setToTweet(String toTweet) {
		this.toTweet = toTweet;
	}

}
