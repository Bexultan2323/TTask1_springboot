package com.example.Task1_springboot.controller;

import com.example.Task1_springboot.repository.GroupRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    private final GroupRepository groupRepository;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @GetMapping("/api/groups")
    public ResponseEntity<?> getGroups() {
        return ResponseEntity.ok(groupRepository.findAll());
    }

}
