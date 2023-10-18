package br.com.antizombiecoorporation.DuckTheOnlyHope.controller;

import br.com.antizombiecoorporation.DuckTheOnlyHope.business.ZombieBO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Willian Scaquett
 */
@Slf4j
@RestController
@RequestMapping("/host")
public class HostController {

    @Autowired
    ZombieBO zombieBO;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ZombieDTO zombieDTO) {
        try {
            return ResponseEntity.ok(zombieBO.add(zombieDTO));
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
