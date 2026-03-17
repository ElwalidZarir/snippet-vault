package org.com.snippetvault.controller

import org.com.snippetvault.dto.SnippetDTO
import org.com.snippetvault.service.SnippetService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/snippet")
class SnippetController(val snippetService: SnippetService) {
	@PostMapping
	fun createSnippet(@RequestBody snippetDTO: SnippetDTO): SnippetDTO {
	    return snippetService.createSnippet(snippetDTO)
	}
}