package com.n1sp.springbootdemo.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class RegisterController {

    @PostMapping("/api/register")
    public ResponseEntity<String> registerUser(@RequestBody Map<String, Object> requestData) {
        // 受け取ったリクエストデータをコンソールに表示
        System.out.println("Received data: " + requestData);
        // 必要なデータが含まれているか確認（例として簡単なチェック）
        if (requestData.get("businessName") == null || requestData.get("businessContent") == null || requestData.get("toolsUsed") == null) {
            // エラーレスポンスを返す
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("リクエストデータが不足しています。");
        }

        // 正常な場合の処理（DBに登録するなどの処理をここで行うことができます）

        // 成功レスポンスを返す
        return ResponseEntity.ok("データが正常に登録されました！");
    }
}