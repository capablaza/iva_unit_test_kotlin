package com.example.ivaapp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class IvaAppTest{


    @Test
    fun givenAmountWhenTheValueIs2500andRateIs19ThenTheResultIs475(){
        //prepare
        val iva = Iva()
        val amount = 2500
        val rate = 19
        val expected = 475

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertTrue(result > 0)
        assertEquals(result, expected)

    }


    @Test
    fun givenAmountWhenTheValueIs3400andRateIs25ThenTheResultIs850(){
        //prepare
        val iva = Iva()
        val amount = 3400
        val rate = 25
        val expected = 850

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertTrue(result > 0)
        assertEquals(result, expected)
    }

    @Test
    fun givenAmountWhenTheValueIs0andRateIs25ThenTheResultIsZero(){
        //prepare
        val iva = Iva()
        val amount = 0
        val rate = 25
        val expected = 0

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertEquals(result, expected)
    }

    @Test
    fun givenAmountWhenTheValueIs3400andRateIs0ThenTheResultIsZero(){
        //prepare
        val iva = Iva()
        val amount = 3400
        val rate = 0
        val expected = 0

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertEquals(result, expected)
    }

    @Test
    fun givenAmountWhenTheValueIsNegativeThenTheResultIsZero(){
        //prepare
        val iva = Iva()
        val amount = -3400
        val rate = 10
        val expected = 0

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertEquals(result, expected)
    }

    @Test
    fun givenRateWhenTheValueIsNegativeThenTheResultIsZero(){
        //prepare
        val iva = Iva()
        val amount = 3400
        val rate = -10
        val expected = 0

        //act
        val result = iva.generate(amount, rate)

        //assert
        assertEquals(result, expected)
    }

}