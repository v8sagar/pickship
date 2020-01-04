
package com.pickship.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author v8sagar
 */
@Controller
public class RedirectToSwaggerUIController {
	@GetMapping("/")
	public String getRoot() {
		return "redirect:/swagger-ui.html";
	}
}
