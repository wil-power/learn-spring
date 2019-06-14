package com.wilsomani.demospringkotlin2.model


@Entity
class Book(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var title: String = "",
        var isbn: String = "",
        @OneToOne
        var publisher: Publisher,
        @ManyToMany
        @JoinTable(name = "author_book", joinColumns = [JoinColumn(name = "book_id")],
                inverseJoinColumns = [JoinColumn(name = "author_id")])
        var authors: Set<Author> = setOf()
) {

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Book

                if (id != other.id) return false

                return true
        }

        override fun hashCode(): Int {
                return id.hashCode()
        }

        override fun toString(): String {
                return "Book(id=$id, title=$title, isbn=$isbn, publisher=$publisher, authors=$authors)"
        }


}
