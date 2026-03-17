package org.com.snippetvault.repository

import org.com.snippetvault.model.Snippet
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface SnippetRepository: JpaRepository<Snippet, UUID> {
}