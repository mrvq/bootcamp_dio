package com.seuapp.controller;

import com.seuapp.model.Board;
import com.seuapp.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardRepository boardRepo;

    @GetMapping
    public List<Board> getAllBoards() {
        return boardRepo.findAll();
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardRepo.save(board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardRepo.deleteById(id);
    }
}