package com.study.board.controller;

import com.study.board.dto.ResponseDto;
import com.study.board.dto.SignUpDto;
import com.study.board.dto.SignUpResponseDto;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signUp")
    public ResponseDto<SignUpResponseDto> signUp(@RequestBody SignUpDto requestBody) {
        System.out.println(requestBody.toString());
        return null;
    }
}
