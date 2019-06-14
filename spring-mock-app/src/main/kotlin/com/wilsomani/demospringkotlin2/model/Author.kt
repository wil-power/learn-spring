package com.wilsomani.demospringkotlin2.model

import javax.persistence.*

@Entity
class Author(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var firstName: String = "",
        var lastName: String = "",
        @ManyToMany(mappedBy = "authors")
        var books: Set<Book> = setOf()
) {

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Author

                if (id != other.id) return false

                return true
        }

        override fun hashCode(): Int {
                return id.hashCode()
        }

        override fun toString(): String {
                return "Author(id=$id, firstName=$firstName, lastName=$lastName, books=$books)"
        }


}