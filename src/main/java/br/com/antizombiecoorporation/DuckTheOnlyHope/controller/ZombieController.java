package br.com.antizombiecoorporation.DuckTheOnlyHope.controller;

import br.com.antizombiecoorporation.DuckTheOnlyHope.business.ZombieBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/getCombatStrategy/{zombieId}")
    public ResponseEntity<?> getAll(@PathVariable Long zombieId) {
        try {
            return ResponseEntity.ok(zombieBO.getCombatStrategy(zombieId));
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
