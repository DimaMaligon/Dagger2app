package com.example.dagger2app

class Processor {
    override fun toString() =  "Ab1221"
}

class MotherCard {
    override fun toString() =  "Mth 1221"
}

class Ram {
    override fun toString() =  "Ram 16"
}

data class Computer(
    val processor: Processor,
    val motherCard: MotherCard,
    val ram: Ram
)