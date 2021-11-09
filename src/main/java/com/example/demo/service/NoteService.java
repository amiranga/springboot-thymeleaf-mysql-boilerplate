package com.example.demo.service;

import com.example.demo.exception.NoteIdMismatchException;
import com.example.demo.exception.NoteNotFoundException;
import com.example.demo.persistence.model.Note;
import com.example.demo.persistence.repo.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Iterable<Note> findAll() {
        return noteRepository.findAll();
    }

    public Note findNote(long id) throws NoteNotFoundException {
        return noteRepository.findById(id)
                .orElseThrow(NoteNotFoundException::new);
    }

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public void deleteNote(long id) throws NoteNotFoundException {
        noteRepository.findById(id)
                .orElseThrow(NoteNotFoundException::new);
        noteRepository.deleteById(id);
    }


    public Note updateNote(Note note, long id) throws NoteIdMismatchException, NoteNotFoundException {
        if (note.getId() != id) {
            throw new NoteIdMismatchException();
        }
        noteRepository.findById(id)
                .orElseThrow(NoteNotFoundException::new);
        return noteRepository.save(note);
    }
}
