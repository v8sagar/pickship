
package com.pickship.impl.service;

import com.pickship.api.v1.TemplateInformation;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author v8sagar
 */
@Service
public class TemplateService {
	private int invocations = 0;

	public TemplateInformation retrieveTemplateInformation() throws TemplateServiceException {
		if((++invocations) % 3 == 0) {
			throw new TemplateServiceException("error at " + invocations);
		}
		return new TemplateInformation(UUID.randomUUID().toString());
	}
}
