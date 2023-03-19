package com.fitpath.app.services

import com.fitpath.app.dto.UserDTO
import com.fitpath.app.entities.UserEntity
import com.fitpath.app.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun createUser(userDTO: UserDTO): UserEntity {
        val user = UserEntity(
            firstName = userDTO.firstName,
            lastName = userDTO.lastName,
            email = userDTO.email,
            avatarUrl = userDTO.avatarUrl
        )
        return userRepository.save(user)
    }

}