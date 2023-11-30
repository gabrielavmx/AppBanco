package com.example.appbanco.model

import com.example.appbanco.controller.Tipos
import com.example.appbanco.controller.Contato

data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val sobrenome: String = "",
    val telefone: String = "",
    val adicionarContato: Boolean = false,
    val tipos: Tipos = Tipos.nome
)
