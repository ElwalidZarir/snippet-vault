package org.com.snippetvault.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.com.snippetvault.dto.SnippetDTO
import java.util.UUID

@Entity
class Snippet {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	var id: UUID? = null
	
	@Column(name =  "code")
	var code: String? = null
	
	fun toDto(): SnippetDTO {
		return SnippetDTO(
			this.code
		)
	}
}