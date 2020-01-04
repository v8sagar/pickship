
package com.pickship.impl.api.v1;

import com.pickship.api.v1.TemplateAPIException;
import com.pickship.api.v1.TemplateAPIV1;
import com.pickship.api.v1.TemplateInformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pickship.impl.service.TemplateService;
import com.pickship.impl.service.TemplateServiceException;

/**
 * @author v8sagar
 */
@Slf4j
@RestController
public class TemplateAPIV1Controller implements TemplateAPIV1 {
	private final TemplateService templateService;

	@Autowired
	public TemplateAPIV1Controller(TemplateService templateService) {
		this.templateService = templateService;
	}

	@Override
	public TemplateInformation getTemplateInformation() throws TemplateAPIException {
		try {
			return templateService.retrieveTemplateInformation();
		} catch (TemplateServiceException e) {
			log.error(e.getMessage(), e);

			throw new TemplateAPIException(e.getMessage(), e);
		}
	}
}
