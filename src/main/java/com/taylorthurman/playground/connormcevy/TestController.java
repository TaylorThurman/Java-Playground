package com.taylorthurman.playground.connormcevy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @PostMapping("/active/copay")
    public ResponseEntity<CopayRow> processCopayFile(@RequestBody CopayRow file) {
        System.out.println(file);
        return ResponseEntity.ok(file);
    }

    @PostMapping("/active/copay1")
    public void processCopayFile1(@RequestBody Map<String, String> file) {
        System.out.println(file);
    }
}
