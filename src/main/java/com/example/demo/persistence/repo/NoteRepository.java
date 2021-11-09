package com.example.demo.persistence.repo;

import com.example.demo.persistence.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
