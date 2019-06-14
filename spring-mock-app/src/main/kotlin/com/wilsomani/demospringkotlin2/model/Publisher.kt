package com.wilsomani.demospringkotlin2.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Publisher(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var Id: Long = 0,
        var name: String,
        var address: String
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Publisher

        if (Id != other.Id) return false

        return true
    }

    override fun hashCode(): Int {
        return Id.hashCode()
    }

    override fun toString(): String {
        return "Publisher(Id=$Id, name='$name', address='$address')"
    }


}