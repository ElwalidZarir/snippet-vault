package org.com.snippetvault.service

import org.com.snippetvault.dto.SnippetDTO
import org.com.snippetvault.model.Snippet
import org.com.snippetvault.repository.SnippetRepository
import org.springframework.stereotype.Service

@Service
class SnippetService(private val snippetRepository: SnippetRepository) {
	fun createSnippet(snippetDto: SnippetDTO): SnippetDTO {
		val snippet = Snippet().apply { this.code = snippetDto.code }
		return snippetRepository.save(snippet).toDto()
	}
}