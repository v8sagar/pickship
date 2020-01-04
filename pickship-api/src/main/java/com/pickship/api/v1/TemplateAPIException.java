/**
 * Copyright: N! Inc 2020
 * Company: N! Inc,
 * v8
 * 04.01.2020
 */
package com.pickship.api.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author v8sagar
 */
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class TemplateAPIException
extends Exception {
	public TemplateAPIException(String message) {
		super(message);
	}

	public TemplateAPIException(String message, Throwable cause) {
		super(message, cause);
	}

	public TemplateAPIException(Throwable cause) {
		super(cause);
	}
}
