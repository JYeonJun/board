package com.study.board.controller;

import com.study.board.dto.ResponseDto;
import com.study.board.dto.SignUpDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signUp")
    public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody) {
        return null;
    }
}
