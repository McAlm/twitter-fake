package org.camunda.demo.twitterfake.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Status is duplicate")
public class DuplicateTweetException extends RuntimeException {
}
