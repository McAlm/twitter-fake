package org.camunda.demo.twitterfake.rest;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TweetController {

	private static Logger LOG = Logger.getLogger(TweetController.class);

	private List<String> tweets = new ArrayList<String>();

	@PostMapping("/tweet")
	public String createTweet(@RequestParam("tweet") String tweet) throws DuplicateTweetException {
		if (tweets.contains(tweet)) {
			LOG.warn("Duplicate tweet content detected, will deny publishing!");
			throw new DuplicateTweetException();
		}

		tweets.add(tweet);
		LOG.info("Accepted new tweet: \n\t" + tweet);
		return "OK";
	}
}