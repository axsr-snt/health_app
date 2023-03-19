package com.fitpath.app.controllers

import com.fitpath.app.dto.UserDTO
import com.fitpath.app.entities.UserEntity
import com.fitpath.app.services.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (private val userService: UserService){
    @PostMapping("/create")
    fun createUser(@RequestBody userDTO: UserDTO): UserEntity {
        return userService.createUser(userDTO)
    }
}