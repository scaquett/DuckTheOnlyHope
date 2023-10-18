package br.com.antizombiecoorporation.DuckTheOnlyHope.controller;

import br.com.antizombiecoorporation.DuckTheOnlyHope.business.ZombieBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Willian Scaquett
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/zombie")
public class ZombieController {

    @Autowired
    ZombieBO zombieBO;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(zombieBO.getAll());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
