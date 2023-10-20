package br.com.antizombiecoorporation.DuckTheOnlyHope.controller;

import br.com.antizombiecoorporation.DuckTheOnlyHope.business.HostBO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.HostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Willian Scaquett
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/host")
public class HostController {

    @Autowired
    HostBO hostBO;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody HostDTO hostDTO) {
        try {
            log.info("add init", hostDTO);
            return ResponseEntity.ok(hostBO.add(hostDTO));
        } catch (IllegalArgumentException e) {
            log.error("something happened there", e);
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            log.error("something happened here", e);
            return ResponseEntity.internalServerError().build();
        } finally {
            log.info("add end");
        }
    }
}
