package com.pi.big.bodong.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val no: Long = -1,
        val id: String)