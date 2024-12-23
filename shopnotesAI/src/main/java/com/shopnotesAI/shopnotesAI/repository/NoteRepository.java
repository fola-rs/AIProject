package com.shopnotesAI.shopnotesAI.repository;

import com.shopnotesAI.shopnotesAI.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
