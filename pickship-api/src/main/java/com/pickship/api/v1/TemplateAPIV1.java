
package com.pickship.api.v1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author v8sagar
 */
@FeignClient("templateV1")
public interface TemplateAPIV1 {
	@GetMapping("/api/template/V1/info")
	TemplateInformation getTemplateInformation() throws TemplateAPIException;
}
