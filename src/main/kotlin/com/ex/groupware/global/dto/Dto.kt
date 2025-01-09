package com.ex.groupware.global.dto

interface Dto<E> {
    fun toEntity(): E
}