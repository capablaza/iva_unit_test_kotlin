package com.example.ivaapp

class Iva {

    fun generate(amount: Int, rate: Int): Int {

        if (amount <= 0 || rate <= 0) return 0;

        return (amount * rate) / 100;
    }

}