package com.guiga.RevisaoRecycleView.model

import javax.security.auth.Subject

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var date: String = ""
    var preview: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build(): Email = Email (user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "facebook"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "31 Dez"

    },

    email {
        user = "You Tube"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram "
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "31 Dez"

    },

    email {
        user = "You Tube"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram "
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "31 Dez"

    },

    email {
        user = "You Tube"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram "
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "31 Dez"

    },

    email {
        user = "You Tube"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    },

    email {
        user = "Instagram "
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Guilherme você precisa ver esse vídeo"
        date = "01 jan"

    }
)