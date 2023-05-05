package com.example.wishlist

class WishFetcher {

    val name : String = ""
    val cost : String = ""
    val desc : String = ""

    fun getWishes(): MutableList<Wish> {
        var wishes : MutableList<Wish> = ArrayList()
        for (i in 0..9) {
            val wish = Wish(name[i], cost, desc)
            wishes.add(wish)
        }
        return wishes
    }

    fun getNext5Wishes(): MutableList<Wish> {
        var newWishes : MutableList<Wish> = ArrayList()
        for (i in 10..14) {
            val wish = Wish(name[i], cost, desc)
            newWishes.add(wish)
        }
        return newWishes
    }
}