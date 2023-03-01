package com.study.board.controller;

import com.study.board.dto.ResponseDto;
import com.study.board.dto.SignInDto;
import com.study.board.dto.SignInResponseDto;
import com.study.board.dto.SignUpDto;
import com.study.board.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signUp")
    public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody) {
        ResponseDto<?> result = authService.signUp(requestBody);
        return result;
    }

    @PostMapping("/signIn")
    public ResponseDto<SignInResponseDto> signIn(@RequestBody SignInDto requestBody) {

        ResponseDto<SignInResponseDto> result = authService.signIn(requestBody);
        return result;
    }
}
