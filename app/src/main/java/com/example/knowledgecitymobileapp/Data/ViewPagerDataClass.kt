package com.example.knowledgecitymobileapp.Data

import com.example.knowledgecitymobileapp.Model.TitleAndDescription
import com.example.knowledgecitymobileapp.R

object ViewPagerDataClass {

    fun provideData() : MutableList<TitleAndDescription> {

        val profiles = mutableListOf<TitleAndDescription>()

        val profile1 = TitleAndDescription( "Courses", "Find your perfect program, with Knowledge City you can improve your skills gradually by taking courses which will help you in becoming a better version of yourself.")
        val profile2 = TitleAndDescription("Articles", "Show case your writing skills to the world. There are over 10,000 people on Knowledge city waiting to read what you have to say, like and share your thoughts.")
        val profile3 = TitleAndDescription("Books", "Read and downlaoad from our wide varieties of Books. From Motivational, Story Books, Math Books, Journals, History, Educational and more. Knowledge City contains over 10,000 books ready at your disposal to help you gain the knowledge you need in any area of your life.")
        val profile4 = TitleAndDescription("Online Assessments", "You can now test you skill on various fields. Be it Tech, Agriculture, Finance, Game Development, Education, Culture and many more.")
        val profile5 = TitleAndDescription("Tertiary/Primary Exams", "The only platform that gives you an opportunity while still in school to take your exams online even if you are not physically present in the school environment.")

        profiles.addAll(listOf(profile1, profile2, profile3, profile4, profile5))

        return profiles
    }
}