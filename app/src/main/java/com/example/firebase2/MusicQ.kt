package com.example.firebase2

object MusicQ {
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "In 2017 Luis Fonsi topped the chart with which song?",
            "Despacito",
            "Gangnam Style",
            "Shape of You",
            "Nonstop",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Which Drake song broke records in 2016?",
            "Hotline Bling",
            "Money In The Grave",
            "God's Plan",
            "One Dance",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which classical composer was deaf?",
            "Claude Debussy",
            "Frédéric Chopin",
            "Franz Liszt",
            "Ludvig van Beethoven",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Who was the first lead guitarist of Metallica?",
            "Cliff Burton",
            "Dave Mustaine",
            "Lars Ulrich",
            "Kirk Hammett",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Which singer has had a No. 1 hit in each of the last four decades?",
            "Michael Jackson",
            "Mariah Carey",
            "George Michael",
            "Beyoncé",
            2
        )
        questionsList.add(que5)
        return questionsList
    }
}