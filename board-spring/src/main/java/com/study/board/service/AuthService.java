package com.study.board.service;

import com.study.board.dto.ResponseDto;
import com.study.board.dto.SignUpDto;
import com.study.board.entity.UserEntity;
import com.study.board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// TODO: 서비스 인터페이스 구현
@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public ResponseDto<?> signUp(SignUpDto dto) {
        String userEmail = dto.getUserEmail();
        String userPassword = dto.getUserPassword();
        String userPasswordCheck = dto.getUserPasswordCheck();

        // email 중복 확인
        try {
            if (userRepository.existsById(userEmail)) {
                return ResponseDto.setFailed("Existed Email!");
            }
        } catch (Exception e) {
            return ResponseDto.setFailed("Data Base Error!");
        }

        // 비밀번호가 서로 다르면 failed response 반환!
        if (!userPasswordCheck.equals(userPasswordCheck)) {
            return ResponseDto.setFailed("Password does not matched");
        }

        // UserEntity 생성
        UserEntity userEntity = new UserEntity(dto);

        // UserRepository를 이용해 데이터베이스에 Entity 저장!!
        try {
            userRepository.save(userEntity);
        } catch (Exception e) {
            return ResponseDto.setFailed("Data Base Error!");
        }

        // 성공시 success response 반환
        return ResponseDto.setSuccess("SignUp Success!", null);
    }
}
