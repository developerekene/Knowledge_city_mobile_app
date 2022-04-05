package com.example.knowledgecitymobileapp.Data

import com.example.knowledgecitymobileapp.Model.TitleAndDescription
import com.example.knowledgecitymobileapp.R

object ViewPagerDataClass {

    fun provideData() : MutableList<TitleAndDescription> {

        val profiles = mutableListOf<TitleAndDescription>()

        val profile1 = TitleAndDescription( "Courses", "The name Tic Tac Toe should actually be \"Tit Tat Toe\" which was what it was called in the 16th century. Tit means to slap and Tat is a retaliation (like Tit for Tat) - Toe is for 3 third piece in a row securing the winning combination 1")
        val profile2 = TitleAndDescription("Articles", "Experts believe the name tic-tac-toe came about sometime in the 1800s. That's when a popular game called either ticktack or tic-tac-toe was played by blindly throwing a pencil at a slate marked with numbers. Your score was tallied by counting the numbers hit with the pencil.")
        val profile3 = TitleAndDescription("Books", "Read and downlaoad from our wide varieties of Books. From Motivational, Story Books, Math Books, Journals, History, Educational and more. Knowledge City contains over 10,000 books ready at your disposal to help you gain the knowledge you need in any area of your life.")
        val profile4 = TitleAndDescription("Online Assessments", "Tic Tac Toe was brought to the digital world in 1952 as a game called “OXO.” Produced by Sandy Douglas, a British computer scientist, OXO became one of the first known video games that pit human players up against a computer opponent capable of playing perfect games.")
        val profile5 = TitleAndDescription("Tertiary/Primary Exams", "The first player to get exactly five in a row (not six or more) wins the game. This game is surprisingly complicated, despite its similarity to tic tac toe, and even has world championship tournaments. In tournaments, players use a 15x15 or a 19x19 board, but you can use any size of graph paper for this game.")

        profiles.addAll(listOf(profile1, profile2, profile3, profile4, profile5))

        return profiles
    }
}