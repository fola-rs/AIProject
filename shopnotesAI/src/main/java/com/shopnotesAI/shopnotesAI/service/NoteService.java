package com.shopnotesAI.shopnotesAI.service;

import com.shopnotesAI.shopnotesAI.model.Note;
import com.shopnotesAI.shopnotesAI.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    public void delete(Long id) {
        noteRepository.deleteById(id);
    }
}